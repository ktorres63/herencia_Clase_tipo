public class Animal{

    protected int edad;
    protected String nombre;

    public Animal(String name, int age){
        nombre = name;
        edad = age;
    }

    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }

    @override
    public String toString() {
        return "hola, soy un Animal";
    }

}
