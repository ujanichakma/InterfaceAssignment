public class Quiz implements Measurable{
    private double score;
    public Quiz(double ascore) {
        score = ascore;
    }


    @Override
    public double getMeasurable() {
        return score;
    }
}
