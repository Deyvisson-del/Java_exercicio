  public abstract class Smartphone implements VideoPlayer, MusicPlayer {
    @Override
    public void playMusic() {
        System.out.println("O smartphone está tocando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O smart phone está pausando a música");
    }

}
