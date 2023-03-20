import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("nhap ten :");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi :");
        int tuoi = sc.nextInt();

        if(tuoi<16){
            System.out.printf("Ban %s o do tuoi thanh nien",ten);
        }
        else if((tuoi>=16)&&(tuoi<18)){
            System.out.printf("Ban %s o do tuoi truong thanh",ten);
        }
        if(tuoi>=18){
            System.out.printf("Ban %s da gia",ten);
        }


    }
}
