import java.util.Scanner;
class check
{
  public boolean Calculate(int no1)
  {
     if(no1 % 2 == 0)
     {
      return true;
     }
     else
     {
      return false;
     }
 }
}

class program6
{
  public static void main(String[] args) {
  boolean bret = false;
  Scanner sobj = new Scanner(System.in);

  System.out.println("Enter Number:");
  int value = sobj.nextInt();
 
  check cobj = new check();
  bret = cobj.Calculate(value);
  if(bret == true)
  {
    System.out.println("Number is even");
  }
  else
  {
    System.out.println("Number is odd");
  }
  
 }
}