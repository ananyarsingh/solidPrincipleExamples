package InterfaceSegregationBadExample;

public class MultiPurposeMachine implements Machine{
    @Override
    public void print(Document document) {
        System.out.println("MultiPurposeMachine print");
    }

    @Override
    public void scan(Document document) {
        System.out.println("MultiPurposeMachine scan");
    }

    @Override
    public void copyFrom(Document document) {
        System.out.println("MultiPurposeMachine copyFrom");
    }
}
