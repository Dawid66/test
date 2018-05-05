package pl.kszafran.sda.algo.exercises;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static java.util.Comparator.comparing;

public class Exercises3 {

    /**
     * Znajduje wszystkie pliki o nazwie pasującej do podanego wyrażenia regularnego
     * w podanym katalogu i wszystkich jego podkatalogach.
     * <p>
     * Zwrócone pliki są posortowane alfabetycznie po pełnej ścieżce (nie tylko nazwie pliku).
     * <p>
     * Jeśli directory wskazuje na plik, zwrócona lista ma zawierać tylko ten plik
     * (jeśli jego nazwa pasuje do wyrażenia regularnego).
     * <p>
     * Uwaga: należy skupić się na klasach z pakietu java.io.
     */
    public List<File> findFiles(File directory, String regex) throws IOException {
        if (directory.isFile()) {
            if (directory.getName().matches(regex)) {
                return singletonList(directory);
            } else return emptyList();
        }
        File[] files = directory.listFiles();
        if (files == null) {
            return emptyList();
        }

        List<File> list= new ArrayList<>();
        for (File file : files) {
            if (file.isDirectory()) {
                list.addAll(findFiles(file, regex));
            } else if (file.getName().matches(regex)) {
                list.add(file);
            }
        }
        list.sort(comparing(File::getAbsolutePath));
        return list;
    }



    /**
     * Działa tak samo jak findFiles().
     * <p>
     * Uwaga: należy korzystac z dobrodziejstw pakietu java.nio.file.
     */
    public Stream<Path> findFilesNIO(Path directory, Pattern regex) throws IOException {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
