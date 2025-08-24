import java.util.Scanner;
class check
{
  public int Calculate(int no1)
  {
    int isum = 0;
    for(int i = 1;i< no1;i++)
    {
     isum = isum + no1;
    }
    return isum;
  }
}

class program5
{
  public static void main(String[] args) {
  
  Scanner sobj = new Scanner(System.in);

  System.out.println("Enter Number:");
  int value = sobj.nextInt();
 
  check cobj = new check();
  int iret = cobj.Calculate(value);
  System.out.println("addition is :"+iret);
  
 }
}