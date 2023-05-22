package product.productFactory;

import product.concretProduct.ConcretProduct;

import java.util.Optional;

public class FactoryConcretProductTwo extends ProductFactory{

    public FactoryConcretProductTwo(ConcretProduct product) {
        super(product);
    }
    @Override
    public Optional<ConcretProduct> byProduct(int count) {
        System.out.println("free to use!");
        return super.getProduct(count);
    }
}
