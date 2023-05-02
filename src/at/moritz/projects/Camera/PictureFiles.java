package at.moritz.projects.Camera;

public class PictureFiles {
    private String name;
    private String date;
    private Size size;
    public enum Size {small,medium,big}
    public PictureFiles(String name, String date, Size size) {
        this.name = name;
        this.date = date;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public Size getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
