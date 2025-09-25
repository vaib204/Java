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

   boolean BinarySearchEfficientInc(int no)
        {
            int iStart = 0, iEnd = 0, iMid = 0;
            boolean bFlag = false;

            if(!IncrementSorted())       // New
            {
                System.out.println("Data is not sorted");
                
                return false;
            }

            iStart = 0;
            iEnd = isize - 1;

            while(iStart <= iEnd)
            {
                iMid = iStart + ((iEnd - iStart) / 2);

                if((Arr[iMid] == no) || (Arr[iStart] == no) || (Arr[iEnd] == no))    //Change
                {
                    bFlag = true;
                    break;
                }
                else if(no < Arr[iMid])     // First half (Left window)
                {
                    iEnd = iMid - 1;
                }
                else if(no > Arr[iMid])     // Second half (Right window)
                {
                    iStart = iMid + 1;
                }
            }   // End of while

            return bFlag;
        }

 boolean IncrementSorted()
 {
  int i  = 0;
  boolean bFlag = true;

  for(i = 0;i < isize - 1;i++)
  {
    if(Arr[i] <= Arr[i+1])
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


class program112
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