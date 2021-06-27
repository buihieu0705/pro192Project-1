public class Dog {
    private int petID;
    private String dogname;
    private String dogcolor;
    private boolean doggender;
    private double price;
    private String describe;

    public Dog() {
    }

    public Dog(int petID, String dogname, String dogcolor, boolean doggender, double price, String describe) {
        this.petID = petID;
        this.dogname = dogname;
        this.dogcolor = dogcolor;
        this.doggender = doggender;
        this.price = price;
        this.describe = describe;
    }

    public int getPetID() {
        return petID;
    }

    public void setPetID(int petID) {
        this.petID = petID;
    }

    public String getDogname() {
        return dogname;
    }

    public void setDogname(String dogname) {
        this.dogname = dogname;
    }

    public String getDogcolor() {
        return dogcolor;
    }

    public void setDogcolor(String dogcolor) {
        this.dogcolor = dogcolor;
    }

    public boolean isDoggender() {
        return doggender;
    }

    public void setDoggender(boolean doggender) {
        this.doggender = doggender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return petID + "\t" + dogname + "\t" + dogcolor + "\t" + doggender + "\t" + price + "\t" + describe;
    }
    
}