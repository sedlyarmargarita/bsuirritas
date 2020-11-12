package laba_4;
public abstract class plate  implements Dishes, Object{
    private String style;
    private int diameter;
    private int amount;
    private String coating;
    private int volume;


    public String getStyle() {
        return style;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getAmount() {
        return amount;
    }


    public String getCoating() {
        return coating;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String Manufacturer() {
        return null;
    }

    @Override
    public void print() {

    }

    public plate(String style, int diameter, int amount, String coating, int volume) {
        this.style = style;
        this.diameter = diameter;
        this.amount = amount;
        this.coating = coating;
        this.volume = volume;
    }

}
