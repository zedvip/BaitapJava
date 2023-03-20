import java.util.Scanner;

public class bai8 {
    public static void main(String[] args){

        System.out.println("nhap vao so luong de tinh trung binh cong :");
        Scanner sc = new Scanner(System.in);
        int n,i,k;
        double sum=0;
        n = sc.nextInt();

        for( i = 1; i <= n;i++){
            System.out.println("nhap so thu "+i+":" );
            k = sc.nextInt();
            sum += (double)(k);
        }
        double trungbinh = sum / n;
        System.out.println("Trung binh cong :"+trungbinh);


    }
}
