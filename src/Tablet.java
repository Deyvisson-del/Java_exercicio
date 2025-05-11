public class Tablet implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("Iniciando música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("pausando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("parando música");
    }

    @Override
    public void playVideo() {
        System.out.println("Tablet: Iniciando video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Tablet: Pausando video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Tablet: Parando video");
    }
}
