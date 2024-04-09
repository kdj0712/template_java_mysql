package co_templates;

public class ConstructorMain {
    public static void main(String[] args){
        
        ConstructorAnimal animal = new ConstructorAnimal();
        animal.animalSound();

        ConstructorAnimal animalWithParams = new ConstructorAnimal(2,3);

        // subs.methodsSubs();
        // subs.methodSubsWithParams("김덕재",5);
        // int result = subs.methodSubsWithParamsReturn(5,6);
        return ;
    }

}
