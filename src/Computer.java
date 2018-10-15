
public class Computer extends Goods{
	private boolean isPortable;
	private int serialID;
	
	Computer(String name,GoodsType type, boolean bool){
		super(name,type);
		this.isPortable = bool;
		this.serialID = super.getCounterID();
		super.setCounterID();
	}
	public String getState() {
		if(isPortable) return "The Computer is PORTABLE";
		else return "The Computer is not PORTABLE, it is STATIONARY";
	}
	public String toString() {
		return super.getName() + " _ with serial ID:" + this.serialID + " _ " + this.getState() + " _ That load is:" + super.getGoodsType() ;
	}

}
