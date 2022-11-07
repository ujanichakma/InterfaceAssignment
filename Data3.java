public class Data3 {
    public static double average(Person[]objects){
        double sum = 0;
        for(Person obj:objects){
            sum = sum + obj.getMeasure3();
        }
        return sum/objects.length;
    }
    public static Person getMax(Person[]objects){
        if(objects.length<0)
        {
            return null;
        }
        Person max3 = objects[0];
        for(int i=0;i<objects.length;i++){
            if(objects[i].getMeasure3()> max3.getMeasure3()){
                max3 = objects[i];
            }
        }
        return max3;
    }
}
