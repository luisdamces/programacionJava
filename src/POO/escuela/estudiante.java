package POO.escuela;

public class estudiante {
    private int id_matricula;
    private String nombre;
    private int edad;

    public estudiante(int id_matricula, String nombre, int edad) {
        this.id_matricula = id_matricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId_matricula() {
        return id_matricula;
    }

    public void setId_matricula(int id_matricula) {
        this.id_matricula = id_matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
