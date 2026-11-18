package salesreport;

public class Product implements IProduct {

    private final String[] productNames;   // single-dimensional array
    private final int[][] sales;           // two-dimensional array [product][month]

    public Product(String[] productNames, int[][] sales) {
        this.productNames = productNames;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) {
            for (int m = 0; m < sales[p].length; m++) {
                total += sales[p][m];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int p = 0; p < sales.length; p++) {
            count += sales[p].length;
        }
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        int bestTotal = -1;

        for (int p = 0; p < sales.length; p++) {
            int productTotal = 0;
            for (int m = 0; m < sales[p].length; m++) {
                productTotal += sales[p][m];
            }
            if (productTotal > bestTotal) {
                bestTotal = productTotal;
                bestIndex = p;
            }
        }
        return productNames[bestIndex] + " (" + bestTotal + ")";
    }
}

