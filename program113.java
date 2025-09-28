/////////////////////////////////////////////////////////////////
// file name   - program113.c
// description - write a program to accsepct a array from user and sort by using bubble sort
// Author = Vaibhav mukund kulkarni
///////////////////////////////////////////////////////////////////////


import java.util.Scanner;
class  Display
{
  Scanner sobj = new Scanner(System.in);

  public void Accept(int Arr[],int size)
  {
    System.out.println("Enter the element");
    int i = 0;
    for(i = 0;i<size;i++)
    {
       Arr[i] = sobj.nextInt();
    }
  }

  public void display(int Arr[],int size)
  {
    System.out.println("Elements from the Array are:");
    int i = 0;
    for(i = 0;i<size;i++)
    {
       System.out.println(Arr[i]);
    }
  }

  public void BubbleSort(int Arr[],int size)
  {
    int i = 0,j = 0,temp = 0;

    for(i = 0;i < size;i++)
    {
      for(j = 0;j < size-1;j++)
      {
        if(Arr[j] > Arr[j+1])
        {
          temp = Arr[j];
          Arr[j] = Arr[j + 1];
          Arr[j+1] = temp;
        }
      }
    }
  }
}

class program113
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);
    System.out.println("Enter Number of frequency:");
    int no1 = sobj.nextInt();

    int Arr[] = new int[no1];

    Display dobj = new Display();

    dobj.Accept(Arr, no1);
    dobj.display(Arr, no1);
    dobj.BubbleSort(Arr, no1);
    System.out.println("Data after sorting");
    dobj.display(Arr, no1);
  }
}