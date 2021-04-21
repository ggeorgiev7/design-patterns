package Command;

public class Main {
	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Trainee trainee = new Trainee();
		
		Viewer viewer1 = new Viewer();
		Viewer viewer2 = new Viewer();
		Viewer viewer3 = new Viewer();
		
		trainee.subscribe(viewer1);
		trainee.subscribe(viewer2);
		trainee.subscribe(viewer3);
		
		
		Command changeTrainingToLieDown = new LieDownCommand(trainee);
		Command changeTrainingToStandUp = new StandUpCommand(trainee); 
		
		instructor.setCommand(changeTrainingToLieDown);
		instructor.ChangeTraining();
		
		instructor.setCommand(changeTrainingToStandUp);
		instructor.ChangeTraining();
		
	}
}
