package at.moritz.projects.Camera;

import at.moritz.projects.phone.PhoneFile;

import java.util.List;
import java.util.Set;

public class SD_card {
    private int capacity;
    private List<PictureFiles> pictures;

    public SD_card(int capacity) {
        this.capacity = capacity;
        this.pictures = pictures;
    }

    public void Save (PictureFiles Pic){
        System.out.println();

        this.capacity += getCapacity();
        System.out.println(capacity);
        if (capacity > 1){
            System.out.println("Capacity is full. You can either add a new SD-Card or delete Pics");
        }
    }


    public int getCapacity() {
        return capacity;
    }

    public List<PictureFiles> getPictures() {
        return pictures;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPictures(List<PictureFiles> pictures) {
        this.pictures = pictures;
    }
}