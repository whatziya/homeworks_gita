package lesson_20.socialNetworkApp;

public class VideoData {
    private String title;
    private String description;
    private int likeCount;
    private int dislikeCount;

    public VideoData(String title, String description) {
        this.title = title;
        this.description = description;
        this.likeCount = 0;
        this.dislikeCount = 0;
    }

    @Override
    public String toString() {
        return "VideoData{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", likeCount=" + likeCount +
                ", dislikeCount=" + dislikeCount +
                '}';
    }
}
