package laba_4;
public class Pan implements Dishes, Object {
    private String style;
    private int volume;
    private int amount;
    private String coating;

    public Pan(String style, int volume, int amount, String coating) {
        this.style = style;
        this.volume = volume;
        this.amount = amount;
        this.coating = coating;
    }


    @Override
    public String Manufacturer() {
        String manufacturer="IKEA";
        return manufacturer;
    }


    @Override
    public void print() {
        System.out.println("Производитель " + Manufacturer() + ". Стиль" + style + ". Объем " + volume + ". Кол-во " + amount + ". Покрытие " + coating);
    }
}
