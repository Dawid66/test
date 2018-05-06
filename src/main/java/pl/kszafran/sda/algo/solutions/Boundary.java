package pl.kszafran.sda.algo.solutions;

import java.io.IOException;
import java.nio.file.Path;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public interface Boundary {
    Stream<Path> findFilesNIO(Path directory, Pattern regex) throws IOException;
}
