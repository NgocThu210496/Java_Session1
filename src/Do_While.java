import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        /*
         * Xây dựng chương trình order ho quán ăn sáng
         * 1. hiển thị menu ăn sáng ho ngừoi dùng chọn (lắp vô hạn)
         * 2. khi ngừoi dùng chọn thì sẽ chuyển sang bếp làm
         * 3.kết thúc quá trình chọn khi ngừoi dùng chọn thoát
         ********************Menu*******************
         * 1.phở Kobe
         * 2.Mỳ gà
         * 3.Cháo lòng
         * 4.Bánh mỳ Ấp ra
         * 5.Mỳ tôm không ngừoi lái
         * 6. Thoát
         * */

        Scanner scanner = new Scanner(System.in);
        do {
            //in ra menu cho lap vo han
            System.out.println("**********Menu**********");
            System.out.println("1.Phở Kobe");
            System.out.println("2.Mỳ gà");
            System.out.println("3.Cháo lòng");
            System.out.println("4.Bánh mỳ Ấp ra");
            System.out.println("5.Mỳ tôm không ngừoi lái");
            System.out.println("Thoát");
            System.out.println("Lưa chọn của bạn");

            //bien choice de chon tung so trong menu muon chon
            int choice = Integer.parseInt(scanner.nextLine());
            //sử dụng swith-case để chọn
            switch (choice){
                case 1:
                    System.out.println("Bạn đã chọn Phở Kobe, mời bạn chọn tiếp");
                    break;
                case 2:
                    System.out.println("Bạn đã chọn Mỳ gà, mời bạn chọn tiếp");
                    break;
                case 3:
                    System.out.println("Bạn đã chọn Cháo lòng, mời bạn chọn tiếp");
                    break;
                case 4:
                    System.out.println("Bạn đã chọn Bánh mỳ Ấp ra, mời bạn chọn tiếp");
                    break;
                case 5:
                    System.out.println("Bạn đã chọn Mỳ tôm không ngừoi lái, mời bạn chọn tiếp");
                    break;
                case 6:
                    System.out.println("Thoát");
                default:
                    break;
            }

        }while (true);

    }
}
