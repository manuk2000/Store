package product.productFactory;

import notifiServise.Event;
import notifiServise.NotifyServis;
import product.concretProduct.ConcretProduct;
import subscriber.ISubscriber;

import javax.swing.text.html.Option;
import java.util.Optional;

public abstract class ProductFactory {
    private int quantify = 0;
    private ConcretProduct product;
    private NotifyServis notify = new NotifyServis();
    public ProductFactory(ConcretProduct product ,int quantify) {
        this.product = product;
        this.quantify = quantify;
    }
    public ProductFactory(ConcretProduct product) {
        this.product = product;
    }
    public void addQuantify(int count){
        quantify += count;
    }
    protected Optional<ConcretProduct> getProduct(int count){
        if(quantify - count > 0){
            quantify -= count;
            return Optional.ofNullable(product);
        }
        System.out.println("Not faund");
        return Optional.empty();
    }
    abstract public Optional<ConcretProduct> byProduct(int count);
    public void appendSubscriber(ISubscriber subscriber ,Event type){
        notify.addSubscriber(subscriber , type);
    }
    public void removeSubscriber(ISubscriber subscriber ,Event type){
        notify.removeSubscriber(subscriber , type);
    }
    public String getDescription(){
        return product.getDesctiption();
    }

    public int getQuantify() {
        return quantify;
    }
    public String getName(){
        return product.getName();
    }
    @Override
    public String toString() {
        return product.toString()  + " " + quantify;
    }
}
