public class Pez implements Comida, Acuatico{
    private String nombre;
    private int edad;

    public Pez(String name, int age){
        nombre=name;
        edad=age;
    }

    public void comer(){
        System.out.println("soy un pez y como plancton");
    }

    public void nadar(){
        System.out.println("Soy un pez y estoy nadando en mi pecera");
    }



}
