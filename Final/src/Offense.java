
	public class Offense {

		
		private int recyards; // Receiving Yards Assign to RBs and WRs
		private int rushyards; //Rushing Yards Assign to RBs
		private int passyards; //Passing Yards Assign to QBs
		private int touchdowns; //Assign to All Players
		private int passcomp; // Passing Completions
		private int receptions; // Catches, Assign to RB and WR
		private int fumbles; //Assign to All Players
		private int carries; // Assign to RBs
		private int passatt; //Assign to QB
		private int targets; //Assign to RB and WR
		
		public Offense() {  //Constructor
		}	
			public int getrecyards() { //Getters and Setters
				return this.recyards;
			}
			
			public void setRecYards(int newRecYards) {
				this.recyards = newRecYards;
			}
		
			public int getrecptions () {
				return this.receptions;
			}
			
			public void setReceptions(int newReceptions) {
				this.receptions = newReceptions;
			}
			
			public int gettargets() {
				return this.targets; 
			}
			
			public void setTargets(int newTargets) {
				this.targets = newTargets;
			}
			
			public int getrushyards() {
				return this.rushyards; 
			}
			
			public void setRushYards(int newRushYards) {
				this.rushyards = newRushYards;
			}
			
			public int getcarries() {
				return this.carries; 
			}
			
			public void setCarries(int newCarries) {
				this.carries = newCarries;
			}
			
			public int gettouchdowns() {
				return this.touchdowns;
			}
			
			public void setTouchdowns(int newTouchdowns) {
				this.touchdowns = newTouchdowns;
			}
			
			public int getpasscomp() {
				return this.passcomp;
			}
			
			public void setPassComp(int newPassComp) {
				this.passcomp = newPassComp;
			}
			
			public int getpassatt() {
				return this.passatt;
			}
			
			public void setPassAtt(int newPassAtt) {
				this.passatt = newPassAtt;
			}
			
			public int getpassyards() {
				return this.passyards;
			}
			
			public void setPassYards(int newPassYards) {
				this.passyards = newPassYards;
			}
			
			public int getfumbles() {
				return this.fumbles; 
			}
			
			public void setFumbles(int newFumbles) {
				this.fumbles = newFumbles;
			}
		
		public float getPassCmpPercent() {   
				return ((((float)this.passcomp)/((float)this.passatt))*100);    //Calculation to get Pass Completion Percentage
		}
		
		public float getYardsPerCarrie() {   
			return ((((float)this.rushyards)/((float)this.carries))*100);		//Calculation to get yards per carry
		}
		
		public float getYardsPerReception() {   
			return ((((float)this.receptions)/((float)this.recyards))*100);		//Calculation to get yards per reception
		}
		
		public String toString() {   //toString method
			return getName() + ", " + getPosition() + ", " + getNumber() + ", " + passatt + ", " + passcomp + ", " + carries + ", " + rushyards + ", " + receptions + ", " + recyards;
		
		
	}

	}
