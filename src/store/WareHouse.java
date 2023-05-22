package store;

import product.concretProduct.ConcretProduct;
import product.productFactory.ProductFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WareHouse {
    private List<ProductFactory> list = new ArrayList<>();

    public List<ProductFactory> getList() {
        return list;
    }

    public void addProduct(ConcretProduct product , int quantify){
        long count = list.stream()
                .filter(factory -> factory.getName().equals(product.getName()))
                .peek(productFactory -> productFactory.addQuantify(quantify))
                .count();
        if(count == 0){
            list.add(new ProductFactory(product , quantify) {
                @Override
                public Optional<ConcretProduct> byProduct(int count) {
                    return getProduct(count);
                }
            });
        }
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        list.forEach((element) -> {
            res.append(element.toString()  +  "\n");
        });
        return new String(res);
    }
}
