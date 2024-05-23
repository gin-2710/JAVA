import java.util.Scanner;
class HarmonicSeries {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        n = sc.nextInt();

        double sum = (n+1)/2.0;
        
        System.out.println("Sum = " + sum);
    }
}