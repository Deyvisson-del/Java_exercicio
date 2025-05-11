public class Notebook implements VideoPlayer {
    @Override
    public void stopVideo() {
        System.out.println("O notebook parou o video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O notebook pausou video");
    }

    @Override
    public void playVideo() {
        System.out.println("O notebook iniciou o video");
    }
}
