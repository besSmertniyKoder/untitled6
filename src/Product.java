public class Product <T>{
    private T name;

    public Product(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                '}';
    }
}
