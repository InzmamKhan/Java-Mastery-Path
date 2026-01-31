package Advanced_Stubbing.Custom_Answer;

public class Speaker_Service {
    Speaker speaker;

    public Speaker_Service(Speaker speaker) {
        this.speaker = speaker;
    }

    String try_speak(String data){
        return speaker.speak(data);
    }
}