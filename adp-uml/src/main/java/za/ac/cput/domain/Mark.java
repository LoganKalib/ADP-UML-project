package za.ac.cput.domain;

public class Mark {
    private double percentage;
    private int marksPossible;
    private int marksReceived;
    private String assessmentName;
    private String assessmentType;

    public Mark() {
    }

    public Mark(int marksPossible, String assessmentName, String assessmentType) {
        this.marksPossible = marksPossible;
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
    }

    public Mark(int marksPossible, int marksReceived, String assessmentName, String assessmentType) {
        this.marksPossible = marksPossible;
        this.marksReceived = marksReceived;
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
        percentage = marksReceived/marksPossible * 100;

    }

    public double getPercentage() {
        if(marksPossible && marksReceived != null){
            percentage = marksReceived /marksPossible * 100;
            return percentage;
        }
        return null;
    }

    public int getMarksPossible() {
        return marksPossible;
    }

    public void setMarksPossible(int marksPossible) {
        this.marksPossible = marksPossible;
    }

    public int getMarksReceived() {
        return marksReceived;
    }

    public void setMarksReceived(int marksReceived) {
        this.marksReceived = marksReceived;
    }

    public String getAssessmentName() {
        return assessmentName;
    }

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    public String getAssessmentType() {
        return assessmentType;
    }

    public void setAssessmentType(String assessmentType) {
        this.assessmentType = assessmentType;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Mark{" +
                "percentage=" + percentage +
                ", marksPossible=" + marksPossible +
                ", marksReceived=" + marksReceived +
                ", assessmentName='" + assessmentName + '\'' +
                ", assessmentType='" + assessmentType + '\'' +
                '}';
    }
}
