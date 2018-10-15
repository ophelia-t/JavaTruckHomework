import java.util.Vector;

public class Truck {
	private String name;
	private TruckType truckType;
	private int maxLoad;
	private int currentLoad = 0;
	private Vector<String> whatsIn;
	
	public Truck (TruckType trucktype, String name) {
		this.name = name;
		this.maxLoad = trucktype.getMaxLoad();
		whatsIn = new Vector<String>();
	}
	public String getName(){
		return this.name;
	}
	public Vector<String> getWhatsIn(){
		return this.whatsIn;
	}
	public void setWhatsIn (String someGoods) {
		this.whatsIn.addElement(someGoods);
	}
	public TruckType getTruckType() {
		return this.truckType;
	}
	public int getMaxLoad() {
		return this.maxLoad;
	}
	public int getCurrentLoad() {
		return this.currentLoad;
	}
	public void setCurrentLoad(int x) {
		this.currentLoad+=x;
	}
	
	public boolean canWeLoad(int kilos, GoodsType thatShit) {
		if(this.currentLoad + kilos > this.maxLoad) return false;		
		if(this.truckType != thatShit.getTruckNeeded()) return false;
		else return true;
	}
	public void printTruck() {
		
		System.out.println("This is:" + this.getName() + " and it is a " + this.getTruckType() + 
		" ,with current load:" + this.getCurrentLoad() + " of MAXLOAD:" + this.getMaxLoad());
		for (int i = 0; i < this.whatsIn.size(); i++) {
			System.out.println(this.whatsIn.get(i));
		}
	}
}
