package Eurovision;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JuryPoints {

    private static final int[] points = new int[] {12, 10, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) throws IOException {

        if (args.length != 12)
            throw new IllegalArgumentException("Expecting 12 arguments (year, country and 10 country votes");

        String year = args[0];
        String country = args[1];

        String[] countryPoints = Arrays.copyOfRange(args, 2, 12);

        savePoints(year, country, countryPoints);
    }

    public static void savePoints(String year, String country, String[] countryPoints) throws IOException {
        String filePath = "data" + File.separator + year + File.separator + "voting" + File.separator + country + "-jury.txt";

        extracted(countryPoints, filePath);
    }

    public static void extracted(String[] countryPoints, String filePath) throws IOException {
        File file = new File(filePath);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try (FileWriter writer = new FileWriter(file)){
            for(int i = 0; i < countryPoints.length; i++) {
                writer.write(String.format("%2d %s%n", points[i], countryPoints[i]));
            }
        }
    }
}
