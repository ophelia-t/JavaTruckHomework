
public class Meat extends Goods{	
	private boolean isFrozen;
	private int serialID;
	
	Meat(String name,GoodsType type, boolean bool){
		super(name,type);
		this.isFrozen = bool;
		this.serialID = super.getCounterID();
		super.setCounterID();
	}
	public GoodsType getGoodsType() {
		return super.getGoodsType();
	}
	public String getState() {
		if(isFrozen) return "The meat is FROZEN";
		else return "The meat is ont FROZEN, it is FRESH!";
	}
	public String toString() {
		return super.getName() + " _ with serial ID:" + this.serialID + " _ " + this.getState() + " _ That load is:" + super.getGoodsType() + " |#| " ;
	}
}
