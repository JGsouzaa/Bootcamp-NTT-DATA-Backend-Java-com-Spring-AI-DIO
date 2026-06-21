public class TreeType {
    private String name;
    private String color;

    public TreeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void show(int x, int y) {

        System.out.println(
                name + " (" + color + ")" +
                        " on [" + x + "," + y + "]"
        );
    }
}
