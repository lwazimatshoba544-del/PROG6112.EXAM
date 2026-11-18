package salesreport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        }; 
        int[][] sales = new int[names.length][3];

        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + names[p] + " mattress: ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        IProduct product = new Product(names, sales);
        PrintProduct printer = new PrintProduct(product);

        printer.printHeader();
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProduct();

        input.close();
    }
}
