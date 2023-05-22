import product.concretProduct.ConcretProduct1;
import store.Store;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        ConcretProduct1 concretProduct1 = new ConcretProduct1("apley", "big", "style One");
        store.addProduct(concretProduct1  , 2);
        store.showProduct();
        System.out.println(store.byProduct("apley", 1).get());
    }
}