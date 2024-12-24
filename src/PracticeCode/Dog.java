class Dog extends Animal {

    public  Dog() {
//        super("Lambrador", "Medium");
    }

    public void run() {
        System.out.println("Dog Run..");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
