package Restaurant;

public class Restaurant2 {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("CheeseBurger", "Beef", 8.99, "Sandwich", true);
        MenuItem item2 = new MenuItem("Chicken Sandwich", "Chicken", 8.99, "Sandwich", true);
        MenuItem item3 = new MenuItem("French Fries", "Fried Potatoes", 6.50, "Appetizers", true);
        MenuItem item4 = new MenuItem("Margarita", "Lime and Tequila", 12.50, "Cocktails", true);
        MenuItem item5 = new MenuItem("Chicken Nuggets", "Chicken Bites", 6.50, "Kids Menu", true);

        Menu myMenu = new Menu();
        myMenu.addMenuItem(item1);
        myMenu.addMenuItem(item2);
        myMenu.addMenuItem(item3);
        myMenu.addMenuItem(item4);
        myMenu.addMenuItem(item5);

//        System.out.println(myMenu.toString());
//        System.out.println(item1.toString());
//        System.out.println(item1.equals(item3));
    }
}

