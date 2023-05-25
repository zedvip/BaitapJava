import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        
    
    public String Ten;
    public float Diem;
    public static void ThemSinhVien(List<SinhVien> arr) {
        Scanner sc = new Scanner(System.in);
        String Name;
        float score;
        do{
            System.out.println("Nhap vao ten sinh vien:");
            Name = sc.nextLine();
        if(!Name.isEmty()){
           System.out.println("Nhap  vao ten sinh vien");
           score = float.parse(sc.nextLine());
           SinhVien sv = new SinhVien();
           sv.Diem = score; 
           sv.ten = Name; 
           arr.add(sv);
           System.out.println("Thanh cong");

        
            }else 
            break
        }wwhe(true);

    }
    public static void DemSinhVien(list<SinhVien>arr) {
        int dem =0 ;
        for (Sinh vien namburer:arr){
            if(Number.Diem<=5){
                dem ++;
                System.out.printf("Sinh vien : %s %f diem thi lai \n ", number.Ten , number.Diem );
            }
        }
        System.out.println("so sinh vien thi lai la :"+ dem);
    }

    public static void HienThiSinhVien(List<SinhVien>sv) {
        for(int i = ;i<sv.size();i++){
            System.out.printf("sinh vien: %s %.2f diem \n", sv.get(i).Ten,sv.get(i).Diem);
        }
        
    }
    public static void maxSinhVien(List<SinhVien>arr) {
        List<SinhVien> temp = new LinkedList<>();
        double DiemMax = 0;
        for (SinhVien vs :arr){
            if (vk.diem > DiemMax ){
                DiemMax = vk.Diem;
                temp.clear();
                temp.add(vk);

            }else {
                if (vk.Diem==DiemMax)
                   tem .add(vk);
            }
        }
        HienThi(temp);
    }
    public static void TimkiemSinhVien(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten can tim kiem");
        String ten = sc.nextLine();
        fot(int i = 0; i < arr.size();i++){
            if(arr.get(i).Ten){
                System.out.printf("Sinh vien : %s %.2f diem \n",arr.get(i).Ten, arr.get(i).Diem);
            }
        }
    }
}
}