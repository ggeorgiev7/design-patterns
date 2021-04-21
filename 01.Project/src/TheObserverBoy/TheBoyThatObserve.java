package TheObserverBoy;
import TheChain.Worker;
import State.TheState;
public class TheBoyThatObserve implements Observer{

	
		
		private String name;
		
		Worker FirstWorker;
		private Observable TheState;
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void BoyThatObserve(String name) {
			this.setName(name);
		}

		@Override
		public void update() {
			if(TheState == null) {
				System.out.println("No state");
				return;
			}
			
			TheState nameOfState = TheState.getUpdate();
			
			
			
			
			
			
			
			System.out.println(this.getName() + " upgrated with: " + " THE state is " + nameOfState.getTheNameOfState() );
			
		}

		@Override
		public void setTheState(Observable TheState) {
			this.TheState = TheState;

		}

	
	
	
}
