import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers;
    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPrecipitationPercentage() {
        return precipitationPercentage;
    }

    private int precipitationPercentage;

    public WeatherStation(int temp,int humidity,int precipitationPercentage){
        this.observers=new ArrayList<>();
        this.temperature=temp;
        this.humidity=humidity;
        this.precipitationPercentage=precipitationPercentage;
    }
    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
      int t=observers.indexOf(obs);
      if(t>=0){
          observers.remove(obs);
      }else{
          System.out.println("Not a subscriber!!");
      }
    }

    @Override
    public void notifyObserver() {
       for(Observer obs:observers){
           obs.update(this);
       }
    }

    public void updateWeatherData(int temp, int humidity,int precipitationPercentage){
        System.out.println("--------UPDATE------------");
        this.temperature=temp;
        this.humidity=humidity;
        this.precipitationPercentage=precipitationPercentage;
        notifyObserver();
    }


}
