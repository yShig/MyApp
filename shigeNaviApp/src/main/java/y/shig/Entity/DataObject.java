package y.shig.Entity;

/**
 * Created by yubei on 2018/02/05.
 */

public class DataObject {

    private int id;
    private String name;
    private String mail;
    private String position;

    public DataObject(String name, String mail, String position){

        this.name = name;
        this.mail = mail;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPosition() { return position; }
}
