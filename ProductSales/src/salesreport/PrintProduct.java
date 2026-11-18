package salesreport;

import java.text.DecimalFormat;

public class PrintProduct {

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void printHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026\n");
        System.out.println("*********************************************");
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("AVERAGE PRODUCT SALES: " + df.format(product.GetAverageProductSold()));
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
