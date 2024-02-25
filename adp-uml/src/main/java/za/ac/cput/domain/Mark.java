package za.ac.cput.domain;

public class Mark {
    private Double percentage;
    private Integer marksPossible;
    private Integer marksReceived;
    private String assessmentName;
    private String assessmentType;

    public Mark() {
    }

    public Mark(Integer marksPossible, String assessmentName, String assessmentType) {
        this.marksPossible = marksPossible;
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
    }

    public Mark(Integer marksPossible, Integer marksReceived, String assessmentName, String assessmentType) {
        this.marksPossible = marksPossible;
        this.marksReceived = marksReceived;
        this.assessmentName = assessmentName;
        this.assessmentType = assessmentType;
        percentage = marksReceived.doubleValue()/marksPossible.doubleValue() * 100;

    }

    public Double getPercentage() {
        if(marksPossible != null && marksReceived != null){
            percentage = marksReceived.doubleValue()/marksPossible.doubleValue() * 100;
            return percentage;
        }
        return null;
    }

    public Integer getMarksPossible() {
        return marksPossible;
    }

    public void setMarksPossible(int marksPossible) {
        this.marksPossible = marksPossible;
    }

    public Integer getMarksReceived() {
        return marksReceived;
    }

    public void setMarksReceived(Integer marksReceived) {
        percentage = marksReceived.doubleValue()/this.marksPossible.doubleValue() * 100;
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
