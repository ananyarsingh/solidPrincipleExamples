package LiskovSubstitutionBadExample;

public class ReadOnly extends File{
    public void writeFile(){
        throw new RuntimeException("This is a read-only method.");
    }
}
