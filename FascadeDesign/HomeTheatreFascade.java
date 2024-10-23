public class HomeTheatreFascade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;

    public HomeTheatreFascade(Amplifier amplifier, Screen screen, DvdPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;

    }

    public void watchMovie(String movie) {
        System.out.println("Getting ready to watch movie");
        screen.down();
        projector.on();
        projector.setWideScreenMode();
        amplifier.on();
        amplifier.increaseVolume();
        dvdPlayer.on();
        dvdPlayer.play(movie);

    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.stop();
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
    }

}
