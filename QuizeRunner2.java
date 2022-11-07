public class QuizeRunner2 {
    public static void main(String[] args) {
        Measurable2 [] m2 = new Quiz2[3];
        m2[0] = new Quiz2(90,"A+");
        m2[1] = new Quiz2(88,"A");
        m2[2] = new Quiz2(85,"A-");

        double avg = Data2.max(m2);
        Quiz2 max = (Quiz2) Data2.max1(m2);
        System.out.println("Average is:"+avg);
        System.out.println("Maximum Number:"+max.getScore());
        System.out.println("Maximum Grade:"+max.getGrade());
    }
}
