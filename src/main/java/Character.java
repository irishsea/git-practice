public abstract class Character implements ElementControllable{

    private final String region;
    private final String name;

    public Character(String region, String name) {
        this.region = region;
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public String getName() {
        return name;
    }

    @Override
    public void useElement() {
        System.out.println("Go!!!");
    }
}
