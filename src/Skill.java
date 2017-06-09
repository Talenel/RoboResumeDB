
public class Skill {

	
	private String skillName;
	private String skillRating;
	
	
	public Skill(String aName,String aRating,String persID) {
		// TODO Auto-generated constructor stub
		skillName=aName;
		skillRating=aRating;
		Database db=new Database();
		db.addSkills(persID, aName, aRating);
		
	}
	
	public String getName()
	{
		return skillName;
	}
	public String getRating()
	{
		return skillRating;
	}
	
	
	public void setName(String skill)
	{
		skillName=skill;
	}
	public void setRating(String rating)
	{
		skillRating=rating;
	}
	
	@Override
	public String toString()
	{
		return skillName+", "+skillRating;
	}

}
