package notifiServise;

import subscriber.ISubscriber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NotifyServis {
    private Map<Event, ArrayList<ISubscriber>> list =  new HashMap<>();
    {
        Arrays.stream(Event.values()).forEach(type -> {
            list.put(type , new ArrayList<>());
        });
    }
    public void addSubscriber(ISubscriber subscriber , Event type){
        list.get(type).add(subscriber);
    }
    public void removeSubscriber(ISubscriber subscriber , Event type){
        list.get(type).remove(subscriber);
    }
    public void notifySubscriber(Event type){
        list.get(type).forEach(subscriber -> subscriber.send());
    }

}