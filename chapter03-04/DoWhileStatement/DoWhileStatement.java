import java.util.Scanner;

public class DoWhileStatement {
    public static void main(String[] args) {
        int value = 0;
        Scanner scan = new Scanner(System.in);
        
        do {
            value = scan.nextInt();
            System.out.println("Input value:"+ value);
        }while(value != 10);

        System.out.println("Finsihed iterate statement.");
    }
}