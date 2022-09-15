/**
 * 
 */
public class TestStarWarsName
{
    public void test(){
        StarWarsName s = new StarWarsName("Florian", "Körner", 
        "Vienna", "Körner");
        s.getStarWarsName();
        if(s.getStarWarsName().equals("KörFl KöVie")){
            System.out.println("correct 1");
        }else{
            System.out.println("Error 1"+s.getStarWarsName());
        }
    }
}