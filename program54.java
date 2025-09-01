import java.util.*;
class Arrayx
{
  public void AcceptAndDisplay(int Arr[],int size)
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

  public void MaximumMinimum(int Arr[],int size)
  {
    int imax = 0,imin = 0;

    if(Arr == null && size <= 0)
    {
      System.out.println("Invalid Syntax:\n");
    }

     imax = Arr[0];
     for(int i = 0;i<size;i++)
    {
      if(Arr[i] > imax)
      {
        imax = Arr[i];
      }
    }

     imin = Arr[0];
     for(int i = 0;i<size;i++)
    {
      if(Arr[i] < imin)
      {
        imin = Arr[i];
      }
    }
     System.out.println("Maximum element is:"+imax);
     System.out.println("Minimum element is:"+imin);
  }
}

 class program54
 {
  public static void main(String a[])
   {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Number");
    int isize = sobj.nextInt();

    int Arr[] = new int[isize];

    Arrayx aobj = new Arrayx();

    aobj.AcceptAndDisplay(Arr, isize);


    aobj.MaximumMinimum(Arr, isize);

   
   }
 }

 
