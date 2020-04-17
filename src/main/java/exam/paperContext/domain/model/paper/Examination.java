package exam.paperContext.domain.model.paper;

import exam.paperContext.domain.shared.Entity;

import java.time.LocalDateTime;

public class Examination implements Entity<Examination> {
    private String id;
    private LocalDateTime beginDate;
    private LocalDateTime dueDate;
    private int totalTime;
    private int totalScore;
    private PaperId paperId;

    private Examination(int totalTime, int totalScore, PaperId paperId) {
        this.totalTime = totalTime;
        this.totalScore = totalScore;
        this.paperId = paperId;
    }

    private Examination(int totalTime, int totalScore, PaperId paperId, LocalDateTime beginDate) {
        this.totalTime = totalTime;
        this.totalScore = totalScore;
        this.paperId = paperId;
        this.beginDate = beginDate;
    }

    public void finished() {
//        this.dueDate = this.beginDate.getMinute() + this.totalTime
    }

    @Override
    public boolean sameIdentityAs(Examination other) {
        return this.id.equals(other.id);
    }
}
