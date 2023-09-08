import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("How many numbers will you type? ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double sum = 0.0;

        for(int i = 0; i < n; i++){
            System.out.print("Type a number: ");
            vect[i] = sc.nextDouble();
            sum += vect[i];
        }

        System.out.print("VALORES = ");
        for(int i = 0; i < n; i++){
            System.out.printf("%.2f ", vect[i]);

        }

        double avg = sum / n;
        System.out.printf("\nSOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", avg);

        sc.close();

    }

}
