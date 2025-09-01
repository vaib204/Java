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

  public int Frequency(int Arr[],int size,int search)
  {
    boolean bflag = false;
    int icount = 0;

    if(Arr == null && size <= 0)
    {
     return icount;
    }

     for(int i = 0;i<size;i++)
    {
      if(Arr[i] == search)
      {
       icount++;
      }
    }
     return icount;
  }
}

 class program51
 {
  public static void main(String a[])
   {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Number");
    int isize = sobj.nextInt();

    int Arr[] = new int[isize];

    Arrayx aobj = new Arrayx();

    aobj.AcceptAndDisplay(Arr, isize);

    System.out.println("Enter the Number that you want to search:");
    int isearch = sobj.nextInt();

    int iret = aobj.Frequency(Arr, isize,isearch);

    System.out.println("Frequency of search element is:"+iret);
   }
 }

 
