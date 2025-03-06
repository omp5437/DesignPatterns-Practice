//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       WeatherStation ws=new WeatherStation(23,45, 52);
       Observer tvObserver=new TelevisionDisplay();
       Observer mobileObserver=new MobileDisplay();
       Observer webObserver=new WebDisplay();
       ws.addObserver(tvObserver);
       ws.addObserver(mobileObserver);
       ws.addObserver(webObserver);
       ws.updateWeatherData(25,46,56);
       ws.updateWeatherData(20,55,30);
       ws.updateWeatherData(18,34,11);
       ws.removeObserver(webObserver);
       ws.updateWeatherData(18,34,11);

    }
}