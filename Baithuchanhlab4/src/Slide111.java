import java.util.LinkedList;
import java.util.Scanner;

public class Slide111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Viet chuong trinh xay dung 1 danh sach 
        lien ket (linkedlist) luu tru n so nguyen duong (n duoc nhap tu ban phim).
        sau do tinh trung binh cong cua cac so chan va hien thi ket qua man hinh  */

        LinkedList<Integer> abcList = new LinkedList<>();
        System.out.println("Nhap vao so luong phan tu ");
        int n = sc.nextInt();
        for (int i = 0;i<n;i++){
            System.out.printf("Nhap vao phan tu thu %d: ",i + 1);
            int phanTu = sc.nextInt();
            abcList.add(phanTu );   
        }
        int sum = 0; 
        int dem = 0;
        for (int il = 0;il<abcList.size();il ++){
            if (abcList.get(il) % 2 == 0 ){
                dem ++ ; 
                sum += abcList.get(il);
            }
        }
        System.out.printf("trung binh cong cua cac so chan la : %.2f",(float) sum /dem);
    }
}
