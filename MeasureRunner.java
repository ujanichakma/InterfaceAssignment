public class MeasureRunner {
    public static void main(String[] args) {
        Measure measure[] = new Quiz4[3];
        measure[0] = new Quiz4(125);
        measure[1] = new Quiz4(122);
        measure[2] = new Quiz4(125);
        double mx = Quiz4.largest(measure);
        double mn = Quiz4.smallest(measure);
        System.out.println("The largest value is:  "+mx);
        System.out.println("The Smallest Number is:  "+mn);
    }
}
