package Independence;

public class TimeDistance {
    private Integer time, distance,result;

    public TimeDistance(Integer time, Integer distance) {
        this.time = time;
        this.distance = distance;
    }
    private void Store(int result){
        this.result=result;
    }

    public Integer getResult(){
        return this.result;
    }
    public void Speed(){
        this.Store(this.distance/this.time);
    }
}
