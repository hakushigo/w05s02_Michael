package del.it.w05s02.soal4;

public class driver {
    public static void main(String args[]){
        Teacher DosenBuHerna = new Teacher(
                "Bu Hernawati Samosir",
                1010842,
                21,
                false,
                TeacherDegree.S2,
                "Rekayasa Perangkat Lunak (RPL)",
                "Insitut Teknologi Del",
                8
        );

        Student Hasan = new Student(
                "Hasan Bin Napitupulu",
                39082842,
                19,
                false,
                "09324082494292342",
                "SMA Negeri 1 Jakarta Utara",
                1
        );

        System.out.println(DosenBuHerna.getName());
        System.out.println(DosenBuHerna.getSchoolTeaching());
        System.out.println(DosenBuHerna.getLastDegree());
        System.out.println(DosenBuHerna.getAge());
        System.out.println(DosenBuHerna);

        System.out.println(Hasan.getRanking());
        System.out.println(Hasan.getSchoolName());
        System.out.println(Hasan.getAge());
        System.out.println(Hasan.getName());
        System.out.println(Hasan);
    }
}
