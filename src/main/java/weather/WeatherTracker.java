package weather;

public class WeatherTracker {
    String currentConditions;
    Media media;

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        switch(weatherDescription) {
            case "rainy" -> media = new Phone();
            case "sunny" -> media = new Email();
        }

        printWeatherAlert(media);
    }

    public void printWeatherAlert(Media media) {
        System.out.print(media.generateWeatherAlert(currentConditions));
    }
}