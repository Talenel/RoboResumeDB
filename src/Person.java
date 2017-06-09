
public class Person {

	private Job job;
	private Education edu;
	private String name;
	private WorkExperience workExp;
	private String email;
	private SkillsList skills;
	
public Person(String aName, String anEmail){
	    
	    
	    name=aName;
	    email=anEmail;
	    Database db=new Database();
	    db.addPerson(aName, anEmail);
	}
	
	public Person(String aName, Job aJob, Education aEdu, WorkExperience aWE, String anEmail){
	    job=aJob;
	    job.setSalary(1000L);
	    edu=aEdu;
	    name=aName;
	    workExp=aWE;
	    email=anEmail;
	}
	public Person(String aName, Education aEdu, WorkExperience aWE, String anEmail){
	    
	    edu=aEdu;
	    name=aName;
	    workExp=aWE;
	    email=anEmail;
	}
	
	
	
	public long getSalary() {
	    return job.getSalary();
	}
	
	public String getEducationList(){
		return edu.toString();
			
	}
	public String getName()
	{
		return name;
	}
	public Education getEducation()
	{
		return edu;
	}
	public SkillsList getSkills()
	{
		return skills;
	}
	public String getSkillsInfo()
	{
		return skills.toString();
	}
	
	
	public Job getJob()
	{
		return job;
	}
	public String getJobInfo()
	{
		return job.toString();
	}
	public String getEmail()
	{
		return email;
	}
	
	
	
	
	public void setName(String aName)
	{
		name=aName;
	}
	public void setEmail(String anEmail)
	{
		email=anEmail;
	}
	
	public void changeJob(Job j)
	{
		job.setEnd(j.getStart());
		workExp.addJob(job);
		
		job=j;
				
	}
	public void setWorkExp(WorkExperience we)
	{
		workExp=we;
	}
	
	public void setEducation(Education e)
	{
		edu=e;
	}
	public void setSkills(SkillsList s)
	{
		skills=s;
	}
	
	
	public String getID()
	{
		Database db=new Database();
		return db.getPersonID();
		
	}
	
	
	@Override
	public String toString()
	{
	
		return name+"\n"+email +"\n \n"+edu.toString() +workExp.toString()+skills.toString();
	}
}
