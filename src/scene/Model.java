package scene;

import java.util.ArrayList;
import java.util.List;

public class Model {
    protected List<ModelListener> listenerList=new ArrayList<>();
    public Model(ModelListener l){
        listenerList.add(l);
    }
    public void addModelLister(ModelListener l){
        listenerList.add(l);
    }
    protected void fireListeners(){
        for(ModelListener l:listenerList)l.modelChanged();
    }
}
