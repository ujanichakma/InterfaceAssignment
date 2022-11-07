public class Data2 implements Measurable2{
    public static double max(Measurable2[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Measurable2 obj : objects) {
            sum = sum + obj.getMeasurable2();

        }
        if (objects.length > 0) {
            return sum / objects.length;
        } else return 0;
    }

    public static Measurable2 max1(Measurable2[] objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable2 max = objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable2 mn = objects[i];
            if (mn.getMeasurable2() > max.getMeasurable2()) {
                max = mn;
            }
        }
        if(objects.length>0) {
            return max;
        }
        else
        {
            return null;
        }

    }

    @Override
    public double getMeasurable2() {
        return 0;
    }
}
