import java.util.*;

class Matrix
{
  public int Arr[][];

  public Matrix(int A,int B)
  {
    Arr = new int[A][B];
  }
}

class program100
{
  public static void main(String a[])
  {
    Matrix mobj = new Matrix(4, 3);

    System.out.println(mobj.Arr.length);
    System.out.println(mobj.Arr[0].length);


  }
}