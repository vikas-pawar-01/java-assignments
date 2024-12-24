public class Animal {
    protected String type;
    private String size;


    public Animal() {
        this("Unknown", "Large");
    }
    public Animal(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public void run() {
        System.out.println("Animal Run..");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
