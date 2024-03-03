public class Lider2 extends Lider {

    private int num_afiliado;
    private String departamento;

    public Lider2(String nombre, String apellido, String NIF, int edad, int num_afiliado, String departamento) {
        super(nombre, apellido, NIF, edad);
        this.num_afiliado = num_afiliado;
        this.departamento = departamento;
    }

    public int getNum_afiliado() {
        return num_afiliado;
    }

    public void setNum_afiliado(int num_afiliado) {
        this.num_afiliado = num_afiliado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
