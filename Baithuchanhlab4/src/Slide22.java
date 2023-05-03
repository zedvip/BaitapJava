import java.util.ArrayList;
import java.util.Scanner;

public class Slide22 {
    public static void main(String[] args) throws Exception {
        /*Viet chuong trinh nhap vao cac phan tu cho 1 ArrayList tu ban phim. 
         * Sau do tim va hien thi phan tu lon nhat trong ArrayList do.
          */
     ArrayList<Integer>arrayListiIntegers = new ArrayList<>();
     Scanner sc  = new Scanner(System.in);
     int number;  //phan tu cua mang

     System.out.println("Nhap so phan cua ArrayList: ");
     int n = sc.nextInt();
     // nhap va them phan tu cho ArrayList
     for (int i = 0;i<n;i++){
        System.out.println("Nhap phan tu thu: " + i + ": ");
        number = sc.nextInt();
        arrayListiIntegers.add(number); 
     }
     //tim phan tu lon nhat trong mang su dung phuong thuc compareTo()
     //gia su phan tu lon nhat la phan tu dau tien trong ArrayLits
     int max = arrayListiIntegers.get(0);

     for(int i = 1; i<arrayListiIntegers.size(); i++){
        //neu ket qua cua phep so sanh nay lon hon 0
        //tuc bien max nho hon phan tu nay tai vi tri thu i trong ArrayList
        //thi gan max= phan tu tai vi tri i
        //va do chinh la phan tu lon nhat
        if(arrayListiIntegers.get(i).compareTo(max)>0){
            max = arrayListiIntegers.get(i);

        }

     }
    System.out.println("Phan tu lon nhat trong arrListInteger = " + max);

    }
}
