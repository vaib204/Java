import java.util.*;


class Calculation
{
  public int Count(int val)
  {
    int idigit = 0,icount = 0;

    while (val != 0)
    {
       idigit = val % 10;
       if(idigit == 1)
       {
          icount++;
       }
       val = val / 10;
    }
    return icount;
  }
   
}

class program59
{
  public static void main(String Arg[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter First Number:");
    int no1 = sobj.nextInt();

    Calculation cobj = new Calculation();

    int iret = cobj.Count(no1);

    System.out.println("total number of 1 is:"+iret);

  }
}