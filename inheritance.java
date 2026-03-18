
class Animal{
    void eat(){
        System.out.println("i am eating");
    }
}
class Dog extends Animal{
    void dog(){
        System.out.println("i am a dog");
    }
}

class Cat extends Animal{
    void cat(){
        System.out.println("i am a cat");
    }
}

class inheritance{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.dog();
        d.eat();
      

        Cat c = new Cat();
        c.cat();
        c.eat();
        
    }
}