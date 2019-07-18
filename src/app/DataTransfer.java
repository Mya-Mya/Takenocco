package app;

import java.util.Map;

public class DataTransfer {
    private Map<String,Object> data;
    public DataTransfer(){

    }
    public void add(String k,Object v){
        data.put(k,v);
    }
    public Object get(String k){
        return data.get(k);
    }
}
