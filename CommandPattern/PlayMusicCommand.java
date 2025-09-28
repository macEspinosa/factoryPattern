public class PlayMusicCommand implements Command {
    private MusicPlayer player;
    private String playlist;
    public PlayMusicCommand(MusicPlayer player, String playlist) {
        this.player = player;
        this.playlist = playlist;
    }
    @Override
    public void execute() {
        player.playPlaylist(playlist);
    }
}