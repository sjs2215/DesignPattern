package ch10.Q4;

public class Main {
    public static void main(String[] args) {
        String[] data = {
            "Dumpty", "Bowman", "Carroll", "Elfland", "Alice",
        };
        SortAndPrint sap = new SortAndPrint(data, new InsertSorter());
        sap.execute();
    }
}
