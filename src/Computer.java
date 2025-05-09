public class Computer implements MusicPlayer, VideoPlayer{
    @Override
    public void playVideo() {
        System.out.println("O computador está assistindo o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computador está pausando o video");
    }

    @Override
    public void stopVideo() {
        System.out.println("O computador paro o video");
    }

    @Override
    public void playMusic() {
        System.out.println("O computador está tocando música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O computador parou a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computador está pausando a música");
    }
}
