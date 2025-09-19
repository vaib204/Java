/////////////////////////////////////////////////////////////////
// file name   - program105.c
// description - write a program to accsepct a array from user and perform bidirectional on that
// time complexity n/2
// Author = Vaibhav mukund kulkarni
///////////////////////////////////////////////////////////////////////
import java.util.*;

class Display
{
  public int[] Arr;
  public int isize;

  public Display(int no)
  {
     isize = no;
     Arr = new int [isize];
  }
  
 void Accsepct()
 {
  System.out.println("Enter the Elment in the array:");
  int i = 0;
  Scanner sobj  = new Scanner(System.in);

  for(i = 0;i<isize;i++)
  {
    Arr[i] = sobj.nextInt();
  } 
 }

 void display()
 {
  System.out.println("elements from the array:");
  int i = 0;
  Scanner sobj  = new Scanner(System.in);

  for(i = 0;i<isize;i++)
  {
   System.out.println(Arr[i]);
  } 
 }

 boolean linearsearch(int no)
 {
   int istart = 0,iend = 0;
   boolean bflag = false;

   for(istart = 0,iend = isize-1;istart<=iend;istart++,iend--)
   {
    if(Arr[istart] == no||Arr[iend] == no)
    {
      bflag = true;
      break;
    }
   }
   return bflag;
 }
}

class program106
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter the frequency:");
    int freq = sobj.nextInt();

    int arr[] = new int[freq];

    Display dobj = new Display(freq);

    dobj.Accsepct();
    dobj.display();

    System.out.println("Enter the Element for searching:");
    int val  = sobj.nextInt();

    boolean bret = dobj.linearsearch(val);
    if(bret == true)
    {
      System.out.println("Element is present");
    }
    else
    {
      System.out.println("Element is not present");
    }
  }
}