public class Main {
    public static void main(String[] args) {
        Product product =new Product(1,"laptop",5000,2);


        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        System.out.println(product.get_kod());


    }
}
