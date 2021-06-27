public class PetDog {
    private int ID;
    private String name;
public int getID() {
    return ID;
}

public void setID(int ID) {
    this.ID = ID;
}

public String getPetname() {
    return petname;
}

public void setPetname(String petname) {
    this.petname = petname;
}

@Override
public String toString() {
    return ID + "\t" + petname;
}
}
