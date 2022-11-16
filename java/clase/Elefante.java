public class Elefante extends Animal{
    private double peso;

    public Elefante(String name, int age, double weight){
        super(name,age);
        peso = weight;
    }

    public String toString(){
        return "hola soy un elefante, me llamo: " + getNombre();
    }
}
