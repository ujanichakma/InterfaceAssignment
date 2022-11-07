public class Quiz4 implements Measure{
    private double score;

    public Quiz4(double ascore) {
        score = ascore;
    }

    public static double largest(Measure[]object){
        double max = 0;
        for(Measure obj:object){
            if(obj.getMeasure()>max){
                max = obj.getMeasure();
            }
        }
        return max;
    }
    public static double smallest(Measure[]object) {
        double min = object[0].getMeasure();
        for (Measure obj : object) {
            if (obj.getMeasure() < min) {
                min = obj.getMeasure();
            }
        }
        return min;
    }
    @Override
    public double getMeasure() {
        return score;
    }
}
