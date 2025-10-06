import java.util.*;
import java.io.*;


class program8
{
  public static void main(String a[])throws Exception
  { 
    try{

      Scanner sobj  = new Scanner(System.in);
     
    System.out.println("Enter the file name that you  want to open");
    String fname = sobj.nextLine();

    File fobj = new File(fname);

    if(fobj.exists())
    {
     
      FileInputStream fiobj = new FileInputStream(fobj);

      byte Arr[] = new byte[1024];

      int iret = 0;
      
      System.out.println("Data from file is :");

      while ((iret = fiobj.read(Arr)) != -1) 
      {
        String str = new String(Arr);
        System.out.println(str);
      }
    }
    else
    {
      System.out.println("file not present in current directory");
      return;
    }
  }
  catch(IOException iobj)
  {}
  catch(Exception eobj)
  {}
}
} 