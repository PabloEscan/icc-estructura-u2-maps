package models;

public class Empleado implements Comparable<Empleado> {
    private int id;
    private String name;
    private String position;

    // Constructor completo
    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Constructor solo con ID (útil para eliminar)
    public Empleado(int id) {
        this.id = id;
        this.name = "";
        this.position = "";
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Empleado other = (Empleado) obj;
        return this.id == other.id;
    }

    // Ordenar por id
    @Override
    public int compareTo(Empleado o) {
        return Integer.compare(this.id, o.id);
    }
}
