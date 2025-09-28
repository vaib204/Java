import java.util.*;

class Display
{
  public int Arr[];
  public int size;
  boolean sorted;

  public Display(int no1)
  {
    size = no1;
    Arr = new int[size];
    sorted = true;
  }

  public void Accsepct()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter"+size+" elements:");
    
    int i = 0;

    for(i = 0;i<size;i++)
    {
      System.out.println("Enter the Elements:"+(i+1));
      Arr[i] = sobj.nextInt();

      if((i > 0) && (sorted == true))
      {
        if(Arr[i] < Arr[i-1])
        {
             sorted = false;
        }
      }
    }
  }

  public void Display()
  {
    int i = 0;
    System.out.println("Elements from the Array:\n");
    for(i = 0;i < size; i++)
    {
      System.out.print(Arr[i] + "\t");
    }
  }

  public void BubbleSort()
  {
    int i = 0, j = 0 ,temp = 0;

    for(i = 0;i < size;i++)
    {
      for(j = 0;j < size-1;j++)
      {
        if(Arr[j] > Arr[j+1])
        {
          temp = Arr[j];
          Arr[j] = Arr[j + 1];
          Arr[j + 1] = temp;
        }
      }
    }
  }

}



class program114
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Frequency:");
    int frequency = sobj.nextInt();

    int Arr[] = new int[frequency];

    Display dobj = new Display(frequency);

    dobj.Accsepct();

    dobj.Display();

    System.out.println("\nData after sorting\n");
    dobj.BubbleSort();

    dobj.Display();


  }
}