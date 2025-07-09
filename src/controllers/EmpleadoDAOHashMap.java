package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO{
    private Map<Empleado, Empleado> empleados;
    
    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>();
    }
    
    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        System.out.println("Lista de empleados (HashMap):");
        for (Empleado emp : empleados.keySet()) {
            System.out.println(emp);
        }
    }

    @Override
    public void remove(int id) {
        Empleado temporal = new Empleado(id);
        empleados.remove(temporal);
    }
    
}
