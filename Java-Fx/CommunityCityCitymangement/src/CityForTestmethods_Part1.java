
public class CityForTestmethods_Part1 {
		private String name="";
		private int temperature=0;		
		public CityForTestmethods_Part1(String name, int temperature) {
			setName(name);
			setTemperature(temperature);
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if(name==null||name.length()<=0) {
				this.name="Unknown";
			System.out.println("Error 1 invalid name was inputted");
			}else {
				this.name = name;
			}
		}
		public int getTemperature() {
			return this.temperature;
		}
		public void setTemperature(int temperature) {
			if(temperature<60&&temperature>-90)this.temperature=temperature;
			else { this.temperature=0;
			System.out.println("Error 2 temperature has to be between +60° and -90°");
			}
		}
		public void print(){
			System.out.print("-");
			System.out.print(this.getName());
			System.out.print("		");
			System.out.print(this.getTemperature());
			System.out.println("°C");
		}

}