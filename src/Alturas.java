import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtd = sc.nextInt();

        String[] nome = new String[qtd];
        int[] idade = new int[qtd];
        double[] altura = new double[qtd];
        int cont = 0;
        double sum = 0.0;

        for(int i = 0; i < qtd; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();

        }

        for(int i = 0; i < qtd; i++) {
            System.out.printf("%.2f\n", altura[i]);
            sum += altura[i];

        }

        double avg = sum / qtd;

        System.out.printf("Altura média: %.2f\n", avg);

        for(int i = 0; i < qtd; i++) {
            if(idade[i] < 16) {
                cont++;
            }
        }

        double taxa = ((double) cont / (double) qtd) * 100;

        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", taxa);


        for(int i = 0; i < qtd; i++) {
            if(idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        sc.close();
    }
}
