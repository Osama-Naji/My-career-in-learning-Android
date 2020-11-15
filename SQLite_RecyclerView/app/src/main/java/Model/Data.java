package Model;

public class Data {


    private int Id;
    private String Name;
    private String Lname;
    private String Age;
    private String TimeStamp;
    private String Desrption;


    public Data() {
    }


    public Data(int id, String name, String lname, String age, String timeStamp, String desrption) {
        Id = id;
        Name = name;
        Lname = lname;
        Age = age;
        TimeStamp = timeStamp;
        Desrption = desrption;
    }


    public Data(int id, String name, String lname, String age, String desrption) {
        Id = id;
        Name = name;
        Lname = lname;
        Age = age;
        Desrption = desrption;
    }

    public Data(String name, String lname, String age, String desrption) {
        Name = name;
        Lname = lname;
        Age = age;
        Desrption = desrption;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getDesrption() {
        return Desrption;
    }

    public void setDesrption(String desrption) {
        Desrption = desrption;
    }
}
