import java.util.Scanner;

public class slide40 {
    public static void main(String[] args) throws Exception {
        int ngay;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap Ngay");
        ngay = sc.nextInt();
        switch(ngay){
            case 1:
            System.out.println("hom nay la thu 2");
            case 2:
            System.out.println("hom nay la thu 3");
            case 3:
            System.out.println("hom nay la thu 4");
            case 4:
            System.out.println("hom nay la thu 5");
            case 5:
            System.out.println("hom nay la thu 6");
            case 6:
            System.out.println("hom nay la thu 7");
            case 7:
            System.out.println("hom nay la thu chu nhat");
            break;
        }
        sc.close();
    }
}
