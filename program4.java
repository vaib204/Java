import java.util.Scanner;
class check
{
  public void Calculate(int no1)
  {
    for(int i = 0;i<no1;i++)
    {
      System.out.println("Jay Shree Krishna...");
    }
  }
}

class program4
{
  public static void main(String[] args) {
  
  Scanner sobj = new Scanner(System.in);

  System.out.println("Enter Number:");
  int value = sobj.nextInt();
 
  check cobj = new check();
  cobj.Calculate(value);
  
 }
}