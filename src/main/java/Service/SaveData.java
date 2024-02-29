package Service;

import model.Human;
import java.io.FileWriter;
import java.io.IOException;

public class SaveData {
    Human human;

    public SaveData(Human human) {
        this.human = human;
    }

    public void save() throws IOException {
        String FileName = human.getSurname()+ ".txt";
        try (FileWriter fileWriter = new FileWriter(FileName, true)) {
            fileWriter.write(human.toString().concat("\n"));
        }
    }
}
