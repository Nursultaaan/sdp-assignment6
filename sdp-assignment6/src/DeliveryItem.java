public interface DeliveryItem {
    void accept(ParcelVisitor visitor);
}