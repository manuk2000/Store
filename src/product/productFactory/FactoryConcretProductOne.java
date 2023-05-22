package product.productFactory;

import product.concretProduct.ConcretProduct;

import java.util.Optional;

public class FactoryConcretProductOne extends ProductFactory{

    public FactoryConcretProductOne(ConcretProduct product) {
        super(product);
    }
    @Override
    public Optional<ConcretProduct> byProduct(int count) {
        System.out.println("use carefully!!");
        return super.getProduct(count);
    }
}
