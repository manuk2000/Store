package product.concretProduct;

public class ConcretProduct1 extends ConcretProduct{

    private String style;
    public ConcretProduct1(String name,String desctiption ,String style ) {
        super(desctiption , name);
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
