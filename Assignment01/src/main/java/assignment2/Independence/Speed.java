package assignment2.Independence;

public class Speed {
    public int Speed(int time,int distance){
        TimeDistance timeDistance= new TimeDistance(120,40);

        timeDistance.Speed();
        return timeDistance.getResult();
    }
}
