package State;
import TheChain.Worker;
public class TheStayAndWaitState implements TheState{

		
		private String nameOfState = "The stay and wait state";

		@Override
		public void attachState(Worker worker) {
			worker.setTheState(this);

		}

		@Override
		public String getTheNameOfState() {
			
			return this.nameOfState;
		}

	
	
}
