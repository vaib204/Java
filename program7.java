import java.util.*;

class Checkx
{
  public boolean divisible(int no)
  {
    if(no % 5 == 0 && no % 3 == 0)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}


class program7
{
  public static void main(String a[])
  {
    boolean bret = false;
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter a Number:");
    int no = sobj.nextInt();

    Checkx cobj = new Checkx();
    
    bret = cobj.divisible(no);

    if(bret == true)
    {
       System.out.println(" Number is divisible by 5 and 3\n");
    }
    else
    {
      System.out.println("Number is not Divisible by 5 and 3\n");
    }
  }
}