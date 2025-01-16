package LiskovSubstitutionGoodExample;

public class Main {
    public static void readAnyFile(ReadableFile file){
        file.read();
    }
    public static void main(String[] args) {
        // WriteableFile is a child class which supports both read and write
        // ReadableFile is a parent class which supports only write
         WriteableFile writeableFile = new WriteableFile();
         writeableFile.write();
         writeableFile.read();

         ReadableFile readableFile = new ReadableFile();
         readableFile.read();

         //by using method
         readAnyFile(readableFile);
         readAnyFile(writeableFile);

    }
}
