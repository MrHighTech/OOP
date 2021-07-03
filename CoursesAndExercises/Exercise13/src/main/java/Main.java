import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import jxl.read.biff.BiffException;

public class Main {

    public static void main(String[] args) throws IOException, BiffException {

        //save zip from url
        String url = "https://www.izbori.hr/lokalni2021/rezultati/1/zip/ZUP_21.zip";
        String file = "ZUP_21.zip";
        try ( InputStream is = new BufferedInputStream(new URL(url).openStream())) {
            //one line solution to copy Inputstream contents to file
            Files.copy(is, Path.of(file), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}