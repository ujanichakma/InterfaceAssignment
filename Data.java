public class Data {
    public static double max(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        double sum = 0;
        for (Measurable obj : objects) {
            sum = sum + obj.getMeasurable();

        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        else {
            return 0;
        }
    }

    public static double max1(Measurable[] objects) {
        if (objects.length == 0) {
            return 0;
        }
        Measurable max = objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable mn = objects[i];
            if (mn.getMeasurable() > max.getMeasurable()) {
                max = mn;
            }
        }
        if (objects.length > 0) {
            return max.getMeasurable();

        }
        else
            return  0;
    }
}
