package exam.paperContext.domain.model.paper;

import exam.paperContext.domain.shared.Entity;

import java.time.LocalDateTime;
import java.util.List;

public class AnswerSheet implements Entity<AnswerSheet> {
    private String id;
    private String examinationId;
    private String studentId;
    private LocalDateTime beginTime;
    private LocalDateTime endTime;
    private List<String> answerList;

    private AnswerSheet(String examinationId, String studentId) {
        this.examinationId = examinationId;
        this.studentId = studentId;
    }

    public void save(List<String> studentAnswerList) {
        this.answerList = studentAnswerList;
    }

    public void handIn(List<String> studentAnswerList) {
        this.answerList = studentAnswerList;
    }

    public void reviewed() {

    }

    @Override
    public boolean sameIdentityAs(AnswerSheet other) {
        return false;
    }
}
