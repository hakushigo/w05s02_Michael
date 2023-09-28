package del.it.w05s02.soal4;

public class Teacher extends Human {

    private String SchoolTeaching;
    private Integer YearOfTeaching;
    private String SubjectOfTeaching;
    private TeacherDegree LastDegree;

    public Teacher(
            String Name,
            Integer Id,
            Integer Age,
            Boolean IsMarried,

            TeacherDegree LastDegree,
            String TeachingSubject,
            String SchoolTeaching,
            Integer OldTeaching
    ){
        super(Name, Id, Age, IsMarried);

        setLastDegree(LastDegree);
        setSchoolTeaching(SchoolTeaching);
        setSubjectOfTeaching(TeachingSubject);
        setYearOfTeaching(OldTeaching);
    }

    public void setLastDegree(TeacherDegree lastDegree) {
        LastDegree = lastDegree;
    }

    public void setMarried() {
        super.setMarried(false);
    }

    public void setSubjectOfTeaching(String subjectOfTeaching) {
        SubjectOfTeaching = subjectOfTeaching;
    }

    public void setYearOfTeaching(Integer yearOfTeaching) {
        YearOfTeaching = yearOfTeaching;
    }

    public void setSchoolTeaching(String schoolTeaching) {
        SchoolTeaching = schoolTeaching;
    }

    public String getSubjectOfTeaching() {
        return SubjectOfTeaching;
    }

    public TeacherDegree getLastDegree() {
        return LastDegree;
    }

    public String getSchoolTeaching() {
        return SchoolTeaching;
    }

    public Integer getYearOfTeaching() {
        return YearOfTeaching;
    }

    @Override
    public String toString() {
        return super.toString()+"@Teacher:"+this.SubjectOfTeaching+":degree:"+getLastDegree().label;
    }
}
