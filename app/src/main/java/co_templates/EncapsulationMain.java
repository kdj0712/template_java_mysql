package co_templates;

public class EncapsulationMain {
    public static void main(String[] args){
        
        PolymorphismAnimal animal = new PolymorphismAnimal();
        animal.animalSound();


        PolymorphismPig Pig = new PolymorphismPig();
        Pig.animalSound();

        
        PolymorphismDog Dog = new PolymorphismDog();
        Dog.animalSound();
        Dog.speed(3);
        return;

    }
}
