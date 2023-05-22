package store;

import product.concretProduct.ConcretProduct;
import product.productFactory.ProductFactory;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Store {
//    private List<ProductFactory> list = new ArrayList<>();
    WareHouse list = new WareHouse();
    public void showProduct(){
        System.out.println(list.toString());
    }
    public void addProduct(ConcretProduct product , int quantify){
        list.addProduct(product , quantify);
    }

    public Optional<ConcretProduct> byProduct(String name , int count){
        for(ProductFactory productFactory : list.getList()){
           if(productFactory.getQuantify() >= count && productFactory.getName().equals(name)){
               return productFactory.byProduct(count);
           }
        };
        return Optional.empty();
    }

//    @Override
//    public String toString() {
//        StringBuilder res = new StringBuilder();
//        list.forEach((index) -> {
//            res.append(index.getDescription() + index.getQuantify() + "\n");
//        });
//        return new String(res);
//    }
}
