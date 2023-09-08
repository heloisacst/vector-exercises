import java.util.Scanner;

public class Vector {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a qtd");

        int n = sc.nextInt();
        double[] vect = new double[n];

        System.out.println("Informe os valores");
        for(int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for(int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE: %.2f", avg);

        sc.close();
    }
}