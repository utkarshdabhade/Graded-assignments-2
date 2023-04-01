import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Transactions1 {

    public static void main(String[] args) {

        // Initialize variables to store results
        int numberOfTransactions = 0;
        double totalBillAmount = 0;
        double maxBillAmount = Double.MAX_VALUE;
        double minBillAmount = Double.MIN_VALUE;

        // Specify the path and name of the CSV file
        String csvFile = "Invoicetable.csv";

        try (BufferedReader buffer = new BufferedReader(new FileReader(csvFile))) {

            String line;
            // Skip the header line of the CSV file
            buffer.readLine();

            while ((line = buffer.readLine()) != null) {

               
                String[] values = line.split(",");

                double billAmount = Double.parseDouble(values[3]);

                numberOfTransactions++;

                totalBillAmount += billAmount;

           
                if (billAmount > maxBillAmount) {
                    maxBillAmount = billAmount;
                }

              
                if (billAmount < minBillAmount) {
                    minBillAmount = billAmount;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occured" + e.getMessage());;
        }

     
        System.out.println("Total number of transactions(bills): " + numberOfTransactions);
        System.out.println("Total bill amount: " + totalBillAmount);
        System.out.println("Max bill amount: " + maxBillAmount);
        System.out.println("Min bill amount: " + minBillAmount);
    }
}
