import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) {
        try {    
            File csvFile = new File("C:\\NHNacademy\\day04\\cities.csv");
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String line;
			while ((line = br.readLine())!=null) {
				List<String> aLine = new ArrayList<>();
				String[] lineArr = line.split(",");
				aLine = Arrays.asList(lineArr);
				System.out.println(aLine);
            }
        }
        catch (FileNotFoundException e) {

        }
        catch (IOException e) {

        }
    }
}
