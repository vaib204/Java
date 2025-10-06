import java.util.*;
import java.io.*;


class program6
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
      System.out.println("File already exist");

      FileInputStream fiobj = new FileInputStream(fobj);

      byte Arr[] = new byte[10];

       fiobj.read(Arr);
       String str = new String(Arr);
       System.out.println("Data from file:"+str);

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