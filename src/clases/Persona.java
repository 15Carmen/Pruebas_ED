package clases;

public class Persona {

    //atributos

    private String nombre;
    private String telefono;

    //constructores

    public Persona(){}

    public Persona(String nombre, String telefono){
        this.nombre=nombre;
        this.telefono=telefono;
    }

    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
