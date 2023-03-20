import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n , i = 1;
        long giaithua = 1;

        do{
            System.out.println("nhap vao so n");
            n = sc.nextInt();
        }while(n <= 0);

        while(i<=n){
            giaithua *= i;
            i++;
        }

        System.out.println(n + " ! =" + giaithua);
       
    }
       
}
