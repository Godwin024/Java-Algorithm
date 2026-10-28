package fileCreations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileCreator {

        public static void main(String[] args) {
            //1. Defining the path that points to the file you are trying to work with
            //Unix - home/gamp/Desktop....


           // String fileLocation = "/home/gamp/Desktop/";
          try {
//              String fileLocation = "a/b/c/d/../../e/f/..";
              String fileLocation = "/home/gamp/Desktop/google.txt";
              Path path = Paths.get(fileLocation);
//              System.out.println(path.getFileSystem());
//              System.out.println(path.getRoot());
              String quote = "Go home and let connect online asap";
              byte[] fileContent = quote.getBytes();
               Files.write(path, fileContent);

              //2. Use a method of class files to work with the path.
          }catch(IOException e) {
              e.printStackTrace();
              System.err.println(e.getMessage());
          }
        }


}
