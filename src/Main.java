public class Main {

    public static void main(String[] args) {
        var musicPlayer = new MusicPlayer() {
            @Override
            public void playMusic() {
                System.out.println("▶ Tocando música");
            }

            @Override
            public void pauseMusic() {
                System.out.println("⏸ Música pausada");
            }

            @Override
            public void stopMusic() {

            }

            @Override
            public void fastForward() {
                System.out.println("⏩ 2x");
            }

            @Override
            public void nextTackMusic() {
                System.out.println("⏭");
            }

            @Override
            public void rewind() {
                System.out.println("⏪ 2x");
            }

            @Override
            public void previousTrackMusic() {
                System.out.println("Voltar uma musica");
            }
        };




    }


}