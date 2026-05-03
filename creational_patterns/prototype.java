package prototype;

public class ContentPrototype implements Cloneable {
    private String title;

    public ContentPrototype(String title) {
        this.title = title;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }
}