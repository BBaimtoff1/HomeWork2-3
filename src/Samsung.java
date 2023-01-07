public class Samsung extends Mobile{
private int Gram;
private int Pixel;
private int Battery;

private int FrameFrequency;

    public Samsung( int Gram, int pixel, int battery, int frameFrequency) {
        this.Gram = Gram;
        Pixel = pixel;
        Battery = battery;
        FrameFrequency = frameFrequency;
    }




    @Override
    public void print() {
        System.out.println("Gram" + Gram + "\nPixel" + Pixel + "\nBattery" + Battery + "\nFrameFrequency" +
                FrameFrequency);
        System.out.println("--------------");
    }
}
