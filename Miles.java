package homework;

import java.util.Scanner;

public class Miles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter name of product");
        String product = input.nextLine();
        System.out.println("Enter quantity");
        int quantity = input.nextInt();
        System.out.println("Enter price");
        double price = input.nextDouble();
        System.out.println("Enter miles");
        int miles = input.nextInt();

        int mileFee = 0;
        if (miles >= 0 && miles <= 5){
            mileFee = 2;
        }else if (miles > 5 && miles <= 15){
            mileFee = 5;
        }else if (miles > 15 && miles <=25){
            mileFee = 10;
        }else if (miles > 25 && miles <= 50){
            mileFee = 15;
        }else{
            mileFee = 20;
        }

        double total = (quantity * price) + mileFee;

        String title = String.format("%-10s %5s %10s %10s %10s", "Product", "Qty", "Price", "Miles", "Total");
        String underlines = String.format("%-10s %5s %10s %10s %10s", "----", "---", "-----","-----", "-----");
        String result = String.format("%-10s %5s %10s %10s %10s", product, quantity, price, miles, total);
        System.out.println(title);
        System.out.println(underlines);
        System.out.println(result);
        System.out.println("\n");
        System.out.printf("%30s","Thank you. Come Again!!!");
    }
}
