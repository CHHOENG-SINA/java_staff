
public class ClsItem {
    
    private int id;
    private String name;
    
    public ClsItem(){}
    public ClsItem(int i,String n){id = i; name = n;}
    
    public void setId(int i){id = i;}
    public void setName(String n){name= n;}
    
    public int getId(){return id;}
    public String getName(){return name;}
    
    public String toString(){return getId() + "-" + getName(); }
    
}
