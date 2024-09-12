import java.util.Scanner;
class Generate{
    public static void main(String args[]){
        Scanner range= new Scanner(System.in);
        System.out.println("enter the number");
        int num=range.nextInt();
        int n=num;
        int i;
        for(i=1;i<=n;i++){
            System.out.println("random number sequence:"+i);
        }
    }
}