import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoControllerHash;
import controllers.EmpleadoControllerTree;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("----Practica Mapas----");
        System.out.println("Nombre: Pablo Escandon"); /// Cambiar por su nombre
        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();
        runEmpleadoExample();

        // // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("------HashMap------");
        mapa.runHashMap();
        System.out.println("\n------LinledHashMap------");
        mapa.runLinkedHashMap();
        System.out.println("\n------TreeMap------");
        mapa.runTreeMap();
        System.out.println("\n------HashMap con objeto------");
        mapa.runHashMapObj();
        System.out.println("\n------TreeMap con objeto------");
        mapa.runTreeMapObj();
    }

    private static void runEmpleadoExample() {


        Empleado emp1 = new Empleado(4, "Pedro", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(5, "Juan", "DEV");
        Empleado emp4 = new Empleado(3, "Maria", "DEV");
        Empleado emp5 = new Empleado(1, "Juan", "DEV");

        System.out.println("\n--- Usando EmpleadoControllerHash ---");
        EmpleadoDAO empleadoDAOHash = new EmpleadoDAOHashMap();
        EmpleadoControllerHash empleadoControllerHash = new EmpleadoControllerHash(empleadoDAOHash);

        empleadoControllerHash.agregarEmpleado(emp1);
        empleadoControllerHash.agregarEmpleado(emp2);
        empleadoControllerHash.agregarEmpleado(emp3);
        empleadoControllerHash.agregarEmpleado(emp4);
        empleadoControllerHash.agregarEmpleado(emp5);
        empleadoControllerHash.listEmpleados();

        System.out.println("Post eliminar el id 2");
        empleadoControllerHash.removeEmpleado(2);
        empleadoControllerHash.listEmpleados();

        System.out.println("\n--- Usando EmpleadoControllerTree ---");
        EmpleadoDAO empleadoDAOTree = new EmpleadoDAOTreeMap();
        EmpleadoControllerTree empleadoControllerTree = new EmpleadoControllerTree(empleadoDAOTree);

        empleadoControllerTree.agregarEmpleado(emp1);
        empleadoControllerTree.agregarEmpleado(emp2);
        empleadoControllerTree.agregarEmpleado(emp3);
        empleadoControllerTree.agregarEmpleado(emp4);
        empleadoControllerTree.agregarEmpleado(emp5);
        empleadoControllerTree.listEmpleados();

        System.out.println("Post eliminar el id 2");
        empleadoControllerTree.removeEmpleado(2);
        empleadoControllerTree.listEmpleados();
        

    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
