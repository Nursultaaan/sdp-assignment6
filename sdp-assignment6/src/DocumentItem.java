public class DocumentItem implements DeliveryItem {
    private String trackingId;
    private int pageCount;
    private boolean isExpress;

    public DocumentItem(String trackingId, int pageCount, boolean isExpress) {
        this.trackingId = trackingId;
        this.pageCount = pageCount;
        this.isExpress = isExpress;
    }

    public String getTrackingId() { return trackingId; }
    public int getPageCount() { return pageCount; }
    public boolean isExpress() { return isExpress; }

    @Override
    public void accept(ParcelVisitor visitor) {
        visitor.visitDocument(this);
    }
}