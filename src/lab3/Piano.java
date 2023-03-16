package lab3;

import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class Piano {

    private PianoKey[] keys;

    public Piano(PianoKey[] keys) {
        this.keys = keys;
    }

    public PianoKey[] getKeys() {
        return keys;
    }

    public void setKeys(PianoKey[] keys) {
        this.keys = keys;
    }

    @Override
    public String toString() {
        return "Piano {" +
                "keys=" + Arrays.toString(keys) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piano piano = (Piano) o;
        return Arrays.equals(keys, piano.keys);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(keys);
    }
    
    public void tunePiano(double[] freqs) {
        for (int i = 0; i < freqs.length; i++) {
            this.keys[i].setFreq(freqs[i]);
        }
    }

    public void pressKey(double freq) throws InterruptedException {
        for (PianoKey key : keys) {
            if (key.hashCode() == Objects.hash(freq)) {
                key.setPressed(true);
                TimeUnit.SECONDS.sleep(1);
                key.setPressed(false);
            }
            break;
        }
    }

    public void playPiano(double[] freqs) throws InterruptedException {
        for (double freq : freqs) {
            pressKey(freq);
            System.out.println("Нажата клавиша следующей частоты: " + freq);
        }
    }
}
