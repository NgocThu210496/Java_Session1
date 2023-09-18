import java.util.Scanner;

public class MoneyConvertion {
    public static void main(String[] args) {
        //doi tuong  scanner cho nguoi dung nhap vao tu ban phim
        Scanner scanner =new Scanner(System.in);
        System.out.print("Mời bạn nhập  số tiền  USD :　");
        //gan usd cho doi tuong scanner nhap tu ban phim bang phuong thuc nextDouble lay kieu data double
        double usd = scanner.nextDouble();
        //để lưu giá trị tỉ giá giữa VND và USD
        System.out.print("Nhập vào tỉ giá hiện tại: ");
        double rate = scanner.nextDouble();
        //Tính giá trị VND
        double vnd= usd * rate;
        //Hien thi ra man hinh
        System.out.println("Tỉ số VND là " + vnd + " VND");

    }
}
