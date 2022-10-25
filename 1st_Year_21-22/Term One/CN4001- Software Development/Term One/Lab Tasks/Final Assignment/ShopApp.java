import java.util.*;

public class ShopApp {

  public static void main(String args[]) {

    Product[] arrayName = new Product[5];
    arrayName[0] = new Product("Bread", 10, 1.00);
    arrayName[1] = new Product("Ham", 14, 1.50);
    arrayName[2] = new Product("Butter", 13, 1.20);
    arrayName[3] = new Product("Chease", 11, 0.90);
    arrayName[4] = new Product("Tomato", 12, 0.15);
    menu(arrayName);
    // displayStock(arrayName/* this is passing value to displays tock method */);
    // buyStock(arrayName);
    // displayStock(arrayName);
    // sellStock(arrayName);
    // displayStock(arrayName);
    // setPrice(arrayName);
    // displayStock(arrayName);
    // stockPrice(arrayName);

    // System.out.println("new stock level: " + arrayName[0].getStockLevel());
  }

  public static void displayStock(Product[] productIn/* this is receving value */) {
    for (int i = 0; i < productIn.length; i++) {
      System.out.print(i + 1);
      System.out.print(" Product name: " + productIn[i].getName());
      System.out.print(" Stock Level: " + productIn[i].getStockLevel());
      System.out.println(" Product price: " + productIn[i].getPrice());
    }
  }

  public static void buyStock(Product[] productIn) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Which stock you want to buy");
    int stock = sc.nextInt();
    System.out.println("Enter how much you want to buy");
    int ammount = sc.nextInt();
    stock = stock - 1;

    productIn[stock].buyStock(ammount);

  }

  public static void sellStock(Product[] productIn) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Which stock you want to sell");
    int stock = sc.nextInt();
    System.out.println("Enter how much you want to sell");
    int ammount = sc.nextInt();
    stock = stock - 1;

    productIn[stock].sellStock(ammount);
  }

  public static void setPrice(Product[] productIn) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter in which ston you want to change price:");
    int stock = sc.nextInt();

    System.out.println("Enter new price");
    int newPrice = sc.nextInt();
    stock = stock - 1;
    productIn[stock].setPrice(newPrice);
  }

  public static void stockPrice(Product[] productIn) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter in which stock you want to calculate:");
    int stock = sc.nextInt();
    stock = stock - 1;
    System.out.println(productIn[stock].getPrice() * productIn[stock].getStockLevel());

  }

  public static void menu(Product[] arrayName) {
    int choice;

    Scanner sc = new Scanner(System.in);

    System.out.println("[1]");
    System.out.println("[2]");
    System.out.println("[3]");
    System.out.println("[4]");
    System.out.println("[5]");

    System.out.println("[Enter choice [1-5]");
    choice = sc.nextInt();

    switch (choice) {
      case '1':
        displayStock(arrayName);
        break;

      case '2':

        break;
      case '3':

        break;
      case '4':

        break;
      case '5':

        break;

      default:
        System.out.println("enter num between 1 and 5");

    }

  }

}