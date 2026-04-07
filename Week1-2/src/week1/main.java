import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(new Transaction("id1", 10.5, "10:00"));
        transactions.add(new Transaction("id2", 25.0, "09:30"));
        transactions.add(new Transaction("id3", 5.0, "10:15"));

        // Bubble Sort
        BubbleSortTransactions.bubbleSort(transactions);
        System.out.println("Bubble Sort: " + transactions);

        // Insertion Sort
        InsertionSortTransactions.insertionSort(transactions);
        System.out.println("Insertion Sort: " + transactions);

        // Outliers
        OutlierDetector.findHighFees(transactions);
    }
}