package co_templates;

public class PolymorohismMain {
    public static void main(String[] args){
        
        EncapsulationAnimal animal = new EncapsulationAnimal();
        animal.animalSound();
        // animal.bypass(4 ,5);
        // System.out.println("animal.firstNum :" + animal.firstNum );
        // System.out.println("animal.secondNum :" + animal.secondNum );
        // System.out.println("animal.result :" + animal.result );      
        animal.setResult(6);
        System.out.println("animal.getResult() : "+animal.getResult());
        // System.out.println("animal.result() : "+ (++animal.result));

        return;

    }
}
