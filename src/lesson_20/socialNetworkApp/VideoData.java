package lesson_20.socialNetworkApp;

import java.util.Comparator;
import java.util.Objects;

public class VideoData implements Comparable<VideoData> {
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoData videoData = (VideoData) o;
        return Objects.equals(title, videoData.title) && Objects.equals(description, videoData.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description);
    }
    public int compareTo(VideoData o){
        return Integer.compare(likeCount, o.likeCount);
    }
}
