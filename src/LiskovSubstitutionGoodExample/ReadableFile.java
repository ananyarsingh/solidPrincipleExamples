package LiskovSubstitutionGoodExample;

public class ReadableFile implements Readable{
    @Override
    public void read() {
        System.out.println("Reading file");
    }
}
