import java.util.List;

public class CalculationService {
    public static <T extends Comparable<? super T>> max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        T max = list.get(0);

        for (T i : list) {
            if (i.compareTo(max) > 0) {
                max = i; 
            }
        }

        return max;
    }    
}
