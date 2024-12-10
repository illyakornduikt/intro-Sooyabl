package object;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class OBJ_Chest extends SuperObject{
    public OBJ_Chest() {
        name = "Chest";
        try {
            image = ImageIO.read(new File("javaSwingProject/res/objects/chest (OLD).png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}