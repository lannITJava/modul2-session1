import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        int usd;
        int vnd = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter usd");
        usd = scanner.nextShort();
        int rate = usd * vnd;
        System.out.println("Tỉ giá là: "+rate);


    }
}
