class Atm{
   int amount=12000;
  public void checkbalance(){
        System.out.println("current balance is="+amount);
}
}
 class Deposits extends Atm{
      void dep( int depositamount){
             int depamt=depositamount;
       int a=depamt+amount;
         System.out.println("after depositing amount is="+a);
}
}
 class Withdrawls extends Deposits{
      void withd(int withdrawamt){
           int witamt=withdrawamt;
        int b=witamt+amount;
        System.out.println("after withdrawling amount is="+b);
}
}
class Bank {
  public static void main(String args[]){
    Withdrawls obj1=new Withdrawls();
    obj1.checkbalance();
    obj1.dep(700);
    obj1.withd(500);
  }
}
         
              