package youTubeFileCreation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;

public class YouTubeFileCreator {
    public static void main(String[] args) throws IOException {
//        String videoUrl = "https://www.youtube.com";
        String videoUrl = "https://res.cloudinary.com/maps/public/uploads/";
        URI uri= URI.create(videoUrl);
        try(
            InputStream inputStream = uri.toURL().openStream();
            FileOutputStream fileOutputStream = new FileOutputStream("Video.mp4");

        ){
            byte[] bytes = inputStream.readAllBytes();
            System.err.println("raw video bytes::" + Arrays.toString(bytes));
            fileOutputStream.write(bytes);
        }catch(IOException exception){
            exception.printStackTrace();
        }

    }
}
