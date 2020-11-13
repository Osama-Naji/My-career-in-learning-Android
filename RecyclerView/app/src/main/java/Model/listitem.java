package Model;

public class listitem {

    private String name;
    private String Description;
    private String Age;


    public listitem(String name,String Description,String age) {
this.name = name;
        this.Description = Description;
        this.Age = age;


    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
