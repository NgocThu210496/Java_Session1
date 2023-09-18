import java.util.Scanner;

public class PhepChia5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao so nguyen: ");
        int number= scanner.nextInt();
        if(number%5==0){
            System.out.printf("%d So chia het cho 5 la : \n" , number);
        }else if (number%5==1) {
            System.out.printf("%d chia het cho 5 du 1 \n" , number);
        }else if (number%5==2) {
            System.out.printf("%d chia het cho 5 du 2 \n" , number);
        }else if (number%5==3) {
            System.out.printf("%d chia het cho 5 du 3 \n" , number);
        }else {
            System.out.printf("%d So chia het cho 5du 4: \n" , number);
        }
    }
}
