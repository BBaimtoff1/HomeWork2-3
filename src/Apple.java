public class  Apple extends Mobile {
    private String powerChip;

    private String powerCamera;

    private String brightDisplay;

    private String size;


    public Apple(String powerChip, String powerCamera, String brightDisplay, String size) {
        this.powerChip = powerChip;
        this.powerCamera = powerCamera;
        this.brightDisplay = brightDisplay;
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("powerChip" + powerChip + "\npowerCamera" + powerCamera + "\nbrightDisplay" +
                brightDisplay + "\nsize" + size);
        System.out.println("------------");


    }

}
