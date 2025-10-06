import java.util.*;
import java.io.*;

class program10
{
  public static void main(String[] args)
  {
    try
    {
      Scanner sobj  = new Scanner(System.in);

      System.out.println("Enter the name of source file");
      String Source = sobj.nextLine();

      System.out.println("Enter the name of Destination file");
      String Destination = sobj.nextLine();

      File fSource  = new File(Source);
      if(fSource.exists() == false)
      {
        System.out.println("Source file is not present..");
        return;
      }

      File fDestination = new File(Destination);
      if(fDestination.exists() == false)
      {
        System.out.println("Destination file is present..");
        return;
      }
        fDestination.createNewFile();

        FileInputStream fiobj = new FileInputStream(fSource);
        FileOutputStream foobj = new FileOutputStream(fDestination);

        byte Buffer[] = new byte[1024];
        int iret = 0;

        while ((iret = fiobj.read(Buffer))!= -1)
        {
           foobj.write(Buffer,0,iret);
        }
        System.out.println("File copy done");
    }
    catch(Exception eobj)
    {}
  }
}