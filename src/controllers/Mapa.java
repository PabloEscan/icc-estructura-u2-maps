package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class Mapa {
    public Mapa() {
        System.out.println("Mapa Class");
    }

    public void runHashMap(){
        //No garantisa el orden de ingreso
        Map<String, String> mapa = new HashMap<>();
        mapa.put("001", "Celular");
        mapa.put("002", "Laptop");
        mapa.put("003", "Celular");
        mapa.put("003", "PC");

        System.out.println(mapa);
        System.out.println(mapa.keySet());  //El set se asegura que sean key unicas
        for (String valor : mapa.keySet()) {
            System.out.println(mapa.get(valor));
        }
    }

    public void runLinkedHashMap(){
        Map<Integer, String> mapa = new LinkedHashMap<>();
        //Aegura el orden de entrada
        mapa.put(18, "Pablo");
        mapa.put(23, "Juan");
        mapa.put(9, "Samin");
        mapa.put(29, "Pedro");
        mapa.put(19, "Fabian");

        for(Integer clave: mapa.keySet()){
            System.out.println(mapa.get(clave));
        }
    }

    public void runTreeMap(){
        Map<Integer, String> items = new TreeMap<>();
        //Garantiza el orden como un arbol
        items.put(3, "Carro");
        items.put(6, "Bicicleta");
        items.put(1, "Moto");

        System.out.println(items);
    }

    public void runHashMapObj(){
        Map<Empleado, Integer> empleados = new HashMap<>();

        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(1, "Diego", "Dev"), 3000);

        System.out.println(empleados.keySet());
    }

    public void runTreeMapObj(){
        Map<Empleado, Integer> empleados = new TreeMap<>();
        empleados.put(new Empleado(1, "Juan", "Dev"), 1200);
        empleados.put(new Empleado(2, "Juan", "Dev"), 1500);
        empleados.put(new Empleado(3, "Pedro", "Dev"), 2000);
        empleados.put(new Empleado(1, "Diego", "Dev"), 1200);
        empleados.put(new Empleado(1, "Juan", "Senior"), 3000);

        System.out.println(empleados.keySet());
    }
}
