package at.moritz.projects.phone;

import java.util.ArrayList;
import java.util.List;

public class SD_Card {
    private int capacity;
    private List<PhoneFile> files;

    public SD_Card(int capacity) {
        this.capacity = capacity;
        this.files = new ArrayList<>();
    }
    public void save (PhoneFile file){
        files.add(file);
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getFiles() {
        return files;
    }
}
