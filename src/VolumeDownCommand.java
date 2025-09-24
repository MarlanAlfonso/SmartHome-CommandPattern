public class VolumeDownCommand implements Command {
    private MusicPlayer player;
    private int prevVolume;

    public VolumeDownCommand(MusicPlayer player) { this.player = player; }

    @Override
    public void execute() {
        prevVolume = player.getVolume();
        player.decreaseVolume();
    }

    @Override
    public void undo() { player.setVolume(prevVolume); }
}
