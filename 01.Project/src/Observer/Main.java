package Observer;

public class Main {
	public static void main(String[] args) {
		Trainee trainee = new Trainee();
		Instructor instructor = new Instructor(trainee);
		Observer viewer1 = new Viewer();
		Observer viewer2 = new Viewer();
		Observer viewer3 = new Viewer();
		
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		instructor.ChangeTraining("Stand up");
		System.out.println();
		instructor.ChangeTraining("Lie down");
	}
}
