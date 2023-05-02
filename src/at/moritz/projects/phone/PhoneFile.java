package at.moritz.projects.phone;

public class PhoneFile {
    private String extension;
    private int size;
    private String name;

    public PhoneFile(int size, String name, String extension) {
        this.size = size;
        this.name = name;
        this.extension = extension;
    }

    public void getInfo(){
        System.out.println(this.size + ", " + this.name + ", " + this.extension);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
