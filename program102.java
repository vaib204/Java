import java.util.*;

class Matrix
{
  public int Arr[][];

  public Matrix(int A,int B)
  {
    Arr = new int[A][B];
  }

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Elements:");
    for(int i = 0;i<Arr.length;i++)
    {
      for(int j = 0;j<Arr.length;j++)
      {
        Arr[i][j] = sobj.nextInt();
      }
    }
  }

  public void Display()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println(" Elements fromt the Array:");
    for(int i = 0;i<Arr.length;i++)
    {
      for(int j = 0;j<Arr.length;j++)
      {
        System.out.print(Arr[i][j]+"\t");
      }
      System.out.println();
    }
  }

  public int CountEven()
  {
    int count  = 0;
     for(int i = 0;i<Arr.length;i++)
    {
      for(int j = 0;j<Arr.length;j++)
      {
        if(Arr[i][j] % 2 == 0)
        {
          count++;
        }
      }
    }
    return count;
  }
}

class program102
{
  public static void main(String a[])
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter Number of rows:");
    int rows = sobj.nextInt();

    System.out.println("Enter Number of col:");
    int col = sobj.nextInt();

   Matrix mobj = new Matrix(rows, col);

   mobj.Accept();
   mobj.Display();
   
   int iret = mobj.CountEven();
   System.out.println("Number of Even Count Is:"+iret);

  }
}