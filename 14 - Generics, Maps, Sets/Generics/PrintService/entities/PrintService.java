import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> values = new ArrayList<>(); 

    public PrintService() {};

    public void addValue(T v) {
        values.add(v);
    } 

    public T first() {
        if (values.isEmpty()) {
            throw new IllegalStateException("List is empty!"); 
        }
        return values.get(0);
    }

    public void print() {
        System.out.print("[");
        if (!values.isEmpty()) {
            System.out.print(values.get(0));
        }
        for (int i = 1; i < values.size(); i++) {
            System.out.print(", " + values.get(i));
        }
        System.out.println("]");
    }
}
