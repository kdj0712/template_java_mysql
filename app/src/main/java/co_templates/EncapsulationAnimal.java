package co_templates;

public class EncapsulationAnimal {
    public int firstNum ;
    public int secondNum ;
    private int result ;

    public void setResult(int number){
        this.result = number;
    }

    public int getResult(){
        return this.result;
    }
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void bypass(int firstNumber, int secondNumber) {
        this.firstNum = firstNumber;
        this.secondNum = secondNumber;
        int result = firstNumber + secondNumber;
        this.result = result;
        // or
        // this.result = firstNumber + secondNumber;
        return;
    }

}
