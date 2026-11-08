public class PackageItem implements DeliveryItem {
    private String trackingId;
    private double weightKg;
    private double volumeM3;
    private double declaredValue;

    public PackageItem(String trackingId, double weightKg, double volumeM3, double declaredValue) {
        this.trackingId = trackingId;
        this.weightKg = weightKg;
        this.volumeM3 = volumeM3;
        this.declaredValue = declaredValue;
    }

    public String getTrackingId() { return trackingId; }
    public double getWeightKg() { return weightKg; }
    public double getVolumeM3() { return volumeM3; }
    public double getDeclaredValue() { return declaredValue; }

    @Override
    public void accept(ParcelVisitor visitor) {
        visitor.visitPackage(this);
    }
}