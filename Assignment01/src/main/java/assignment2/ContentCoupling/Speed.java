package assignment2.ContentCoupling;

public class Speed {

    public double Sum(TimeDistance timeDistance) {

        timeDistance.result = timeDistance.time / timeDistance.distance;
        return timeDistance.result;
    }
}