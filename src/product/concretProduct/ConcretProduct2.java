package product.concretProduct;

import java.util.IllegalFormatCodePointException;

public class ConcretProduct2 extends ConcretProduct {
    private int length;
    public ConcretProduct2(String desctiption ,String name ,int length ) {
        super(desctiption , name);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
