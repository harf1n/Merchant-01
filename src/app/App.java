package app;

import java.util.Scanner;

public class App {
    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static MerchantA merchantA;
    static String infoMerchant;
    static String infoProduct;

    public static void main(String[] args) {

    }

    private static void initVars() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input your name: ");
        merchantName = in.nextLine();
        System.out.print("Input your email: ");
        email = in.nextLine();
        System.out.print("Input phone: ");
        phone = in.nextLine();
        System.out.print("Input your product name: ");
        productName = in.nextLine();
        System.out.print("Input quantity of the product: ");
        quantity = in.nextInt();
        System.out.print("Input price: ");
        price = in.nextInt();
        in.close();
    }

    private static String processData() {
        merchantA = new MerchantA(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
        return infoMerchant + infoProduct + "\nБонус (грн.): " + roundBonus;
    }
}
