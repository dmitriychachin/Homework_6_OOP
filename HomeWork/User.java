public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void save(){
		System.out.println("Save user: " + name);
	}
	
	public void report(){
		System.out.println("Report for user: " + name);
	}
}