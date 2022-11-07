public class QuizRunner {
    public static void main(String[] args) {
        Measurable [] m = new Quiz[3];
        m[0] = new Quiz(90);
        m[1] = new Quiz(88);
        m[2] = new Quiz(85);


        double avg = Data.max1(m);
        double max = Data.max1(m);
        System.out.println("The Average is "+max);



    }
}
