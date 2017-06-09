import java.util.ArrayList;

public class WorkExperience {

	
	private ArrayList<Job> workExp;
	
	
	
	public WorkExperience() {
		// TODO Auto-generated constructor stub
		workExp=new ArrayList<Job>();
		
		
	}
	public void addJob(Job j)
	{
		if(workExp.size()==10)
		{
			workExp.remove(0);
			workExp.add(j);
		}
		else
		{
			workExp.add(j);
		}
	}
	
	@Override
	public String toString()
	{
		if(!workExp.isEmpty())
		{	
			StringBuilder build = new StringBuilder("Work Experience\n");
			
			for(int i=0;i<workExp.size(); i++)
			{
				build.append(workExp.get(i).toString()+"\n");
				
				
			}
			return build.toString();
		}
		else
		{
			return "This person is a freeloader\n\n";
		}
		
	}

}
