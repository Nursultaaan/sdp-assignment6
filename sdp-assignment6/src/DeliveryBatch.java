import java.util.ArrayList;
import java.util.List;

public class DeliveryBatch {
    private List<DeliveryItem> items = new ArrayList<>();

    public void addItem(DeliveryItem item) {
        items.add(item);
    }

    public void accept(ParcelVisitor visitor) {
        for (DeliveryItem item : items) {
            item.accept(visitor);
        }
    }
}