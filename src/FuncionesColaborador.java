import java.util.*;
public class FuncionesColaborador extends Lider2 {

    private static ArrayList <Lider2> mistrabajadores = new ArrayList <>();
    public FuncionesColaborador(String nombre, String apellido, String NIF, int edad, int num_afiliado, String departamento) {
        super(nombre, apellido, NIF, edad, num_afiliado, departamento);
    }


    public void DardealtaTrabajador(ArrayList <Lider2> lista){


        lista.add(new Lider2("Juan", "Vazquez Fariña", "34567832G", 50, 9182738, "Comercio Internacional"));




    }

    public ArrayList <Lider2> damedatos(ArrayList <Lider2> array){

        for(Lider2 L:array){

            System.out.println(L);
        }

       return array;
    }



}
