import java.util.Scanner;

public class BaiTap_UngDung {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        //in menu
        do {

            System.out.println("*********MENU***********");
            System.out.println("1. Kiểm tra số chẵn/lẽ");
            System.out.println("2. Kỉểm tra số nguyên tố");
            System.out.println("3. Tính tổng các ước của số nguyên ");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("5. Thoát");
            System.out.println("****************************");

            System.out.println("Nhâp vào 1 số bạn muốn");
            number = Integer.parseInt(scanner.nextLine());
            System.out.println("Chọn các chức năng từ bàn phím");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d là số chẵn \n ", number);
                    } else {
                        System.out.printf("%d là số le \n ", number);
                    }
                    break;
                case 2:
                    if (number <= 1) {
                        System.out.printf("%d không là số nguyên tố!\n", number);
                    } else {
                        boolean isPrime = true;
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.printf("%d Là số nguyên tố!\n ", number);
                        } else {
                            System.out.printf("%d không là số nguyên tố! \n", number);
                        }
                    }
                    break;
                case 3:
                    int sum = 0;
                    for (int i = 1; i <= number; i++) {
                        if (number % i == 0) {
                            sum += i;
                        }
                    }
                    System.out.printf("Tính tổng các ước của số nguyên la %d \n ", sum);
                    break;
                case 4:
                    if (number <= 1) {
                        System.out.printf("%d không là số hoàn hảo\n", number);
                    } else {
                        int s = 1;
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number % i == 0) {
                                s += i;
                                if (i != number / i) {
                                    s += number / i;
                                }
                            }
                        }
                        if (s == number) {
                            System.out.printf("%d Là số hoàn hảo\n", number);
                        } else {
                            System.out.printf("%d không là số hoàn hảo\n", number);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Vui long nhap tu 1 -> 5");
            }
        } while (true);

    }
}
