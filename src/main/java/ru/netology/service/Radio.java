package ru.netology.service;

public class Radio {
    private int currentStation;
    private int currentVolume;
    public int getCurrentStation(){
        return currentStation;
    }
    public int getCurrentVolume(){
        return currentVolume;
    }
    public void setCurrentStation(int newCurrentStation){
        if (newCurrentStation > 9){
            return;
        }
        if (newCurrentStation < 0){
            return;
        }
        currentStation = newCurrentStation;
    }
    public void setCurrentVolume(int newCurrentVolume){
        if (newCurrentVolume > 100){
            return;
        }
        if (newCurrentVolume < 0){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation += 1;
        } else {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation -= 1;
        } else {
            currentStation = 9;
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
    public void manualStationSelect(int station){
        setCurrentStation(station);
    }
}