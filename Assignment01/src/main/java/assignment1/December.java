package assignment1;

public class December extends Month {
    public December(Integer day, Integer month, Integer year) throws DateException {
        super(day, month, year);
        this.setMaximum_days(31);
        this.day_checker();
    }
    @Override
    public void DayAdder() {
        if (this.day == this.maximum_days) {
            this.day = 1;
            this.month = 1;
            this.year++;
        } else {
            this.day++;
        }
    }
}