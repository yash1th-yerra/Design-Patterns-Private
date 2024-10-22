public class Netflix extends Video{

    public Netflix(VideoProcessor processor){
        super(processor);
    }

    @Override
    public void play(String videoFile) {
        processor.process(videoFile);
    }


    
}
