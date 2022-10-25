
public class Product {
   private String name;
   private int stockLevel;
   private double price;

   // recives three parameters and uses then to initialise the name of the product,
   // number of intems stocked and price
   public Product(String nameIn, int stockLevelIn, double priceIn) {
      name = nameIn;
      stockLevel = stockLevelIn;
      price = priceIn;

   }

   public double buyStock(int stockLevelIn) {
      stockLevel = stockLevel + stockLevelIn;

      return stockLevelIn;
   }

   public boolean sellStock(int stockLevelIn) {
      if (stockLevelIn > stockLevel) {
         return false;
      } else {
         stockLevel = stockLevel - stockLevelIn;
         return true;
      }

   }

   public void setPrice(double priceIn) {

      price = priceIn;
   }

   public String getName() {
      return name;

   }

   public int getStockLevel() {
      return stockLevel;

   }

   public double getPrice() {
      return price;

   }

}