

import java.time.LocalTime;

class Transaction {
    String id;
    double fee;
    LocalTime timestamp;

    Transaction(String id, double fee, String time) {
        this.id = id;
        this.fee = fee;
        this.timestamp = LocalTime.parse(time);
    }

    @Override
    public String toString() {
        return id + ":" + fee + "@" + timestamp;
    }
}