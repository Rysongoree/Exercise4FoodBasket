public class Food {
    private String name;
    private String type;

    public Food(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String eatIt() {
        return "You just ate the " + name + ".";
    }

    public String denyIt() {
        return "Not eating that! I hate " + type + "!";
    }

    public String getType() {
        return type;
    }
}





