package superset6419103.Algorithm_DataStructure.e_commerce_search;

public class Product {
    int productId;
    String productName;
    String category;

    Product(int productId, String productName, String category){
        this.productId = productId;
        this.productName = productName;
        this.category= category;
    }

    public void display(){
        System.out.println("id:"+ productId + "name:"+ productName + "category:"+ category);
    }
}

