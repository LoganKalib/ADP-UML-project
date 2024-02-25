package za.ac.cput.domain;

public class Mark {

    private String type;
    private float maxMark;
    private float totalEarned = 0;
    private float percntWeight;
    private float percntEarned;

    public Mark(String type, float maxMark, float totalEarned, float percntWeight) {
        this.type = type;
        this.maxMark = maxMark;
        this.totalEarned = totalEarned;
        this.percntWeight = percntWeight;
        this.setPercntEarned(this.maxMark,this.totalEarned);

    }
    public Mark(String type, float maxMark, float percntWeight) {
        this.type = type;
        this.maxMark = maxMark;
        this.percntWeight = percntWeight;
        this.setPercntEarned(this.maxMark,this.totalEarned);

    }

    public Mark() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(float maxMark) {
        this.maxMark = maxMark;
    }

    public float getTotalEarned() {
        return totalEarned;
    }

    public void setTotalEarned(float totalEarned) {
        this.totalEarned = totalEarned;
    }

    public float getPercntWeight() {
        return percntWeight;
    }

    public void setPercntWeight(float percntWeight) {
        this.percntWeight = percntWeight;
    }

    public float getPercntEarned() {
        return percntEarned;
    }

    public void setPercntEarned(float maxMark, float totalEarned) {
        this.percntEarned = totalEarned / maxMark *100f;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "type='" + type + '\'' +
                ", maxMark=" + maxMark +
                ", totalEarned=" + totalEarned +
                ", percntWeight=" + percntWeight +
                ", percntEarned=" + percntEarned +
                '}';
    }

    public float calcWeightPercnt(){
        return this.percntEarned * this.percntWeight;
    }


}
