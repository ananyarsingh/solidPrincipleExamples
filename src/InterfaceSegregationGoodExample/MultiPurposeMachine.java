package InterfaceSegregationGoodExample;

import InterfaceSegregationBadExample.Document;

public class MultiPurposeMachine implements Printer, Scanner, Copier{
    @Override
    public void copyFrom(Document document) {
        System.out.println("MultiPurposeMachine copy from " + document);
    }

    @Override
    public void print(Document document) {
    System.out.println("MultiPurposeMachine print from " + document);
    }

    @Override
    public void scan(Document document) {
        System.out.println("MultiPurposeMachine scan from " + document);
    }
}
