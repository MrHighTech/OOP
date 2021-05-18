package Utils;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Path;

public class VotingFilter implements DirectoryStream.Filter<Path> {

    @Override
    public boolean accept(Path entry) throws IOException {
        String path = entry.toString();

        return (path.endsWith("-jury.txt") || path.endsWith("-televoting.txt"));
    }
}
