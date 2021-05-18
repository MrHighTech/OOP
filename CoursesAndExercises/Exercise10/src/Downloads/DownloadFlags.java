package Downloads;

import Utils.PointsUtil;

import java.io.*;
import java.net.URL;
import java.nio.file.*;
import java.util.*;

public class DownloadFlags {

    public static void main(String[] args) throws IOException {
        List<Integer> years = getYears();

        for (int year : years) {
            Map<String, Integer> standings = PointsUtil.getForYear(year);

            for (String country : standings.keySet()) {
                System.out.println("Downloading " + country);
                String destination = String.format("data/%d/%s.png", year, country);
                String imageAddress = String.format("https://cdn.countryflags.com/thumbs/%s/flag-400.png", country.replace(' ', '-').toLowerCase());
                saveImage(imageAddress, destination);
            }
        }
    }

    private static List<Integer> getYears() throws IOException {
        List<Integer> list = new LinkedList<>();
        for(Path p : Files.newDirectoryStream(Path.of("data"))) {
            if (Files.isDirectory(p)) {
                String dirName = p.getFileName().toString();
                try {
                    int year = Integer.parseInt(dirName);
                    list.add(year);
                }
                catch(Exception e) {} //An acceptable empty catch as there is nothing to do about
            }
        }
        return list;
    }

    private static void saveImage(String imageAddress, String destination) {
        try {
            URL url = new URL(imageAddress);
            try(InputStream input = new BufferedInputStream(url.openStream())){
                try(BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(destination))) {
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = input.read(buffer, 0, 1024)) != -1) {
                        output.write(buffer, 0, bytesRead);
                    }
                }
            }
        }
        catch(Exception exc) {
            System.out.format("Failed to download from %s %n%s" , imageAddress, exc.getMessage());
        }

    }
}
