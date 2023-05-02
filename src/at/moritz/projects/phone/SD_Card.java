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

    public void getFiles() {
        for (int i = 0; i < files.size(); i++) {
            this.files.get(i).getInfo();
        }
    }

    public int getFreeSpace() {
        int size = 0;
        for (int i = 0; i < files.size(); i++) {
            size += this.files.get(i).getSize();
        }
        return capacity - size;
    }
    public int getCapacity() {
        return capacity;
    }
}
