package ru.netology.service.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.service.Radio;

public class RadioTest {
    @Test
    public void setNextStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.nextStation();
        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setNextStationWhen9(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPreviousStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.previousStation();
        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void setPreviousStationWhen0(){
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.previousStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseVolumeWhen100(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolume(){
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseVolumeWhen0(){
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationSetterTestAbove(){
        Radio radio = new Radio();
        radio.setCurrentStation(15);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationSetterTestBelow(){
        Radio radio = new Radio();
        radio.setCurrentStation(-5);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeSetterTestAbove(){
        Radio radio = new Radio();
        radio.setCurrentVolume(150);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeSetterTestBelow(){
        Radio radio = new Radio();
        radio.setCurrentVolume(-10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNumberSetterTest(){
        Radio radio = new Radio();
        radio.setNumberOfStations(25);
        int expected = 25;
        int actual = radio.getNumberOfStations();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationNumberSetterTestBelow(){
        Radio radio = new Radio();
        radio.setNumberOfStations(-25);
        int expected = 1;
        int actual = radio.getNumberOfStations();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void creatingRadio(){
        Radio radio = new Radio(12);

        int expected = 12;
        int actual = radio.getNumberOfStations();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotCreate0StationRadio(){
        Radio radio = new Radio(0);

        int expected = 1;
        int actual = radio.getNumberOfStations();
        Assertions.assertEquals(expected, actual);
    }


}
