
public enum TruckType {
	Dumptruck(5000), Tanker(4000), Fridge(1000);
	private int maxLoad;
	private TruckType (int load) {
		this.maxLoad = load;
	}
	public int getMaxLoad() {
		return this.maxLoad;
	}
}
