package State;
import TheChain.Worker;
public class ThePreparationState implements TheState{


		private String nameOfState = "The preparation state";

		@Override
		public void attachState(Worker worker) {
			worker.setTheState(this);

		}

		@Override
		public String getTheNameOfState() {
			
			return this.nameOfState;
		}

}
