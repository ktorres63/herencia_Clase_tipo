public class Perro extends Animal{
    private String raza;

    public Perro(String name, int age, String breed){
        super(name,age);
        raza = breed;
    }

    public String getRaza(){
        return raza;
    }

    public String toString() {
        return "hola soy un Perro, me llamo: "+getNombre();
    }

}
