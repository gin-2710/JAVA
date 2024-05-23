import java.util.Scanner;

class PaiseFormat {
    public static void main(String args[]) {
        double amount, paise;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount in rupees");
        amount = sc.nextDouble();

        paise = amount*100;
        
        System.out.println("Amount in Paise = " + (int)paise);
    }
}