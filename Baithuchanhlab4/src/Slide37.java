import java.util.LinkedList;

public class Slide37 {
    public static void main(String[] args) {
        // khai bao 1 LinkedList co ten la list
        //co kieu la String
        LinkedList<String>list = new LinkedList<String>();
        // Add objects to list

        list.add("java");
        list.add("C++");
        list.add("PHP");
        list.add("java");

        System.out.println("vi du su dung phuong addALL()");
        System.out.println("------------------------------");
        // them cac phan tu cua list vao listA
        LinkedList<String>listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.print("listA:");
        showList(listA);
        
        System.out.println("\n vi du su dung phuong thuc retainAll()");
        System.out.println("--------------------------------------");
        // khoi tao listB
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        // xoa nhung phan tu ko thuoc listB khỏi java
        listA.retainAll(listB);
        System.out.println("litsA");
        showList(listA);

        System.out.println("\n vi du su dung phuong thuc removeAll");
        System.out.println("--------------------------------------");
        
        //xoa nhung phan tu thuoc listB khoi list
        list.removeAll(listB);
        System.out.println("listB:");
        showList(list);
    }
        public static void showList(LinkedList<String> list) {
            // show list through for-each
            for(String obj : list){
                System.out.print("\t" + obj + ",");
            }
            System.out.println();
        }
    }


