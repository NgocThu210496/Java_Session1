import java.util.Scanner;

public class For_Demo {
    public static void main(String[] args) {
        //nhap vao so nguyen duong tu ban phim (number), in ra so chan tu 1->nummber
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so nguyen duong ");
        int number= Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.printf("%d La co chan \n", i);
            }
        }
    }
}
