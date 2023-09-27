import java.util.Scanner;
public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.print("Masukkan angka : ");bil=input.nextInt();
                String ganjilGenap = (bil %2 ==0)? "genap" : "ganjil";
        System.out.println(bil + " merupakan bilangan " + ganjilGenap);
    }
}
