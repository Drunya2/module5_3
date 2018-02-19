package Module5_3;

import java.io.FileWriter;

public class FlowersSaver {
    public static void save(String fileName, Flowers[] flowers) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < flowers.length; i++){
                writer.write(flowers[i].show() + ",");
            }
            //writer.write(flowers[flowers.length].show() + "\n");
            writer.flush();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
