package at.moritz.projects.Camera;

public class PictureFiles {
    private String name;
    private String date;
    public PictureFiles(String name, String date, Camera.Resolution resolution) {
        System.out.println(this.name = name);
        System.out.println(this.date = date);

        if (resolution == Camera.Resolution.small){

            System.out.println("2gb");
        }
        if (resolution == Camera.Resolution.medium){
            System.out.println("4gb");
        }
        if (resolution == Camera.Resolution.big){
            System.out.println("6gb");
        }
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

}