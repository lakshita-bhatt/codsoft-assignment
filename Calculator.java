import java.util.Scanner;
 class Calculator {
    public static void main(String args[]){
      Scanner a=new Scanner(System.in);
      System.out.println("enter the marks of first subject");
      int m1=a.nextInt();
      System.out.println("enter the marks of second subject");
      int m2=a.nextInt();
      System.out.println("enter the marks of third subject");
      int m3=a.nextInt();
      System.out.println("enter the marks of fourth subject");
      int m4=a.nextInt();
      System.out.println("enter the marks of fifth subject");
      int m5=a.nextInt();
        int sum=m1+m2+m3+m4+m5;
      float avg=sum/5;
      float percentage=avg;
      System.out.println("percentage of student"+percentage);
    if(percentage>=80 && percentage<90){
      System.out.println("grade:A"+ percentage);
    }
    else if(percentage>=70 && percentage<80){
       System.out.println("grade B"+ percentage);
    }
     else if(percentage>=60 && percentage<70){
      System.out.println("grade C"+ percentage);
    }
    else if(percentage>=50 && percentage<60){
      System.out.println("grade D"+ percentage);
    }
    else if(percentage<50){
      System.out.println("Fail"+ percentage);
    }
    else 
    {
      System.out.println("grade A+"+ percentage);
    }
  }  
}
