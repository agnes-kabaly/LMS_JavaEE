package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "curriculum")
public class Curriculum {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    private boolean isPublished;

    private String content;

    private String author;

    private LocalDateTime postedDate;

    private LocalDateTime deadline;

    private int maxPoint;

    public Curriculum() {
    }

    public Curriculum(LocalDateTime postedDate, LocalDateTime deadline) {
        this.postedDate = postedDate;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public int getMaxPoint() {
        return maxPoint;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public void setMaxPoint(int maxPoint) {
        this.maxPoint = maxPoint;
    }


}
