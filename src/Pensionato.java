import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        String[] guest = new String[9];

        for(int i = 0; i < n; i++) {
            System.out.printf("\nRent #%d:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();

            guest[room] = nomes[i];

        }

        System.out.println("Busy rooms:");
        for(int i = 0; i < 9; i++) {
            if(guest[i] != null){
                System.out.printf("%d: %s\n", i, guest[i]);
            }
        }

        sc.close();
    }
}
