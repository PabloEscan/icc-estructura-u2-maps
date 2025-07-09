package controllers;

import models.Empleado;

public class EmpleadoControllerHash {
    private EmpleadoDAO dao;

    public EmpleadoControllerHash(EmpleadoDAO dao) {
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
