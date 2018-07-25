
	public abstract class NFLDraftProject{
		
		private String Name;
		private String Position;
		private String Number;
		
		
		public NFLDraftProject() {	//no argument constructor
		}
		
		public NFLDraftProject(String name1, String position1, String number1) {
			Name = name1;
			Position = position1;   //constructor with all arguments
			Number = number1;
			
		}
		
		public String getname() {   //getters and setters
			return this.Name;
		}
		public void setname(String newname) {
			this.Name = newname;
		}
		
		public String getposition() {
			return this.Position;
		}
		public void setposition(String newposition) {
			this.Position = newposition;
		}
		
		public String getNumber() {
			return this.Number;
		}
		
		public void setnumber(String newnumber) {
			this.Number = newnumber;
		}
		
		
		public String toString() {   //toString method
			return Name + ", " + Position + ", " + Number + ", ";
		}
		
	}
	
	
