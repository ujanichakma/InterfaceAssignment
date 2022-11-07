public class Quiz2 implements Measurable2{
    private double score;
    private String Grade;

    public Quiz2(double ascore, String agrade) {
        score = ascore;
        Grade = agrade;

    }
    public double getScore() {
        return score;
    }
    public String getGrade(){
        return Grade;
    }
    @Override
    public double getMeasurable2() {
        return score;
    }
}
