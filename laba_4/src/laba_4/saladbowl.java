package laba_4;

 class Saladbowl extends plate {
    String name;

    public Saladbowl(String style, int diameter, int amount, String coating, int volume, String name) {
        super(style, diameter, amount, coating, volume);
        this.name = name;
    }

    public String Manufacturer(){
        String manufacturer="IKEA";
        return manufacturer;
    }
    public void print() {

        System.out.println(name+" производителя " + Manufacturer()+ ". Стиль " + getStyle() + ". Димаетр " + getDiameter() + ". Кол-во " + getAmount() + ". Покрытие " + getCoating() + ". Объем " + getVolume());
    }
}
