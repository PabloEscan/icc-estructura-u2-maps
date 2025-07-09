package controllers;

import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO{
    private Map<Empleado, Empleado> empleados;
    
    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();
    }
    @Override
    public void add(Empleado emp) {
        empleados.put(emp, emp);
    }

    @Override
    public void list() {
        System.out.println("Lista de empleados (TreeMap):");
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
