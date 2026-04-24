package ru.netology.statistic;

public class Radio {
    private int currentRadioStationNumber;
    private int SoundVolume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }


    public void next() {
        if (currentRadioStationNumber != maxStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = 0;
        }

    }

    public void increaseVolume() {
        if (SoundVolume < 100) {
            SoundVolume = SoundVolume + 1;
        }
    }

    public void reduceVolume() {
        if (SoundVolume > 0) {
            SoundVolume = SoundVolume - 1;
        }
    }


    public int getSoundVolume() {
        return SoundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < 0) {
            return;
        }
        if (soundVolume > 100) {
            return;
        }
        SoundVolume = soundVolume;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int currentRadioStationNumber) {
        if (currentRadioStationNumber < 0) {
            return;
        }
        if (currentRadioStationNumber > maxStation) {
            return;
        }
        this.currentRadioStationNumber = currentRadioStationNumber;

    }


}

