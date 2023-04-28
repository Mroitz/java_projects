package at.moritz.projects.phone;

public class SIM {
    private int ID;
    private String number;


    public SIM(int ID, String number) {
        this.ID = ID;
        this.number = number;
    }

    public void doCall(String number){
        System.out.println(number + " called");
    }
    public int getID() {
        return ID;
    }

    public String getNumber() {
        return number;
    }
}
