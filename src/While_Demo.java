import java.util.Scanner;

public class While_Demo {
    public static void main(String[] args) {
        //nhap va in ra 10 so le
        //b1: khai bao va khoi tao bien de dem so lede in cntOdd=0
        //b2: su dung vong while dk la cntOdd<=10
        //b3 nhap so tu ban phim
        //b4 kiem tra number co phai co la so le khong -> neu le thi in ra va tang cntOdd len 1 don vi

        //int cntOdd =0;
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("Nhap so: ");
            int number = Integer.parseInt(scanner.nextLine());
            if(number==0){
                System.out.printf("vong lap ket thuc");
            }

        }

    }
}
