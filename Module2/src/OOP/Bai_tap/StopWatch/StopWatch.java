package OOP.Bai_tap.StopWatch;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return System.currentTimeMillis() - this.startTime;
    }

    public long start(){
        return this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
}
