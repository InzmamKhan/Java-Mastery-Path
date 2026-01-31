package A_Mocking;
// The Main class which will be tested
// This class will Inject Mocks

class Wheather_service{
    Temp_Sensor sensor;

    Wheather_service(Temp_Sensor sensor){
        this.sensor = sensor;
    }

    String get_advice(){
        int temprature = sensor.get_temp();
        if(temprature <= 10){
            return "Cold";
        }
        else if(temprature > 10 && temprature <=20){
            return "Normal";
        }
        else{
            return "Hot";
        }
    }
}