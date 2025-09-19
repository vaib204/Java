/////////////////////////////////////////////////////////////////
// file name   - program105.c
// description - write a program to accsepct a array from user and perform BinraySerachInc ,     BinarySearchDec
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
//________________________________________________________________________________
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
//_______________________________________________________________________________________
 boolean BinarySearchInc(int no)
 {
   int istart = 0;
   int imid = 0;
   int iend = isize - 1;

   boolean bflag = false;

   while (istart <= iend) 
   { 
     imid = istart + ( (iend-istart)/2);

     if(Arr[imid] == no)
     {
         bflag = true;
         break;
     }
     else if(no < Arr[imid])
     {
         iend = imid-1;
     }
     else if(no > Arr[imid])
     {
         istart = imid + 1;
     }
   }
   return bflag;
 }
//________________________________________________________________________________
 boolean BinarySearchDec(int no)
 {
   int istart = 0;
   int imid = 0;
   int iend = isize - 1;

   boolean bflag = false;

   while (istart <= iend) 
   { 
     imid = istart + ( (iend-istart)/2);

     if(Arr[imid] == no)
     {
         bflag = true;
         break;
     }
     else if(no > Arr[imid])
     {
         iend = imid-1;
     }
     else if(no < Arr[imid])
     {
         istart = imid + 1;
     }
   }
   return bflag;
 }
}


class program109
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

    boolean bret = dobj.BinarySearchInc(val);
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