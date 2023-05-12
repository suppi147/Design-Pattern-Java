import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{
    private List<Box> children = new ArrayList<>();
    
    public CompositeBox(Box ... boxes){
        children.addAll(Arrays.asList(boxes));
    }

    @Override
    public double calculatePrice() {
        return children.stream().mapToDouble(Box::calculatePrice).sum();
    }
}
