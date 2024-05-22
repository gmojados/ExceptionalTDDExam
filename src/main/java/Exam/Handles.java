package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Handles {

    private Map<String, String> mapOfHandles;

    public Handles() {
        this(new HashMap<>());

    }

    public Handles(Map<String, String> mapOfHandles) {
        this.mapOfHandles = mapOfHandles;
    }

    public void addHandle(String name, String handle){
        mapOfHandles.put(name, handle);
    }
    public boolean checkHandle(String userHandle) {
       if (mapOfHandles .containsValue(userHandle)){
       return true;
       }else {
           return false;
       }
    }

    public void displayName () {
        for (Map.Entry<String, String> entry : mapOfHandles.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }


    @Override
    public String toString() {
        return "Handles{" +
                "mapOfHandles=" + mapOfHandles +
                '}';
    }


}




