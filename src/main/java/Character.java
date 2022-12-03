public abstract class Character {

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
}
