public class ShippingCostVisitor implements ParcelVisitor {
    private double totalCost = 0.0;

    @Override
    public void visitPackage(PackageItem pack) {
        double cost = (pack.getWeightKg() * 450.0) + (pack.getVolumeM3() * 1200.0) + (pack.getDeclaredValue() * 0.01);
        totalCost += cost;
        System.out.println("Cost Calculation Package " + pack.getTrackingId() + ": " + cost + " KZT");
    }

    @Override
    public void visitDocument(DocumentItem doc) {
        double cost = 800.0 + (doc.isExpress() ? 700.0 : 0.0);
        totalCost += cost;
        System.out.println("Cost Calculation Document " + doc.getTrackingId() + ": " + cost + " KZT");
    }

    public double getTotalCost() {
        return totalCost;
    }
}