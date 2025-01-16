package InterfaceSegregationBadExample;

public class SimplePrinter implements Machine{
    // Simple Printer doesn't support scanning and copy method
    // only printing is supported
    @Override
    public void print(Document document) {
        System.out.println("This is a simple printer printing the document");
    }

    @Override
    public void scan(Document document) {
        throw new UnsupportedOperationException("Scan operation is not supported");
    }

    @Override
    public void copyFrom(Document document) {
        throw new UnsupportedOperationException("Copy operation is not supported");
    }
}
