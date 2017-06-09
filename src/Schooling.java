
public class Schooling {
	
	private String schoolName;
	private int yearGrad;
	private String degree;
	

	public Schooling(String aSchoolName, int aYearGrad, String degreeType, String aMajor,String persID) {
		// TODO Auto-generated constructor stub
		schoolName=aSchoolName;
		yearGrad=aYearGrad;
		setDegree(degreeType, aMajor);
		Database db= new Database();
		db.addSchooling(aSchoolName, aYearGrad, degreeType, aMajor, persID);
		
	}
	
	public void setSchool(String aSchoolName)
	{
		schoolName=aSchoolName;
	}
	public void setYearGrade(int aYear)
	{
		yearGrad=aYear;
	}
	public void setDegree(String degreeType, String aMajor)
	{
		degree = degreeType +" in "	+ aMajor;
	}
	
	public String getSchool()
	{
		return schoolName;
	}
	public String getDegree()
	{
		return degree;
	}
	public int getYear()
	{
		return yearGrad;
	}
	
	@Override
	public String toString()
	{
		
		
		return degree+",\n"+schoolName+", "+yearGrad+"\n";
	}

}
