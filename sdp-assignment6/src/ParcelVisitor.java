public interface ParcelVisitor {
    void visitPackage(PackageItem pack);
    void visitDocument(DocumentItem doc);
}