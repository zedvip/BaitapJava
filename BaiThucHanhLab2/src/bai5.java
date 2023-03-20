import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) throws Exception{
          Scanner sc = new Scanner(System.in);
          int a ,tong =0;
          
          
    while(tong <100) {
        System.out.print("Nhap vao so nguyen :");
        a =sc.nextInt();
        tong +=a;
    }
     System.out.println("tong cac so vua nhap la: " +tong);

    }
}
