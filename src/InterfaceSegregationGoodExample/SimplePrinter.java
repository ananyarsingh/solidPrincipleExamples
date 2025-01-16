package InterfaceSegregationGoodExample;

import InterfaceSegregationBadExample.Document;

public class SimplePrinter implements Printer{
    @Override
    public void print(Document document) {
        System.out.println("Printing a simple document");
    }
}
