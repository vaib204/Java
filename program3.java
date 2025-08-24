import java.util.Scanner;
class check
{
  public void Calculate(int no1,int no2)
  {
    float percentage = 0.0f;

    percentage = ((float) no1 / no2)*100;

    System.out.println("percentage is :"+percentage);
  }
}

class program3
{
  public static void main(String[] args) {
  
  Scanner sobj = new Scanner(System.in);
  System.out.println("Enter total marks:");
  int total = sobj.nextInt();

  System.out.println("Enter obtained marks:");
  int obtained = sobj.nextInt();

  check cobj = new check();
  cobj.Calculate(total, obtained);
  
 }
}