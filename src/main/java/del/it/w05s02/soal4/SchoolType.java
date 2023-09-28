package del.it.w05s02.soal4;

import javax.lang.model.element.Name;

public enum SchoolType {

    UNIVERSITY("Universitas"),
    SMA("High School"),
    SMP("Junior High School"),
    SD("Elementary School");


    public final String type;

    SchoolType(String Name){
        this.type = Name;
    }
}
