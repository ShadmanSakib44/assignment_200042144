package assignment1;

public class ExtendedMonth extends Month{
    public ExtendedMonth(Integer day, Integer month, Integer year) throws DateException {
        super(day, month, year);
        this.setMaximum_days(31);
        this.day_checker();
    }
}
