
public class Fuel extends Goods{
	private boolean isLiquid;
	private int serialID;
	
	Fuel(String name,GoodsType type, boolean bool){
		super(name,type);
		this.isLiquid = bool;
		this.serialID = super.getCounterID();
		super.setCounterID();
	}
	public String getState() {
		if(isLiquid) return "The fuel is LIQUID!";
		else return "The fuel is not LIQUID, it is GAS!";
	}
	public String toString() {
		return super.getName() + " _ with serial ID:" + this.serialID + " _ " + this.getState() + " _ That load is:" + super.getGoodsType() ;
	}
}
