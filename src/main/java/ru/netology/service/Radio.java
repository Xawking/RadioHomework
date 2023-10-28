package ru.netology.service;

public class Radio {
    private int numberOfStations;
    private int currentStation;
    private int currentVolume;
    public Radio(int numberOfStations){
        if (numberOfStations < 1){
            numberOfStations = 1;
        }

        this.numberOfStations = numberOfStations;
    }
    public Radio(){
        this.numberOfStations = 10;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getNumberOfStations(){
        return numberOfStations;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation >= numberOfStations) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
    public void setNumberOfStations(int newNumberOfStations){
        if (newNumberOfStations < 1){
            newNumberOfStations = 1;
        }
        numberOfStations = newNumberOfStations;
    }

    public void nextStation() {
        if (currentStation < numberOfStations - 1) {
            currentStation += 1;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation -= 1;
        } else {
            currentStation = numberOfStations - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
