package controllers;

import models.Empleado;

public class EmpleadoControllerTree {
    private EmpleadoDAO dao;

    public EmpleadoControllerTree(EmpleadoDAO dao) {
        this.dao = dao;
    }

    public void agregarEmpleado(Empleado emp) {
        dao.add(emp);
    }

    public void listEmpleados() {
        dao.list();
    }

    public void removeEmpleado(int id) {
        dao.remove(id);
    }
}
