package laba_4;

class Saucer extends plate {
    String name;

    public Saucer(String style, int diameter, int amount, String coating, int volume, String name) {
        super(style, diameter, amount, coating, volume);
        this.name = name;
    }

    public String Manufacturer(){
        String manufacturer="Deffo";
        return manufacturer;
    }
    public void print() {

        System.out.println(name+" производителя " + Manufacturer()+ ". Стиль " + getStyle() + ". Димаетр " + getDiameter() + ". Кол-во " + getAmount() + ". Покрытие " + getCoating() + ". Объем " + getVolume());
    }
}
