/* lbarjak 2018.07.01- */
package csv;

class CSVOps {
    
    void start() throws Exception {
        CSVParser parser = new CSVParser();
        parser.read();
    }

    public static void main(String[] a) throws Exception {
        CSVOps csvops = new CSVOps();
        csvops.start();
    }
}
