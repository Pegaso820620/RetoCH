package co.com.choucair.certification.reto_autom.models;

public class TablaCompras {
    private String nombre;
    private String apellido;
    private String zip;

    public TablaCompras(String nombre, String apellido, String zip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.zip = zip;
    }

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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
