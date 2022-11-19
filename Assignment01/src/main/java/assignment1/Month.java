package assignment1;

import java.util.Date;

public abstract class Month {
    public Integer day;
    public Integer month;
    public Integer year;
    public Integer maximum_days;

    public Month(Integer day, Integer month, Integer year) throws DateException {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {

        return year;
    }

    public void setDay(Integer day) throws DateException {
        if (day < 0) {
            throw new DateException("Date is not correct");

        }

        this.day = day;
    }

    public void setMonth(Integer month) throws DateException {
        if (month < 0 || month > 12) {
            throw new DateException("Date is not correct");
        }
        this.month = month;
    }

    public void setYear(Integer year) throws DateException {
        if (year < 0) {
            throw new DateException("Date is not correct");

        }
        this.year = year;
    }

    public void setMaximum_days(Integer maximum_days) throws DateException {
        if (maximum_days > 31 || maximum_days < 0) {
            throw new DateException("Number of days are not correct");
        }
        this.maximum_days = maximum_days;
    }
    public void day_checker() throws DateException {
        if (this.day > this.maximum_days) {
            throw new DateException("Date is not correct");
        }
    }
    public void DayAdder() {
        if (this.day == this.maximum_days) {
            this.month = 1;
            this.day = 1;
            this.year++;
        } else {
            this.day++;
        }
    }

}