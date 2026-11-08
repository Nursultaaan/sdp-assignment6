public class SecurityCheckVisitor implements ParcelVisitor {
    private boolean hasViolations = false;

    @Override
    public void visitPackage(PackageItem pack) {
        if (pack.getWeightKg() > 30.0) {
            System.out.println("Security Package " + pack.getTrackingId() + " exceeds courier weight limit (30 kg): " + pack.getWeightKg() + " kg!");
            hasViolations = true;
        } else {
            System.out.println("Security Package " + pack.getTrackingId() + " passed security check.");
        }
    }

    @Override
    public void visitDocument(DocumentItem doc) {
        if (doc.getPageCount() > 500) {
            System.out.println("Security Document " + doc.getTrackingId() + " is too heavy for an envelope (" + doc.getPageCount() + " pages)!");
            hasViolations = true;
        } else {
            System.out.println("Security Document " + doc.getTrackingId() + " passed security check.");
        }
    }

    public boolean isApproved() {
        return !hasViolations;
    }
}