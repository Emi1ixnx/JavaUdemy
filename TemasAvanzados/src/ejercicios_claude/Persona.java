package ejercicios_claude;

import java.util.Objects;

class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona otra =  (Persona) obj;
        return edad == otra.edad && nombre.equals(otra.nombre);
    }

    @Override
    public int hashCode() {
        return  Objects.hash(nombre, edad);
    }
}