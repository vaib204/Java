import java.util.*;
class Calculation
{
  public int Addition(int val1,int val2)
  {
    int Ans = 0;

    Ans = val1 + val2;

    return Ans;
  }
}

class program58
{
  public static void main(String Arg[])
  {
    int iret = 0;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter First Number:");
    int no1 = sobj.nextInt();

    System.out.println("Enter second Number:");
    int no2 = sobj.nextInt();


    Calculation cobj = new Calculation();

    iret = cobj.Addition(no1, no2);

    System.out.println("Addition is :"+iret);

  }
}