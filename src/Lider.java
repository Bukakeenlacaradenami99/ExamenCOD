public class Lider {

    private String nombre;
    private String apellido;
    private String NIF;
    private int edad;

    public Lider(String nombre, String apellido, String NIF, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NIF = NIF;
        this.edad = edad;
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

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona: " +
                "\nnombre: " + nombre +
                "\napellido: " + apellido +
                "\nNIF: " + NIF +
                "\nedad: " + edad;
    }
}
