package at.moritz.projects.Camera;

import at.moritz.projects.phone.PhoneFile;

import java.util.List;

public class SD_card {
    private int capacity;
    private List<PictureFiles> pictures;

    public SD_card(int capacity) {
        this.capacity = capacity;
        this.pictures = pictures;
    }

    public void save (PictureFiles Pic){
        pictures.add(Pic);
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
