package laba_4;
public class Skillet  implements Dishes, Object {
    private String style;
    private int length;
    private String coating;


    public Skillet(String style, int length, String coating) {
        this.style = style;
        this.length = length;
        this.coating = coating;
    }


    @Override
    public void print() {
        System.out.println("\n Производитель " + Manufacturer() + ". стиль " + style + " Длинна ручки " + length + ". Покрытие " + coating);
    }

    @Override
    public String Manufacturer() {
        return null;
    }
}
