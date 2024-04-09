package co_templates;

public class PolymorphismPig extends PolymorphismAnimal {
    
    // public void animalSound(){
    //     System.out.println("The Pig says: wee wee");

    // 조상으로부터 상속된 메소드를 수정하고자 할 때 : Overriding
    public void animalSound(){
        System.out.println("The Pig says: wee wee");
    }
}
