public class Main {
    public static void main(String[] args) {
        System.out.println("Parsing csv file....");
        DataParser csvParser = new CSVParser();
        csvParser.parseData();

        System.out.println("\nParsing xml file....");
        DataParser xmlParser = new XMLParser();
        xmlParser.parseData();

        System.out.println("\nParsing json file....");
        DataParser jsonParser = new JSONParser();
        jsonParser.parseData();
    }
}