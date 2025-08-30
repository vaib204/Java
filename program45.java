import java.util.*;
class Arrayx
{
  public void Accept(int Arr[],int size)
   {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the Elements in array:");
    for(int i = 0;i<size;i++)
    {
       Arr[i] = sobj.nextInt();
    }

    System.out.println("Elements from the Array are:");
    for(int i = 0;i<size;i++)
    {
      System.out.println(Arr[i]);
    }
  }
  public int Summesion(int Arr[],int size)
  {
    int isum = 0;

    for(int i = 0;i<size;i++)
    {
      isum = isum + Arr[i];
    }
    return isum;
  }
}

class program45
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Number");
    int isize = sobj.nextInt();

    int Arr[] = new int[isize];

    Arrayx aobj = new Arrayx();

    aobj.Accept(Arr, isize);

    int iret = aobj.Summesion(Arr, isize);

    System.out.println("Summesion is :"+iret);

  }

}