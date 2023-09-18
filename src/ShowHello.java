import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        //lớp xây dựng để lấy dữ liệu mnhaajp từ bàn phím
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter xuong dong");
        //nhap vao ban phim
        String name = scanner.nextLine();
        System.out.println("Xin chao " + name);
    }
}
