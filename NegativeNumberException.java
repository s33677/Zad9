import java.util.Scanner;

public class NegativeNumberException extends Exception {

    public NegativeNumberException(String message) {
        super(message);
    }

    static int[] tablica1 = new int[10];

    public int readNumber() throws NegativeNumberException {
        Scanner sc = new Scanner(System.in);
        sc = new Scanner(System.in);
        int liczba = sc.nextInt();
        if (liczba < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return sc.nextInt();
    }

    public void fillArray() {
        for (int i = 0; i < tablica1.length; i++) {
            if (i == tablica1.length - 1) {
                IllegalAccessException ia = new IllegalAccessException("Board is full !!");
            }
            try {
                tablica1[i] = readNumber();
            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                tablica1[i] = 0;
            }
            System.out.print("Tablica: ");
            for (int num : tablica1) {
                System.out.print(num + " ");
            }
        }
    }
}






