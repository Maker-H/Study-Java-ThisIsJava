package sec04_resource.exam01_collections;

public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

    public Product(int pno, String name, String company, int price) {
        this.pno = pno;
        this.name = name;
        this.company = company;
        this.price = price;
    }

    @Override
    public String toString() {
        return new StringBuilder()
            .append("pno : " + pno + ", ")
            .append("name : " + name + ", ")
            .append("company : " + company + ", ")
            .append("price : " + price + ", ")
            .toString();
    }
}
