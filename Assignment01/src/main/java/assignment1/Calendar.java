package assignment1;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    public List < Integer > StandardMonth;
    public List < Integer > ExtendedMonth;
    public Month month;
    public Calendar(Integer day, Integer month, Integer year) throws DateException {
        set_Calendar(day, month, year);
    }

    public Calendar(String input) throws DateException {
        String[] date = input.split("/");
        set_Calendar(Integer.valueOf(date[0]), Integer.valueOf(date[1]), Integer.valueOf(date[2]));
    }

    private void set_Calendar(Integer day, Integer month, Integer year) throws DateException {
        StandardMonth = Arrays.asList(4, 6, 9, 11);
        ExtendedMonth = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        if (StandardMonth.contains(month)) {
            if (day > 30 || day < 1) {
                throw new DateException("Date is not correct");
            }
            this.month = new StandardMonth(day, month, year);

        } else if (ExtendedMonth.contains(month)) {
            if (day > 31 || day < 1) {
                throw new DateException("Date is not correct");
            }
            this.month = new ExtendedMonth(day, month, year);
        } else if (month == 2) {
            if (day > 29 || day < 1) {
                throw new DateException("Date is incorrect");
            }
            this.month = new February(day, month, year);
        } else {
            throw new DateException("Month is not correct");
        }

    }
    public void addDays(int days) throws DateException {
        int i = 0;
        while (i < days) {
            i++;
            this.addDay();

        }

    }
    public void addDay() throws DateException {
        this.month.DayAdder();
        set_Calendar(this.month.getDay(), this.month.getMonth(), this.month.getYear());
    }
    @Override
    public String toString() {
        String day = ("0" + String.valueOf(this.month.getDay()));
        day = day.substring(day.length() - 2);
        String month = ("0" + String.valueOf(this.month.getMonth()));
        month = month.substring(month.length() - 2);
        String year = ("000" + String.valueOf(this.month.getYear()));
        year = year.substring(year.length() - 4);
        return day + "/" + month + "/" + year;
    }

}