import java.util.*;
import java.io.*;


class program12
{
  public static void main(String a[])
  {
    try
    {
      Scanner sobj = new Scanner(System.in);

      System.out.println("Enter the directory name");
      String DirName = sobj.nextLine();

      File fobj = new File(DirName);

      if(fobj.exists() && fobj.isDirectory())
      {
        System.out.println("dir is present");

        File Arr[] = fobj.listFiles();

        System.out.println("number of file in directory are:"+Arr.length);

        int i = 0;

        for(i = 0;i<Arr.length;i++)
        {
          System.out.println("file name is:"+Arr[i].getName()+"file length is:"+Arr[i].length());
        }
      }
      else
      {
        System.out.println("there is no such directroy");
      }
    }
    catch(Exception eobj)
    {}
  }
}