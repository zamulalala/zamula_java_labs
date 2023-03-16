package lab3;

public class Lab3_3_8 {
    public static void main(String[] args) throws InterruptedException {
        double[] arrayTunedKeys =   {261.63, 277.18, 293.66, 311.13, 329.63, 349.23, 369.99, 392.00,
                415.30, 440.00, 466.16, 493.88};
        double[] arrayMusic = {261.63, 440.00, 440.00, 415.30, 440.00, 369.99, 293.66, 261.63};

        PianoKey[] pianoKeys = new PianoKey[]{
                new PianoKey(261),
                new PianoKey(277),
                new PianoKey(293),
                new PianoKey(311),
                new PianoKey(329),
                new PianoKey(349),
                new PianoKey(369),
                new PianoKey(392),
                new PianoKey(415),
                new PianoKey(440),
                new PianoKey(466),
                new PianoKey(493)
        };


        Piano casio = new Piano(pianoKeys);

        System.out.println(casio);

        casio.tunePiano(arrayTunedKeys);

        System.out.println(casio);

        casio.playPiano(arrayMusic);



    }


}




//    	  Си первой октавы	493.88
//        A#	Ля-диез первой октавы	466.16
//        A	Ля первой октавы	440.00
//        G#	Соль-диез первой октавы	415.30
//        G	Соль первой октавы	392.00
//        F#	Фа-диез первой октавы	369.99
//        F	Фа первой октавы	349.23
//        E	Ми первой октавы	329.63
//        D#	Ре-диез первой октавы	311.13
//        D	Ре первой октавы	293.66
//        C#	До-диез первой октавы	277.18
//        C	До первой октавы	261.63