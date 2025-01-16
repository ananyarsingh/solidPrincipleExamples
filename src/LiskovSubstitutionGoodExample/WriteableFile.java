package LiskovSubstitutionGoodExample;

public class WriteableFile  extends ReadableFile implements Writeable {
    @Override
    public void write() {
        System.out.println("WriteableFile");
    }
}
