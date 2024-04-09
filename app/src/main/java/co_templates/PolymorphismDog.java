package co_templates;

public class PolymorphismDog extends PolymorphismAnimal {
    // public void animalSound(){
    // System.out.println("The dog says: bow wow");
    // }
    public int speed(int kilometer){
        int result = (int)(kilometer * 1000);
        return result;
    }
}
