public class Elefante extends Animal implements Terrestre{
    private double peso;

    public Elefante(String name, int age, double weight){
        super(name,age);
        peso = weight;
    }

    public String toString(){
        return "hola soy un elefante, me llamo: " + getNombre();
    }
    public void andar(){
        System.out.println("soy un elefante y ando por la selva");
    }
}
