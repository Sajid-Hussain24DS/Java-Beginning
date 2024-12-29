class Animal{
    public void makeSound() {
        System.out.println("Animal make sound");


    }
}
class cat extends Animal{
    public void makeSound() {
        System.out.println("Cat Call Meow");


    }
    public static void main(String args[]){
        cat myCat = new cat();
        myCat.makeSound();
    }
}