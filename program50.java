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

  public boolean search(int Arr[],int size,int search)
  {
    if(Arr == null && size <= 0)
    {
      return false;
    }

    boolean bflag = false;
     for(int i = 0;i<size;i++)
    {
      if(Arr[i] == search)
      {
        bflag = true;
        break;
      }
    }
    return bflag;
  }
}

 class program50
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

    boolean iret = aobj.search(Arr, isize,isearch);

    if(iret == true)
    {
      System.out.println("Number is present:");
    }
    else
    {
      System.out.println("Number is not  present:");
    }
   }
 }

 
