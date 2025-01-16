import java.util.Scanner;

public class IT24104000Lab5Q3 {
    
     static final int Room_charge_per_day = 48000;
     static final int No_discount = 0;
     static final int Discount_3_4_Days = 10;
     static final int Discount_5_or_more_Days = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

        
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Dates must be between 1 and 31.");
            return;
        }
        if (startDate >= endDate) {
            System.out.println("Start date must be less than end date.");
            return;
        }

        
        int daysReserved = endDate - startDate;

        
        int discountRate;
        if (daysReserved < 3) {
            discountRate = No_discount;
        } else if (daysReserved <= 4) {
            discountRate = Discount_3_4_Days;
        } else {
            discountRate = Discount_5_or_more_Days;
        }

        int totalAmount = daysReserved * Room_charge_per_day;
        double discountAmount = totalAmount * (discountRate / 100.0);
        double finalAmount = totalAmount - discountAmount;

        
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total amount to be paid: Rs " + finalAmount);
    }
}
