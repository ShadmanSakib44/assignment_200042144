package assignment1;

public class February extends Month{
    boolean is_leap_year(){
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)){
            return true;
        }
        else {
            return false;
        }
    }


    public February(Integer day, Integer month, Integer year) throws DateException {
        super(day, 2, year);
        if(this.is_leap_year()) {
            this.setMaximum_days(29);
        }
        else {
            this.setMaximum_days(28);
        }
        this.day_checker();


    }

}
