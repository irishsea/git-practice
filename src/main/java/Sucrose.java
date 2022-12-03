public class Sucrose extends Character implements AnemoControllable {

    public Sucrose(String name, String region) {
        super(name, region);
    }

    @Override
    public void takeDandelion() {
        System.out.println("Let's take this dandelion");
    }

    @Override
    public void useElement() {
        System.out.println("Whooosh!");
    }
}
