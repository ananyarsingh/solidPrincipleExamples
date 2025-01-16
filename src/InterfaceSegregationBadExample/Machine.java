package InterfaceSegregationBadExample;

public interface Machine {
    void print(Document document);
    void scan(Document document);
    void copyFrom(Document document);
}
