package Model;

public class ListItem {
    private String Title;
    private String Gerne;
    private String Year;
    private int Image;


    public ListItem(String title,String gerne,String year, int image) {
        this.Title = title;
        this.Gerne = gerne;
        this.Year = year;
this.Image = image;

    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGerne() {
        return Gerne;
    }

    public void setGerne(String gerne) {
        Gerne = gerne;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }
}
