package Model;
import java.io.Serializable;
/**
 *
 * @author ZAMBOY
 */
public class Estudiante implements Serializable {
    private String nombre, apellido, id, aula;
    public Estudiante() {
        
    }
    // Constructor
    public Estudiante(String nombre, String apellido, String id, String aula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.aula = aula;
    }
    // Getters & Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAula() {
        return aula;
    }
    public void setAula(String aula) {
        this.aula = aula;
    }
    // Método
    @Override
    public String toString() {
         return nombre+" "+apellido+" "+aula+" "+id+" ";
    }
}