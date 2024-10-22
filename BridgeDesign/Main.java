public class Main {
    public static void main(String[] args){
        Video youtubeVideo = new Youtube(new HDProcessor());
        youtubeVideo.play("abs.mp4");
        Video netflixVideo = new Netflix(new HDProcessor());
        netflixVideo.play("abs.mp4");
    }
    
}
