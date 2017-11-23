package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table (name = "solution")
public class Solution {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int solutionId;

    @Column (nullable = false)
    private int userId;

    @Column (nullable = false)
    private int curriculumId;

    private String solutionContent;

    private String comment;

    @Column (nullable = false)
    private LocalDateTime postedDate;

    private String evaluatedBy;

    @Column (columnDefinition = "int default 0")
    private int points;

    private String mentorComment;

    private LocalDateTime evaluationDate;

    public Solution() {
    }

    public Solution(int userId, int curriculumId, String solutionContent, String comment, LocalDateTime postedDate, String evaluatedBy, int points, String mentorComment, LocalDateTime evaluationDate) {
        this.userId = userId;
        this.curriculumId = curriculumId;
        this.solutionContent = solutionContent;
        this.comment = comment;
        this.postedDate = postedDate;
        this.evaluatedBy = evaluatedBy;
        this.points = points;
        this.mentorComment = mentorComment;
        this.evaluationDate = evaluationDate;
    }

    public Solution(int userId, int curriculumId, LocalDateTime postedDate) {
        this.userId = userId;
        this.curriculumId = curriculumId;
        this.postedDate = postedDate;
    }

    public int getSolutionId() {
        return solutionId;
    }

    public int getUserId() {
        return userId;
    }

    public int getCurriculumId() {
        return curriculumId;
    }

    public String getSolutionContent() {
        return solutionContent;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getPostedDate() {
        return postedDate;
    }

    public String getEvaluatedBy() {
        return evaluatedBy;
    }

    public int getPoints() {
        return points;
    }

    public String getMentorComment() {
        return mentorComment;
    }

    public LocalDateTime getEvaluationDate() {
        return evaluationDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setCurriculumId(int curriculumId) {
        this.curriculumId = curriculumId;
    }

    public void setSolutionContent(String solutionContent) {
        this.solutionContent = solutionContent;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setPostedDate(LocalDateTime postedDate) {
        this.postedDate = postedDate;
    }

    public void setEvaluatedBy(String evaluatedBy) {
        this.evaluatedBy = evaluatedBy;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setMentorComment(String mentorComment) {
        this.mentorComment = mentorComment;
    }

    public void setEvaluationDate(LocalDateTime evaluationDate) {
        this.evaluationDate = evaluationDate;
    }


}
