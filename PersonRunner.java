public class PersonRunner {
    public static void main(String[] args) {
        Person person[] =  new Quiz3[3];
        person[0] = new Quiz3("Al-Amin",70);
        person[1] = new Quiz3("Rakib",66);
        person[2] = new Quiz3("Tamim ", 65);

        double average = Data3.average(person);
        Quiz3 max3 = (Quiz3) Data3.getMax(person);
        System.out.println("Average height (in inch) :"+average);
        System.out.println("Name of the tallest Person:"+max3.getName());
    }
}
