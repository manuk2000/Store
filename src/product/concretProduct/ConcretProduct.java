package product.concretProduct;

public abstract class ConcretProduct {
    private String name;
    private String desctiption;

    protected ConcretProduct(String desctiption , String name) {
        this.desctiption = desctiption;
        this.name = name;
    }

    public String getDesctiption() {
        return desctiption;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
     return name + "  " + desctiption;
    }
}
