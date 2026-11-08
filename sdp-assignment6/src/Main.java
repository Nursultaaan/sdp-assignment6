public class Main {
    public static void main(String[] args) {
        DeliveryBatch batch = new DeliveryBatch();
        batch.addItem(new PackageItem("PKG-771", 12.5, 0.08, 45000.0));
        batch.addItem(new PackageItem("PKG-992", 34.0, 0.15, 120000.0));
        batch.addItem(new DocumentItem("DOC-101", 45, true));

        System.out.println("=== Security Rules Check ===");
        SecurityCheckVisitor securityVisitor = new SecurityCheckVisitor();
        batch.accept(securityVisitor);
        System.out.println("Batch approved for shipping: " + (securityVisitor.isApproved() ? "YES" : "NO"));

        System.out.println("\n=== Shipping Cost Calculation ===");
        ShippingCostVisitor costVisitor = new ShippingCostVisitor();
        batch.accept(costVisitor);
        System.out.println("Total batch cost: " + costVisitor.getTotalCost() + " KZT");
    }
}