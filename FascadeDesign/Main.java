public class Main {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheatreFascade theatre = new HomeTheatreFascade(amplifier, screen, dvdPlayer, projector);
        theatre.watchMovie("avatar");
        theatre.endMovie();

    }

}
