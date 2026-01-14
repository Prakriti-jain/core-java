package FileManagement;
/*
Files in java is used to represent the name and path of a file or directory. Methods like creating,
deleting, and extracting information are provided. For this the package java.io.package.

I/O Streams - these are fundamentals for handling input and output operations. They provide
uniform ways to read, write files. These are categorized into two types depending on the
type of data they handle -

- Byte Streams - this is used to handle raw binary data like images, audio files, videos.
8-bit bytes of data are used. It has two main abstract classes - InputStream (for reading data)
and OutputStream (for writing data)

- Character Streams - these are used to handle text data. they work with 16-bit Unicode
characters. It has two main abstract classes - Reader (Base class for all character based
input stream) and Writer (base class for all character based output streams)
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileMgt {
    static void main()  {
        //Creating a File
        try {
            File obj = new File("myfile.txt");

            if(obj.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File exists already");
            }
        } catch (IOException e) {
            System.out.println("error in file creating");
            e.printStackTrace();
        }


        //Writing to a File
        try {
            FileWriter writer = new FileWriter("myfile.txt");
            writer.write("I am revising Java topics\n");
            writer.write("I am loving it");
            writer.close();
            System.out.println("Successfully written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Reading from file
        try{
            File obj = new File("myfile.txt");
            Scanner sc = new Scanner(obj);

            //traversing in file data
            while(sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //Deleting a File
        try{
            File obj = new File("myfile.txt");
            if(obj.delete()) {
                System.out.println("File deleted");
            } else {
                System.out.println("Failed to delete file");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
