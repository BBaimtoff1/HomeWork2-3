public class Redmi extends Mobile{
    private String Display;
    private String Camera;
    private int GHZ;
    private String Color;

    public Redmi (String display, String camera, int GHZ, String color) {
        Display = display;
        Camera = camera;
        this.GHZ = GHZ;
        Color = color;
    }


    @Override
    public void print() {
        System.out.println("Display" + Display + "\nCamera" + Camera + "\nGHZ" + GHZ + "\nColor" + Color);


    }
}
