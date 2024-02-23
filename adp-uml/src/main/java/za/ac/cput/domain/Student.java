package za.ac.cput.domain;

public class Student extends Person{

    private Course regCourse;
    private long stuNumber;

    public Student(String name, String surname, String email, String password, Course regCourse, long stuNumber) {
        super(name, surname, email, password);
        this.regCourse = regCourse;
        this.stuNumber = stuNumber;
    }

    public Student() {
    }

    public Course getRegCourse() {
        return regCourse;
    }

    public void setRegCourse(Course regCourse) {
        this.regCourse = regCourse;
    }

    public long getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(long stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "\n" +
                "regCourse=" + regCourse + "\n" +
                ", stuNumber=" + stuNumber + "\n" +
                /*", allMarks=" + getMarks() + "\n" +*/
                '}';
    }

   /* private String getMarks(){
        if (this.regCourse == null){
            return null;
        }

        String returnString = "";
           for(Integer key1: regCourse.getSubjects().keySet()){
               String subName = regCourse.getSubjects().get(key1).getSubjectName();
               StringBuilder subMarks = new StringBuilder("[");

               if (regCourse.getSubjects().get(key1).getMarks() == null){
                   return null;
               }

               for (Integer key2: regCourse.getSubjects().get(key1).getMarks().keySet()){
                   subMarks.append(regCourse.getSubjects().get(key1).getMarks().get(key2).toString()).append(",");
               }
               subMarks.append(']');
               returnString = subName + subMarks;
           }

           return returnString;
    }*/
}
