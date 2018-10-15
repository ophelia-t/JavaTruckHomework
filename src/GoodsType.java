
public enum GoodsType {
	Standrt ("DumpTruck"), Dangerous("Tanker"), TempSensitive("Fridge");
	private TruckType truckNeeded;
	
	private GoodsType (String trucktype) {
		this.truckNeeded = TruckType.valueOf(trucktype);
	}
	public TruckType getTruckNeeded() {
		return this.truckNeeded;
	}
}
