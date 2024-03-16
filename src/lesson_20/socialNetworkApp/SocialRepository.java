package lesson_20.socialNetworkApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocialRepository {
    private static SocialRepository instance;
    static List<UserData> userDataList;

    private SocialRepository() {
        this.userDataList = new ArrayList<>();
    }
    public static SocialRepository getInstance() {
        if (instance == null) {
            instance = new SocialRepository();
        }
        return instance;
    }
    void addVideo(UserData userData, VideoData videoData){
        for (int i = 0; i < userDataList.size(); i++) {
            if(userDataList.get(i).equals(userData)){
                UserData temp = userDataList.get(i);
                temp.addVideo(videoData);
            }
        }
    }
    void addVideos(UserData userData, List<VideoData> videos){
        for (int i = 0; i < userDataList.size(); i++) {
            if(userDataList.get(i).equals(userData)){
                UserData temp = userDataList.get(i);
                temp.addVideos(videos);
            }
        }
    }
    void removeVideo(UserData userData, VideoData videoData){
        for (int i = 0; i < userDataList.size(); i++) {
            if(userDataList.get(i).equals(userData)){
                UserData temp = userDataList.get(i);
                temp.removeVideo(videoData);
            }
        }
    }
    void likeTheVideo(VideoData videoData){
        for (UserData userData : userDataList) {
            for (VideoData video : userData.videoDataList) {
                if(video.equals(videoData)){
                    video.setLikeCount(video.getLikeCount() + 1);
                }
            }
        }
    }
    void dislikeTheVideo(VideoData videoData){
        for (UserData userData : userDataList) {
            for (VideoData video : userData.videoDataList) {
                if(video.equals(videoData)){
                    video.setDislikeCount(video.getDislikeCount() + 1);
                }
            }
        }
    }
    static void getAllVideos(){
        for (UserData userData : userDataList) {
            for (VideoData video : userData.videoDataList) {
                System.out.println(video.toString());
            }
        }
    }
    static void getAllVideosByUser(UserData userData){
        for (int i = 0; i < userDataList.size(); i++) {
            if(userDataList.get(i).equals(userData)){
                UserData temp = userDataList.get(i);
                for (VideoData videoData : temp.videoDataList) {
                    System.out.println(videoData.toString());
                }
            }
        }
    }
    static void getTopVideos(int count){
        List<VideoData> videolar = new ArrayList<>();
        for (UserData userData : userDataList) {
            videolar.addAll(userData.videoDataList);
        }
        Collections.sort(videolar);
        for (int i = 0; i < count; i++) {
            System.out.println(i + videolar.get(i).toString());
        }
    }
}
