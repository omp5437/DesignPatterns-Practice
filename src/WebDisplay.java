public class WebDisplay implements Observer{
    private WeatherStation weatherStation;
    public WebDisplay(WeatherStation weatherStation){
        this.weatherStation=weatherStation;
    }
    public void update(WeatherStation weatherStation){
        display();
        System.out.println("Temperature in degree celsius: "+weatherStation.getTemperature());
        System.out.println("Humidity: "+weatherStation.getHumidity());
        System.out.println("Chance of rain: "+weatherStation.getPrecipitationPercentage());

    }

    public void display(){
        System.out.println("In web view");
    }

    public void subScribe(WeatherStation ws){
        ws.addObserver(this);
    }
    public void unsubScribe(WeatherStation ws){
        ws.removeObserver(this);
    }
}
