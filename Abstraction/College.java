package Abstraction;

public class College extends University {
	@Override
	public void ug() {
		// TODO Auto-generated method stub
		System.out.println("Bachulor Degree");
	}
public static void main(String[] args) {
	College course= new College();
	course.ug();
	course.pg();
}


}
