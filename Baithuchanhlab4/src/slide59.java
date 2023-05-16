import java.util.LinkedHashSet;
import java.util.Set;
public class slide59{
    public static void main(String[] args) {
        
    
/*viet chuong trinh su dung phuong thuc 
xoa mot phan tu bat ky khoi linkedHashset */

Set<String> linkedHashSet = new LinkedHashSet<String>();
//init
linkedHashSet.add("Nguyen");
linkedHashSet.add("Vu");
linkedHashSet.add("Trung");
linkedHashSet.add("Quoc");
linkedHashSet.add("Tuan");

//show
for (String str : linkedHashSet){
    System.out.println (str + );
}

}
} 