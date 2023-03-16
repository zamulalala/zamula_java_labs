package lab3;

import java.util.Objects;

public class PianoKey {
    private double freq;

    private boolean isPressed;


    public PianoKey(double freq) {
        this.freq = freq;
        this.isPressed = false;
    }

    public double getFreq() {
        return freq;
    }

    public void setFreq(double freq) {
        this.freq = freq;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PianoKey pianoKey = (PianoKey) o;
        return pianoKey.freq == getFreq();
    }

    @Override
    public int hashCode() {
        return Objects.hash(freq);
    }

    @Override
    public String toString() {
        return "Piano Key :" +
                "freq=" + freq;
    }

}
