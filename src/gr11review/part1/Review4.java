package gr11review.part1;
import java.text.DecimalFormat;
import java.io.*;
public class Review4{
    public static void main(String[] args) throws IOException{
        DecimalFormat money = new DecimalFormat("$#,##0.00");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many items do you want to buy? ");
        int itemCount = Integer.parseInt(input.readLine());
        double price = 0;
        // Also couldnt figure out how to do this without loops
        for(int i = 1; i <= itemCount; i++){
            System.out.print("Enter the price for item " + i + ": ");
            price += Double.parseDouble(input.readLine());
        }
        System.out.println("Subtotal: " + money.format(price));
        System.out.println("Tax: " + money.format(price*0.13));
        System.out.println("Total: " + money.format(price*1.13));
    }
}