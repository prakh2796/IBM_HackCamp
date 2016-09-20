package contacts.prakhar.example.com.contactmanager;

/**
 * Created by Pewds on 20-Sep-16.
 */
public class contactItem {
    private String name;
    private int number;

    public contactItem(){}

    public contactItem(String name, int number){
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
