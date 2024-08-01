package fileio;

public class EntireeSheet {

    private int numofguests;
    private int numofchicken;
    private int numofbeef;
    private int numofveggie;
    private int totalmeals;

    public EntireeSheet(int numofguests, int numofchicken, int numofbeef, int numofveggie) {
        this.numofguests = numofguests;
        this.numofchicken = numofchicken;
        this.numofbeef = numofbeef;
        this.numofveggie = numofveggie;
    }

    public EntireeSheet(){

    }

    public String getLineForFile(){
        return numofguests + "|" + totalmeals;
    }

    public int getNumofguests() {
        return numofguests;
    }

    public void setNumofguests(int numofguests) {
        this.numofguests = numofguests;
    }

    public int getNumofchicken() {
        return numofchicken;
    }

    public void setNumofchicken(int numofchicken) {
        this.numofchicken = numofchicken;
    }

    public int getNumofbeef() {
        return numofbeef;
    }

    public void setNumofbeef(int numofbeef) {
        this.numofbeef = numofbeef;
    }

    public int getNumofveggie() {
        return numofveggie;
    }

    public void setNumofveggie(int numofveggie) {
        this.numofveggie = numofveggie;
    }

    public int getTotalmeals() {
        return totalmeals;
    }

}
