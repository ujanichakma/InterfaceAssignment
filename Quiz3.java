public class Quiz3 implements Person{
    private String name;
    private double height;

    public Quiz3(String aname, double aheight) {
        name = aname;
        height = aheight;
    }
    public String getName(){
        return name;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double getMeasure3() {
        return height;
    }
}
