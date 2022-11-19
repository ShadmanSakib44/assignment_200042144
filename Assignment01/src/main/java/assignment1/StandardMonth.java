package assignment1;

public class StandardMonth extends Month {
    public StandardMonth(Integer day, Integer month, Integer year) throws DateException {
        super(day, month, year);
        this.setMaximum_days(30);
        this.day_checker();
    }
}