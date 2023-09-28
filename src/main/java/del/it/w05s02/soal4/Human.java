package del.it.w05s02.soal4;

public class Human {
    public String Name;
    public Integer Id;
    public Boolean Married;
    public Integer Age;

    public Human(
            String Name,
            Integer Id,
            Integer Age,
            Boolean IsMarried
    ){
        setAge(Age);
        setMarried(IsMarried);
        setName(Name);
        setId(Id);
    }

    public void setName(String name) {
        Name = name;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setMarried(Boolean married) {
        Married = married;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public Integer getAge() {
        return Age;
    }

    public Boolean getMarriedStatus() {
        return Married;
    }

    public Integer getId() {
        return Id;
    }

    @Override
    public String toString() {
        return Name + ":" + "Human" + ":" + Id;
    }
}
