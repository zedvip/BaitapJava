import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
       // Khai bao bien va mang 1 chieu
       int n;
       Scanner sc = new Scanner (System.in);
   
       do{
           System.out.print("Nhap kich thuoc bang = ");
           n = sc.nextInt();
       }while(n <= 0);
   
       int arrA[]= new int[n];
       for(int i=0; i<arrA.length; i++)
       {
           System.out.printf("A[%d]=",i);
           arrA[i]=sc.nextInt();
       }
       System.out.print("mang bang dau la:");
       for (int i= 0; i< arrA.length; i++) 
       {   
           System.out.printf("%d \t",arrA[i]);
       }
      
       // In ket qua 
           System.out.print("Mang sau khi sap xep : ");
    
       
       for(int i = 0; i<arrA.length-1;i++)
       {
           for(int j = i+1; j<arrA.length; j++)
           {
               if(arrA[i] > arrA[j])
               {   int tg;
                   tg= arrA[i];
                   arrA[i]= arrA[j];
                   arrA[j]= tg;
               }
           }
       }
       for (int i= 0; i< arrA.length; i++) 
       {   
           System.out.printf("%d \t",arrA[i]);
   }}
   }
   