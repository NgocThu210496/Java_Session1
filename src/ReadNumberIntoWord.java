import java.util.Scanner;

public class ReadNumberIntoWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("Nhập vào số cần đọc : ");
            int number = Integer.parseInt(scanner.nextLine());
            int hangTram = number / 100;
            int hangChuc = number % 100 / 10;
            int hangDonVi = number % 10;
            String docChu = "";
            if ((number < 0) || (number > 1000)) {
                System.out.println("vui lòng nhập số từ 1->999");
            } else{
                switch (hangTram) {
                    case 1:
                        docChu = "One hundred";
                        break;
                    case 2:
                        docChu = "Two hundred";
                        break;
                    case 3:
                        docChu = "Three hundred";
                        break;
                    case 4:
                        docChu = "Four hundred";
                        break;
                    case 5:
                        docChu = "Five hundred";
                        break;
                    case 6:
                        docChu = "Six hundred";
                        break;
                    case 7:
                        docChu = "Seven hundred";
                        break;
                    case 8:
                        docChu = "Eight hundred";
                        break;
                    case 9:
                        docChu = "Nine hundred";
                        break;

                }
                if (hangChuc >= 2) {
                    switch (hangChuc) {
                        case 2:
                            docChu = docChu + "Twenty ";
                            break;
                        case 3:
                            docChu = docChu + "Thirty ";
                            break;
                        case 4:
                            docChu = docChu + "Forty ";
                            break;
                        case 5:
                            docChu = docChu + "Fifty ";
                            break;
                        case 6:
                            docChu = docChu + "Sixty ";
                            break;
                        case 7:
                            docChu = docChu + "Seventy ";
                            break;
                        case 8:
                            docChu = docChu + "Eighty ";
                            break;
                        case 9:
                            docChu = docChu + "Ninety ";
                            break;
                    }
                } else if (hangChuc == 1) {
                    switch (hangDonVi) {
                        case 0:
                            docChu = docChu + " ten ";
                            break;
                        case 1:
                            docChu = docChu + " eleven ";
                            break;
                        case 2:
                            docChu += " twelve ";
                            break;
                        case 3:
                            docChu += " thirteen ";
                            break;
                        case 4:
                            docChu += " fourteen ";
                            break;
                        case 5:
                            docChu += " fifteen ";
                            break;
                        case 6:
                            docChu += " sixteen ";
                            break;
                        case 7:
                            docChu += " seventeen ";
                        case 8:
                            docChu += " eighteen ";
                            break;
                        case 9:
                            docChu += " nineteen ";
                            break;

                    }
                }
                if(hangChuc !=1){
                    switch (hangDonVi){
                        case 1:
                            docChu=docChu + "one";
                            break;
                        case 2:
                            docChu=docChu + "Two";
                            break;
                        case 3:
                            docChu=docChu + "Three";
                            break;
                        case 4:
                            docChu=docChu + "Four";
                            break;
                        case 5:
                            docChu=docChu + "Five";
                            break;
                        case 6:
                            docChu=docChu + "Six";
                            break;
                        case 7:
                            docChu=docChu + "Seven";
                            break;
                        case 8:
                            docChu=docChu + "Eight";
                            break;
                        case 9:
                            docChu=docChu + "Nine";
                            break;
                    }
                }
                if(hangChuc==0 && hangTram ==0 && hangDonVi==0){
                    docChu="Zero";
                }

                }
            System.out.println(docChu);
            // neu nhap so 999  se in ra sau do thoat khoi ct
            if(number==999){
                System.exit(0);
            }
            }


        }


    }

