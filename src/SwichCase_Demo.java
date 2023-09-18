import java.util.Scanner;

public class SwichCase_Demo {
    public static void main(String[] args) {
        //khoi tao doi tuong scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nguyen tu 0 ->9 ");
//lấy data từ .. sử dụng phương thức nextLine
        int number = Integer.parseInt(scanner.nextLine());
        switch (number) {  //biet so lan lap
            case 0:
                System.out.printf("%d Phiên âm : Zero \n" , number);
                break;
            case 1:
                System.out.printf("%d Phiên âm : One \n", number);
                break;
            case 2:
                System.out.println("%dTwo");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            default:
                System.out.println("Nine");
                break;

        }
    }
}
