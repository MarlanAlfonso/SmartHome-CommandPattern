public class MusicPlayCommand implements Command {
    private MusicPlayer player;
    private String playlist;
    private boolean prevState;
    private String prevPlaylist;

    public MusicPlayCommand(MusicPlayer p, String playlist) { this.player = p; this.playlist = playlist; }

    @Override
    public void execute() {
        prevState = player.isPlaying();
        prevPlaylist = player.getCurrentPlaylist();
        player.play(playlist);
    }

    @Override
    public void undo() {
        if (!prevState) player.stop();
        else if (prevPlaylist != null) player.play(prevPlaylist);
    }
}
