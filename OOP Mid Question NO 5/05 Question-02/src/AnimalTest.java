public class AnimalTest {
    public static void main(String[] args) {
        Animal defaultAnimal = new
                Animal();
        Animal pk = new Pokemon();
        defaultAnimal.showNameColor();
        pk.showNameColor();
        System.out.println(((Pokemon)pk).name);
    }
} 