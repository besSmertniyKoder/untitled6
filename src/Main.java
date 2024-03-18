public class Main {
    public static void main(String[] args) {
        Warehouse<Integer, Double> warehouse = new Warehouse<>();
        Product<Integer> product1 = new Product<>(87583);
        Product<Integer> product2 = new Product<>(3788573);
        warehouse.addProduct(product1, 45.0);
        warehouse.addProduct(product2, 300.32);
        System.out.println(product1.getName() +":"+warehouse.getProductQuantity(product1));
        System.out.println(product2.getName() +":"+warehouse.getProductQuantity(product2));
        warehouse.removeProduct(product2);
        System.out.println(product1.getName()+":" +warehouse.getProductQuantity(product1));
//        System.out.println(product2.getName() +warehouse.getProductQuantity(product2));

    }
}
