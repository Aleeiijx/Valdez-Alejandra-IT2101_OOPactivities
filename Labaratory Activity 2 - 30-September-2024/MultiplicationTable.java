import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int maximum = value.nextInt();
        System.out.println("Multiplication Table: ");


        int [][] table = new int[maximum + 1][maximum + 1];

        for (int i = 1; i <= maximum; i++){
            for(int j = 1; j <= maximum; j++){
                table[i][j] = i * j;
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        value.close();
    }
}
