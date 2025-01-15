package Repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TSVReader {

    public static void readTsvFile(String filepath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filepath));
        for(String line:lines){
            String[] splitted = line.split("\t");
            System.out.println(Arrays.toString(splitted));
        }
    }
}
