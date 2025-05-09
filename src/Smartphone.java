public class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playVideo() {
        System.out.println("O smartphone está assistindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smartphone está pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O smartphone paro o video");
    }

    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smartphone parou a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smartphone está pausando a música");
    }


}
