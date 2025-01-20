package POO.escuela;

import java.util.LinkedList;

public class escuela {
    private String nombre;
    private LinkedList<estudiante>estudiantes = new LinkedList<>();

    public escuela(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(estudiante nuevo) {
        estudiantes.add(nuevo);
    }
    public void imprimirEstudiantes() {
        for (estudiante aux : estudiantes) {
            System.out.println(aux.getNombre());
        }
    }
    public void eliminarEstudiante(int id_matricula) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId_matricula() == id_matricula) {
                estudiantes.remove(i);
                return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }
    public void modificarEstudiante(int id_matricula, String nuevoNombre, int nuevaEdad) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getId_matricula() == id_matricula) {
                estudiante aux = estudiantes.get(i);
                aux.setNombre(nuevoNombre);
                aux.setEdad(nuevaEdad);
                System.out.println("Modificación hecha!");
            return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

}
