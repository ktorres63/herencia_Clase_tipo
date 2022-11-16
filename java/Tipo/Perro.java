public class Perro implements Comida, Terrestre{
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String name, int age, String breed){
        nombre=name;
        edad=age;
        raza = breed;
    }

    public String getRaza(){
        return raza;
    }

    public void comer(){
        System.out.println("soy un perro y como croquetas");
    }

    public void andar(){
        System.out.println("soy un perro y ando por el parque");
    }



}
