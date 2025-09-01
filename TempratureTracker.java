public class TempratureTracker {
    public static void main(String[] args) {
        double Sum = 0;
        double[] Temprature = {42.4, 30.2, 35.7, 44.1, 31.5, 27.7, 37.4};
        int Length = Temprature.length;
        for(int i =0; i<Length; i++){
            Sum = Sum + Temprature[i];
        }
        double Average_Temprature = Sum / Length;

        System.out.println("Average temprature of all 7 days is : " + Average_Temprature);

        double highest = Temprature[0];
        double lowest = Temprature[0];
        for(int i = 0; i<Length; i++){
            if(Temprature[i] > highest){
                highest = Temprature[i];
            }
            if(Temprature[i] < lowest){
                lowest = Temprature[i];
            }
        }
        System.out.println("Highest temprature is: " + highest);
        System.out.println("Lowest Tempratur is: " + lowest);

        for(double num : Temprature){
        System.out.println("The weekley tempratures are as follows : " + num);
        }
    }
    
}
