/////////////////////////////////////////////////////////////////
// file name   - program105.c
// description - write a program to accsepct a array from user and arrange the Array in Decrement sorted manner
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

 boolean DecrementSorted()
 {
  int i  = 0;
  boolean bFlag = true;

  for(i = 0;i < isize - 1;i++)
  {
    if(Arr[i] > Arr[i+1])
    {
    continue;
    }
    else
    {
      bFlag = false;
      break;
    }
  }
  return bFlag;
 }

}


class program111
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

    boolean bret = dobj.DecrementSorted();
    if(bret == true)
    {
      System.out.println("Data is sorted in decrement order");
    }
    else
    {
      System.out.println("Data is  not sorted in decrement order");
    }
  }
}