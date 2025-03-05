

public class MobileDisplay implements Observer{
    private WeatherStation weatherStation;
    public MobileDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;

    }
    public void subScribe(WeatherStation ws){
        ws.addObserver(this);
    }

    public void update(WeatherStation weatherStation){
        display();
        System.out.println("Temperature: "+weatherStation.getTemperature() +" C");
        System.out.println("Humidity: "+weatherStation.getHumidity());
        System.out.println("Chance of rain: "+weatherStation.getPrecipitationPercentage());

    }

    public void display(){
        System.out.println("In mobile view");
    }



    public void unsubScribe(WeatherStation ws){
        ws.removeObserver(this);
    }
}
