import java.util.Scanner;
class customerEx
{
  String name, address;
  int mobile_no;
  double talktime;
  void getdata()
  {
   System.out.println("Enter name, address, mobile no of customer");
   Scanner sc = new Scanner(System.in);
   name = sc.nextLine();
   address = sc.nextLine();
   mobile_no = sc.nextInt();
  }
  
  void display()
  {
    System.out.println("Name : "+name);
    System.out.println("Address : "+address);
    System.out.println("Mobile number: "+mobile_no);
  }
}
 
interface billAmt
{
  double calculate(double a);
}

class airtel extends customerEx implements billAmt
{
 public double calculate(double a)
 {
  talktime = 0.95 * a;
  return talktime;
 }
}

class reliance extends customerEx implements billAmt
{
 public double calculate(double a)
 {
  talktime = 0.97 * a;
  return talktime;
 }
}

public class checkcustomer
{
 public static void main(String args[])
 {
  int ch;
  double amount, s;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a choice 1.Airtel 2.Reliance");
  ch = sc.nextInt();
  switch(ch)
  {
   case 1: 
           airtel a = new airtel();
           a.getdata();
           System.out.println("Enter an amount");
           amount = sc.nextDouble();
           s = a.calculate(amount);
           a.display();
           System.out.println("Amount is "+s);
        break;
   case 2:
           reliance r = new reliance();
           r.getdata();
           System.out.println("Enter an amount");
           amount = sc.nextDouble();
           s = r.calculate(amount);
           r.display();
           System.out.println("Amount is "+s);
        break;
   }
 }
}

