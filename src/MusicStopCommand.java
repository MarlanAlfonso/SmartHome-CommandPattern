public class MusicStopCommand implements Command {
    private MusicPlayer player;
    private boolean prevState;
    private String prevPlaylist;

    public MusicStopCommand(MusicPlayer player) { this.player = player; }

    @Override
    public void execute() {
        prevState = player.isPlaying();
        prevPlaylist = player.getCurrentPlaylist();
        player.stop();
    }

    @Override
    public void undo() {
        if (prevState && prevPlaylist != null) player.play(prevPlaylist);
    }
}
