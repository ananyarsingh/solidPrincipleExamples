package LiskovSubstitutionBadExample;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnly();
        file.readFile();// this works fine
        file.writeFile();// throws an exception
        // this object should not support writefile
    }
}
