package models;

import java.util.Scanner;

public class Student {
    // thuoc tinh
  String fullName;
  int Age;
 
  public String getfullName(){
   return fullName;
  }

  public void setfullName(){
   this.fullName = fullName;
  }
  public int getAge(){
   return Age;
  }

  public void setAge(int age){
   this.Age=Age;
  }


 public void nhapthongtin(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap Fullname :");
    this.fullName=sc.nextLine();
    System.out.println("Nhap Age :");
    this.Age=sc.nextInt();
 }
 public void hienthithongtin(){
    System.out.println("Ho va ten " + this.fullName);
    System.out.println("Tuoi:"+this.Age);
 }

public void inputInfo() {
}

public void showInfo() {
}
}

