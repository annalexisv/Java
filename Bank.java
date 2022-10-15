
import java.util.*;
import java.io.*;
class Funds extends Exception 
{
double amount;
double balance;
  Funds (double amt,double bal)
{   balance=bal;
    amount=amt;
}
public String toString()
{
return ("Insufficient Funds. Available balance: "+ balance);

}
}

class Bank
{
  int acc_no;
  double bal;
  double withdraw;
  Bank()
  { 
    Scanner sc = new Scanner (System.in);
    acc_no= sc.nextInt();
    bal=10000;
    withdraw=sc.nextDouble();
  }
  public void withdrawal(double a,double b) throws Funds
  { withdraw=a;
    if(a>bal)
     throw new Funds(a,b);
    else
       {
        bal-=a;
        System.out.println("New Balance: "+bal);
       }

  }
 public static void main(String args[])
 {
    Scanner sc = new Scanner (System.in);
    Bank obj = new Bank();
    try {
        obj.withdrawal(obj.withdraw,obj.bal);
    }
    catch (Funds f)
    { System.out.println(f);}
 }

}