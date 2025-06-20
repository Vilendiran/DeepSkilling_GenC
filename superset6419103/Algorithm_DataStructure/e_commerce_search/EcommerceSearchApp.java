package superset6419103.Algorithm_DataStructure.e_commerce_search;

public class EcommerceSearchApp {
    public static void main(String[] args) {
        Product[] products = {
             new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Watch", "Accessories"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Bag", "Travel")
        };

        String searchTerm = "watch";

        //linear search

        Product foundLinear = searchAlgorithm.linearSearch(products, searchTerm);
        if(foundLinear != null){
            System.out.println("Linear Search Result");
            foundLinear.display();
        }else{
            System.out.println("Not found");
        }

        //binary search

        Product foundBinary = searchAlgorithm.linearSearch(products, searchTerm);
        if(foundBinary != null){
            System.out.println("binary search Result");
            foundBinary.display();
        }else{
            System.out.println("Not found");
        }



    }
}
