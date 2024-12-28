public abstract class DataParser {
    public void readData() {
        System.out.println("Reading data from a file");
    }
    public abstract void processData();

    public final void parseData() {
        readData();

        processData();
    }
}
