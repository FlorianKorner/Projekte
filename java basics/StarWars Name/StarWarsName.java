public class  StarWarsName
{
    private String firstName;
    private String lastName;
    private String cityOfBirth;
    private String maidenNameOfMother;
    public StarWarsName(){}
    public StarWarsName(String firstName, String lastName, 
        String cityOfBirth, String maidenNameOfMother){
            setFirstName(firstName);
            setLastName(lastName);
            setCityOfBirth(cityOfBirth);
            setMaidenNameOfMother(maidenNameOfMother);
        }
    public void setMaidenNameOfMother(String maidenNameOfMother)
    {
        if(maidenNameOfMother==null||maidenNameOfMother.length()==0){
            this.maidenNameOfMother="unknown";
        }else{
            this.maidenNameOfMother=maidenNameOfMother;
        }
    }

    public String getMaidenNameOfMother(){
        return this.maidenNameOfMother;
    }

    public void setFirstName(String firstName)
    {
        if(firstName.length()<=0||firstName.equals(null)) {
            this.firstName= "unknown";
        }else{
            this.firstName=firstName;
        }
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public void setLastName(String lastName){
        if(lastName.length()<=0||lastName.equals(null)) {
            this.lastName= "unknown";
        }else{
            this.lastName=lastName;
        }
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setCityOfBirth(String cityOfBirth){
        if(cityOfBirth.length()==0 || cityOfBirth == null)
        {
            this.cityOfBirth="unknown";
        }else{
            this.cityOfBirth= cityOfBirth;
        }
    }

    public String getCityOfBirth(){
        return this.cityOfBirth;
    }

    public String getStarWarsFirstName()
    {
        return getLastName().substring(0,3)+
            getFirstName().substring(0,2);
    }

    public String getStarWarsLastName(){
        return getMaidenNameOfMother().substring(0,2)+
            getCityOfBirth().substring(0,3);
    }
    public String getStarWarsName()
    {
        return getStarWarsFirstName()+" "+
        getStarWarsLastName();
    }
}