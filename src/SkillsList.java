

import java.util.ArrayList;

public class SkillsList {

	

	
	private ArrayList<Skill> skill;
		
		
		
	public SkillsList() {
		// TODO Auto-generated constructor stub
		skill=new ArrayList<Skill>();
			
			
	}
	public void addSkill(Skill s)
	{
		if(skill.size()==20)
		{
			skill.remove(0);
			skill.add(s);
		}
		else
		{
			skill.add(s);
		}
	}
		
	@Override
	public String toString()
	{
		if(!skill.isEmpty())
		{	
			StringBuilder build = new StringBuilder("Skills\n");
				
			for(int i=0;i<skill.size(); i++)
			{
				build.append(skill.get(i).toString()+"\n");
					
				
			}
			return build.toString();
		}
		else
		{
			return "This person is incompetent\n\n";
		}
			
	}

	

}
