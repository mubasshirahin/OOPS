package Online.Online6;

// Abstract class for Media
abstract class MediaPlayer {
    abstract void play(String fileName);
    abstract void addFileToPlaylist(String list, String fileName);
}

// Music Player class
class MusicPlayer extends MediaPlayer {
    @Override
    void play(String fileName) {
        System.out.println("Playing the File: " + fileName);
    }

    @Override
    void addFileToPlaylist(String list, String fileName) {
        System.out.println("Adding File: " + fileName + " to the List: " + list);
    }
}

// Video Player class
class VideoPlayer extends MediaPlayer {
    @Override
    void play(String fileName) {
        System.out.println("Playing the File: " + fileName);
    }

    void addSubtitles(String fileName, String subtitle) {
        System.out.println("Adding Subtitles: " + subtitle + " to the File: " + fileName);
    }
    @Override
    void addFileToPlaylist(String list, String fileName) {
        System.out.println("Adding File: " + fileName + " to the List: " + list);
    }
}

// GrooveMusic class implementing both Music and Video functionalities
class GrooveMusic extends VideoPlayer {
    @Override
    void addFileToPlaylist(String list, String fileName) {
        System.out.println("Adding File: " + fileName + " to the Playlist: " + list);
    }

    void record(String fileName, double duration) {
        System.out.println("File: " + fileName + ", Recorded for " + duration + " Seconds");
    }

    void changeSpeed(String fileName, double speed) {
        System.out.println("Changing Speed of File: " + fileName + " to Speed: " + speed);
    }
}

// VLC class with all functionalities of a MediaPlayer
class VLC extends MediaPlayer {
    @Override
    void play(String fileName) {
        System.out.println("Playing the File: " + fileName);
    }

    void streamVideo(String website) {
        System.out.println("Streaming Video from Website: " + website);
    }

    @Override
    void addFileToPlaylist(String list, String fileName) {
        System.out.println("Adding File: " + fileName + " to the List: " + list);
    }
}

// Main class to demonstrate functionality
public class SetA{
    public static void main(String[] args) {
        GrooveMusic grooveMusic = new GrooveMusic();
        VLC vlc = new VLC();

// GrooveMusic functionalities
        grooveMusic.play("song.mp3");
        grooveMusic.addFileToPlaylist("MyPlaylist", "song.mp3");
        grooveMusic.addSubtitles("movie.mp4", "subtitles.srt");
        grooveMusic.record("recorded_audio.mp3", 60);
        grooveMusic.changeSpeed("fast_audio.mp3", 1.5);

// VLC functionalities
        vlc.play("video.mp4");
        vlc.addFileToPlaylist("VideoPlaylist", "video.mp4");
        vlc.streamVideo("http://example.com/stream");
    }
}