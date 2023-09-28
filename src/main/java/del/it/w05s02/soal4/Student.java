package del.it.w05s02.soal4;

public class Student extends Human{

    private String StudentID;
    private String SchoolName;
    private Integer Ranking;

    public Student(
            String Name,
            Integer Id,
            int Age,
            Boolean IsMarried
    ){
        super(Name, Id, Age, IsMarried);
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public void setRanking(Integer ranking) {
        Ranking = ranking;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public Integer getRanking() {
        return Ranking;
    }

    @Override
    public String toString() {
        return super.toString()+"@Student:"+SchoolName+":ranking = "+getRanking();
    }
}