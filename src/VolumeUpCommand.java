public class VolumeUpCommand implements Command {
    private MusicPlayer player;
    private int prevVolume;

    public VolumeUpCommand(MusicPlayer player) { this.player = player; }

    @Override
    public void execute() {
        prevVolume = player.getVolume();
        player.increaseVolume();
    }

    @Override
    public void undo() { player.setVolume(prevVolume); }
}
