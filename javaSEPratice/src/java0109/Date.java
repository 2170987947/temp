package java0109;

public class Date {
    public int year;
    public int month;
    public int day;

    public void setDay(Date this, int year, int month, int day) {
        this.year =year;
        this.month = month;
        this.day =day;
    }
    public void printDay() {
        System.out.println(" 樊茂茂 : " + year + "/" + month + "/" +day);
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
