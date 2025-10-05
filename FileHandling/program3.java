import java.util.*;
import java.io.*;


class program3
{
  public static void main(String a[])throws Exception
  { 
    try{

      Scanner sobj  = new Scanner(System.in);
     
      System.out.println("Enter the file name that you  want to search");
    String fname = sobj.nextLine();

    File fobj = new File(fname);

    if(fobj.exists())
    {
      System.out.println("File already exist");
    }
    else
    {
      fobj.createNewFile();
      System.out.println("file succesfully created");
    }
  }
  catch(IOException iobj)
  {}
  catch(Exception eobj)
  {}
}
} 