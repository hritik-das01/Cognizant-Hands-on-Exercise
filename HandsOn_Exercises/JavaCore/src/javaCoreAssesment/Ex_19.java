package javaCoreAssesment;

interface Playable {
    void play();
}

class Guitar implements Playable {
    public void play() {
        System.out.println("Strumming guitar chords.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing piano keys.");
    }
}

public class Ex_19 {

	public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play();
        piano.play();
    }
}