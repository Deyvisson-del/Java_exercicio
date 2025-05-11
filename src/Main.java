public class Main {

    public static void main(String[] args) {
        MusicPlayer smartphone = new Smartphone();
        VideoPlayer computer = new Computer();
        MusicPlayer musicBox = new MusicBox();
        VideoPlayer notebook = new Notebook();

        playMusic(smartphone);
        playMusic(musicBox);

        System.out.println("\n");

        pauseMusic(smartphone);
        pauseVideo(computer);
        pauseMusic(musicBox);


        System.out.println("\n");

        stopMusic(smartphone);
        stopVideo(computer);
        stopMusic(musicBox);

        playVideo(notebook);
        pauseVideo(notebook);
        stopVideo(notebook);
    }

    public static void playMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

    public static void playVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void pauseMusic(MusicPlayer musicPlayer) {
        musicPlayer.pauseMusic();
    }

    public static void pauseVideo(VideoPlayer videoPlayer) {
        videoPlayer.pauseVideo();
    }

    public static void stopMusic(MusicPlayer musicPlayer) {
        musicPlayer.stopMusic();
    }

    public static void stopVideo(VideoPlayer videoPlayer) {
        videoPlayer.stopVideo();
    }
}