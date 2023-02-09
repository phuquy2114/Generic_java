import java.util.ArrayList;
import java.util.List;

public class ArrayPhuQuy<T> {

    private T model;
    private List<T> listStamp = new ArrayList<>();

    public void addPhuQuy(T model) {
        listStamp.add(model);
    }

    public void forListPhuQuy() {
        for (int i = 0; i < listStamp.size(); i++) {
            System.out.println("" + listStamp.get(i));
        }
    }

    List<T> getList() {
        return listStamp;
    }
}
