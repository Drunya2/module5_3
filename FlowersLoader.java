package Module5_3;

import java.io.BufferedReader;
import java.io.FileReader;

public class FlowersLoader {
    public static Flowers[] load(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line = br.readLine();
            String[] elements = line.split(",");

            Flowers[] flowers = new Flowers[elements.length];

            for(int i = 0; i < flowers.length; i++) {

                // flowers[i] = String.parseString(elements[i]);


            }
            return flowers;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
