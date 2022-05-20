/**
 * this is a Programm for a ID
 * 
 * @author Florian Körner
 * @version 19.11.2019
 */
public class Student
{
    private String name;
    private String id;
    private int mark;
    public Student(){}
    public Student(String name, String id, int mark)
    {
        setName(name);
        setId(id);
        setMark(mark);
    }

    public void setName(String name)
    {   String a;
        a="";
        if(name==a)
        {System.out.println("please enter a Name");
            this.name = "unknown";
        }else if(name.length()>=6){
            this.name=name;
        }
    }

    public String getName()
    {
        return this.name;
    }
    
    public void setId(String id)
    {
        if(id.equals("null")||id.length()<=4)
        {System.out.println("please enter a correct id");
            id = "01234";
            this.id = id;
        }else{
            this.id=id;
        }
    }

    public String getId()
    {
        return this.id;
    }

    public void setMark(int mark)
    {
        if(mark<=5&&mark>=1)
        {
            this.mark=mark;
        }else{
            this.mark=5;
        }
    }

    public int getMark()
    {
        return this.mark;
    }

    public String getLoginName()
    {
        return getName().substring(0,5).toLowerCase()
        +getId().substring(0,4);
    }

    public boolean blankLogin() {
        if(getLoginName().contains(" ")){
            return true;
        }else{
            return false;   
        }
    }

    public String underscoreLogin(){
        if(blankLogin()==true){
            return getLoginName().replace(" ","_");
        }else{
            return getLoginName();
        }
    }
}
