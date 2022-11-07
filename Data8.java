public class Data8 {
    public static Measurable max1(Object[]objects) {
        if (objects.length == 0) {
            return null;
        }
        Measurable max = (Measurable) objects[0];
        for (int i = 0; i < objects.length; i++) {
            Measurable mn = (Measurable) objects[i];
            if (mn.getMeasurable() > max.getMeasurable()) {
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
}
