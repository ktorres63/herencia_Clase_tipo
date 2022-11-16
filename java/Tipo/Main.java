public class Main
{
    public static void main(String[] args) {

        Perro dog = new Perro("bobby", 3,"chihuahua");
        Animal elephant= new Elefante("Sanson", 3, 500.2);
        Pez fish = new Pez("nemo",2);

        Acuatico pez1= new Pez("nemo", 2);
        Terrestre elep = new Elefante("jhonny",23,500.1);

        pez1.nadar();
        elep.andar();
        System.out.println(elep);

    }
}
