import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] num = new int[n];
        int qtd = 0;

        for(int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            num[i] = sc.nextInt();
        }

        System.out.println("Numeros pares:");
        for(int i = 0; i < n; i++) {
            double par = num[i] % 2;
            if(par == 0) {
                System.out.printf("%d ", num[i]);
                qtd++;
            }
        }

        System.out.println("Quantidade de pares = " + qtd);

        sc.close();
    }
}
