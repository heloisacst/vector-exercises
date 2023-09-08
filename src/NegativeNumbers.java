import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers will you type? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Type a number: ");
            vect[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println("NEGATIVE NUMBERS:");
            if(vect[i] < 0){
                System.out.printf("%d\n", vect[i]);
            }
        }


        sc.close();

    }
}
