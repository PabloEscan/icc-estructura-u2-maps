import java.util.Arrays;

import controllers.Ejercicios;
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
        /*runMapExamlpe();
        runEmpleadoExample();*/
        runEjerccios();

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
    System.out.println("\n------Ejercicio 1: Anagramas------");
        System.out.println("Ejemplo 1:");
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("str1 = " + str1 + ", str2 = " + str2);
        boolean anagramas = Ejercicios.areAnagrams(str1, str2);
        System.out.println(anagramas);

        System.out.println("\nEjemplo 2:");
        String str1E2 = "hello";
        String str2E2 = "bello";
        System.out.println("str1 = " + str1E2 + ", str2 = " + str2E2);
        boolean anagramasE2 = Ejercicios.areAnagrams(str1E2, str2E2);
        System.out.println(anagramasE2);

        System.out.println("\nEjemplo 3:");
        String str1E3 = "triangle";
        String str2E3 = "integral";
        System.out.println("str1 = " + str1E3 + ", str2 = " + str2E3);
        boolean anagramasE3 = Ejercicios.areAnagrams(str1E3, str2E3);
        System.out.println(anagramasE3);

        System.out.println("\n------Ejercicio 2: Suma de dos números------");
        System.out.println("Ejemplo A:");
        int[] numsA = {9, 2, 3, 6};
        int objetivoA = 5;
        System.out.println("nums = " + Arrays.toString(numsA) + ", objetivo = " + objetivoA);
        int[] resultadoA = Ejercicios.sumatoriaDeDos(numsA, objetivoA);
        System.out.println("Resultado: " + Arrays.toString(resultadoA));

        System.out.println("\nEjemplo B:");
        int[] numsB = {9, 2, 3, 6};
        int objetivoB = 10;
        System.out.println("nums = " + Arrays.toString(numsB) + ", objetivo = " + objetivoB);
        int[] resultadoB = Ejercicios.sumatoriaDeDos(numsB, objetivoB);
        System.out.println("Resultado: " + Arrays.toString(resultadoB));

        System.out.println("\n------Ejercicio 3: Contar caracteres------");
        String texto = "hola";
        System.out.println("Texto = \"" + texto + "\"");
        Ejercicios.contarCaracteres(texto);

        System.out.println("\n------Ejercicio 4: Son anagramas (versión 2)------");
        String palabra1 = "roma";
        String palabra2 = "amor";
        System.out.println("palabra1 = " + palabra1 + ", palabra2 = " + palabra2);
        boolean resultado = Ejercicios.sonAnagramas(palabra1, palabra2);
        System.out.println("Resultado: " + resultado);

    }
} 
