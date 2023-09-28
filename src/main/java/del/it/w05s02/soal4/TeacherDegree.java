package del.it.w05s02.soal4;

public enum TeacherDegree {

    S1("STRATA 1"),
    S2("STRATA 2"),
    D3("DIPLOMA 3"),
    D4("DIPLOMA 4");

    public final String label;

    private TeacherDegree(String lbl){
        this.label = lbl;
    }

}
