public class OutlierDetector {

    public static void findHighFees(List<Transaction> list) {
        for (Transaction t : list) {
            if (t.fee > 50) {
                System.out.println("High fee: " + t);
            }
        }
    }
}