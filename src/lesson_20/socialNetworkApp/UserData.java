package lesson_20.socialNetworkApp;


import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserData {
    private String username;
    private String nickname;
    List<VideoData> videoDataList;

    public UserData(String username, String nickname){
        this.username = username;
        this.nickname = nickname;
        this.videoDataList = new ArrayList<>();
    }
    void openSocialRepository(SocialRepository social){
        if(social.userDataList.contains(this)){
            System.out.println("You have already been registered!");
        } else{
            social.userDataList.add(this);
            System.out.println("Registered successfully!");
        }
    }
    void addVideo(VideoData videoData){
        if(videoDataList.contains(videoData)){
            System.out.println("This video already exists!");
        } else {
            videoDataList.add(videoData);
            System.out.println("Video has been added successfully!");
        }
    }
    void addVideos(List<VideoData> playList){
        playList.forEach(videoData -> addVideo(videoData));
    }
    void removeVideo(VideoData videoData){
        if(videoDataList.contains(videoData)){
            videoDataList.remove(videoData);
            System.out.println("You deleted the video!");
        } else {
            System.out.println("Video does not exist!");
        }
    }
    void likeTheVideo(VideoData videoData){
        for (int i = 0; i < videoDataList.size(); i++) {
            VideoData temp = videoDataList.get(i);
            if(temp.equals(videoData)){
                temp.setLikeCount(temp.getLikeCount() + 1);
                break;
            }
        }
    }
    void dislikeTheVideo(VideoData videoData){
        for (int i = 0; i < videoDataList.size(); i++) {
            VideoData temp = videoDataList.get(i);
            if(temp.equals(videoData)){
                temp.setLikeCount(temp.getDislikeCount() + 1);
                break;
            }
        }
    }
    void getAllVideos(){
        SocialRepository.getAllVideos();
    }
    void getTopVideos(int count){
        SocialRepository.getTopVideos(count);
    }
    void getMyVideos(){
        SocialRepository.getAllVideosByUser(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(username, userData.username) && Objects.equals(nickname, userData.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, nickname);
    }
}
