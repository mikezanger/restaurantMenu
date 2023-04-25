package Restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    //Class Variables
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;
    //Constructors
    public Menu(){
        this.lastUpdated = new Date();
    }
// Methods


    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenuItem item) {
        this.menuItems.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item) {
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString() {
        String returnString = "";
        for (MenuItem item: this.menuItems) {
            returnString += item.toString() + "\n";
        }
        return returnString;
    }
}