
public class Goods {
	
	private String name;
	private GoodsType type;
	private int counterID = 0;
	Goods(String name, GoodsType type){
		this.name = name;
		this.type = type;
	}
	public int getCounterID() {
		return this.counterID;
	}
	public void setCounterID() {
		this.counterID++;
	}
	public GoodsType getGoodsType() {
		return type;
	}

	public String getName() {
		return name;
	}
}