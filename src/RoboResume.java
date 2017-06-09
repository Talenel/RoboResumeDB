import java.util.ArrayList;
import java.util.Scanner;

public class RoboResume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Education edu=new Education();
		WorkExperience workExp= new WorkExperience();
		SkillsList skills=new SkillsList();
		Person pers;
		
		
		Scanner user = new Scanner(System.in);
		System.out.println("Please input your name");
		String name=user.nextLine();
		
		System.out.println("Please input your email");
		String email=user.nextLine();
		
		
		pers=new Person(name,email);
		String id=pers.getID();
		
		System.out.print("Please input your educational experiences.\n"
				+ "Please enter 1 experience at a time. You must input at least 1 and no more than 10 \n"
				+ "The experience will include the School, Year Graduated, Degree type awarded and Major\n");
		boolean check=false;
		do
		{
			System.out.println("Please enter the school you attended");
			String school=user.nextLine();
			
			System.out.println("Please enter the degree type you were awarded");
			String degree=user.nextLine();
			
			System.out.println("Please enter the major you had");
			String major=user.nextLine();
			
			System.out.println("Please enter the year you graduated");
			int year=user.nextInt();
			user.nextLine();
			
			Schooling s=new Schooling(school,year,degree, major, id);
			edu.addSchooling(s);
			
			System.out.println("Would you like to add another educational experience (Y/N)?");
			String cont=user.nextLine();
			if(cont.equals("Y"))
			{
				check=true;
			}
			else
			{
				check=false;
			}
			
		}while(check==true);
		
		System.out.print("Please input your work experiences.\n"
				+ "Please enter 1 experience at a time. You may input 0 and no more than 10 \n"
				+ "The experience will include the job title, company worked for,\n"
				+ "Description of you role in that job, and the start and end month and year for that job\n");
		
		
		do{
			System.out.println("Would you like to add another work experience (Y/N)?");
			String cont=user.nextLine();
			
			if(cont.equals("Y"))
			{
				 ArrayList<String> duty=new ArrayList<>();
				check=true;
				System.out.println("Please enter the job title");
				String name2=user.nextLine();
				
				System.out.println("Please enter the company you worked for");
				String company=user.nextLine();
				
				System.out.println("Please enter the start Month and year");
				String start=user.nextLine();
				
				
				System.out.println("Please enter the end Month and year, if current job, enter 'Present'");
				String end=user.nextLine();
				
				System.out.print("Please input your duties in this job.\n"
						+ "Please enter 1 duty at a time. You must input at least 1 duty \n"
						+ "Each duty is simply a basic description of that duty for the job\n");
				
				
				boolean check2=false;
				do
				{
					System.out.println("Please enter a brief description of the duty");
					duty.add(user.nextLine());
					
					
					
					System.out.println("Would you like to add another duty (Y/N)?");
					String dutyCheck=user.nextLine();
					if(dutyCheck.equals("Y"))
					{
						check2=true;
					}
					else
					{
						check2=false;
					}
									
				}while(check2==true);
				
				Job j=new Job(name2,company,duty, start, end, id);
				workExp.addJob(j);
		
			}
			else
			{
				check=false;
			}
			
			
			
			
		}while(check==true);
		
		pers.setEducation(edu);
		pers.setWorkExp(workExp);
		
		System.out.print("Please input your applicable work skills.\n"
				+ "Please enter 1 skill at a time. You must input 1 and no more than 20 \n"
				+ "The experience will include the desired skill and a skill rating ,\n");
		
		do
		{
			System.out.println("Please enter the desired skill");
			String skill=user.nextLine();
			
			System.out.println("Please enter a rating of your ability with the skill\n"
					+ "The available ratings are 'familiar','intermediate', 'proficient', 'expert'");
			String rating=user.nextLine();
			Skill sk=new Skill(skill, rating,id);
			skills.addSkill(sk);
			
			System.out.println("Would you like to add another skill (Y/N)?");
			String cont=user.nextLine();
			
			if(cont.equals("Y"))
			{
				check=true;
			}
			else
			{
				check=false;
			}
		}while(check==true);
		pers.setSkills(skills);
		
		System.out.print(pers.toString());
		
		
		
		user.close();
	}

}
