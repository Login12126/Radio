import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.statistic.Radio;

public class RadioTest {
    @Test
    public void RadioStationNumberMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberMoreMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberBeforeMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberMinNegative() {
        Radio radio = new Radio();

        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberMoreMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(2);
        int expected = 2;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberBeforeMinimum() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeMaX() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeMoreMaX() {  /// ////// до делать
        Radio radio = new Radio();
        radio.setSoundVolume(101);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeBeforeMaX() {
        Radio radio = new Radio();
        radio.setSoundVolume(99);
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeMoreMin() {
        Radio radio = new Radio();
        radio.setSoundVolume(1);
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeMoreMinPlus() {
        Radio radio = new Radio();
        radio.setSoundVolume(2);
        int expected = 2;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberToNextMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioStationNumberToNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumePlusMax() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumePlus() {
        Radio radio = new Radio();
        radio.setSoundVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeReduceVolume() {
        Radio radio = new Radio();
        radio.setSoundVolume(100);
        radio.reduceVolume();
        int expected = 99;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SoundVolumeReduceVolumeNegative() {
        Radio radio = new Radio();
        radio.setSoundVolume(-1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }


}





