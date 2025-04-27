public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        runMusic(smartphone);
        runVideo(smartphone);

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
        videoPlayer.pauseVideo();
        videoPlayer.stopVideo();
    }
    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
        musicPlayer.pauseMusic();
        musicPlayer.stopMusic();
    }
}
