public class MusicPlayer {
    private String name;
    private boolean playing = false;
    private String currentPlaylist = null;
    private int volume = 50; // 0-100

    public MusicPlayer(String name) { this.name = name; }

    public void play(String playlist) {
        currentPlaylist = playlist;
        playing = true;
        System.out.println(name + " playing playlist: " + playlist + " (volume=" + volume + ")");
    }

    public void stop() {
        playing = false;
        System.out.println(name + " stopped");
    }

    public void increaseVolume() { setVolume(volume + 5); }
    public void decreaseVolume() { setVolume(volume - 5); }

    public void setVolume(int volume) {
        volume = Math.max(0, Math.min(100, volume));
        System.out.println(name + " volume: " + this.volume + " -> " + volume);
        this.volume = volume;
    }

    public int getVolume() { return volume; }
    public boolean isPlaying() { return playing; }
    public String getCurrentPlaylist() { return currentPlaylist; }
}
