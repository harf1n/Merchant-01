package app;

public class ProductA extends Product implements Sales {
    int qnty;
    double price;

    // Конструктор этого класса
    public ProductA(String name, int qnty, double price) {
        super(name);
        this.qnty = qnty;
        this.price = price;
    }

    public String infoProduct() {
        String name = getName();
        String resultSale = Rounder.roundValue(calcSales(qnty, price));
        return "Товар: " + name + "\nОбъем продаж (грн.): " + resultSale;
    }

    // Метод этого класса переопределяющий метод интерфейса
    @Override
    public double calcSales(int quota, double price) {
        return quota * price;
    }

}
