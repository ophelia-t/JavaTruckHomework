public class Main {

	public static <T extends Goods> void load(T goods, int kilos, Truck truck) {
		if(truck.canWeLoad(kilos, goods.getGoodsType())) {
			truck.setCurrentLoad(kilos);
			truck.setWhatsIn(goods.toString());
			System.out.println("We loaded " + goods.getName() + " into the " + truck.getName());
		}
		else {
			System.out.println("Can NOT load!" + goods.getName() + " into the " + truck.getName());
		}
	}	
	
	public static void main(String[] args) {
		
		Truck billaTruck = new Truck (TruckType.Fridge, "Billa Truck");
		Truck tehnopolisTruck = new Truck (TruckType.Dumptruck, "Tehnopolis Truck");
		Truck lukoilTruck = new Truck (TruckType.Tanker, "LukOil Truck");
		
		Meat freshMeat = new Meat("Fresh Beaf", GoodsType.TempSensitive, false);
		Meat frozenMeat = new Meat("Frozen Chicken", GoodsType.TempSensitive, true);
		Meat freshMeat2 = new Meat("Pork Steak", GoodsType.TempSensitive, false);
		Meat frozenMeat2 = new Meat("Chicken Drumpsticks", GoodsType.TempSensitive, true);
		
		/*Fuel diesel = new Fuel("Eko Diesel", GoodsType.Dangerous, true);
		Fuel diesel2 = new Fuel("Standart Diesel", GoodsType.Dangerous, true);
		Fuel gas = new Fuel("Bio Gas", GoodsType.Dangerous, false);
		
		Computer acer = new Computer("Acer", GoodsType.Standrt, true);
		Computer lenovo = new Computer("Lenovo", GoodsType.Standrt, true);
		Computer pentium = new Computer("Pentium 4", GoodsType.Standrt, false);
		
		load(freshMeat, 100, billaTruck);
		load(frozenMeat,500, billaTruck);
		load(freshMeat2, 100, billaTruck);
		load(frozenMeat2,500, billaTruck);
		load(acer, 2000, billaTruck);
		billaTruck.printTruck();
		
		load(diesel, 2000, lukoilTruck);
		load(gas, 2000, lukoilTruck);
		load(diesel2, 2000, lukoilTruck);
		load(gas, 2000, tehnopolisTruck);
		lukoilTruck.printTruck();
		
		load(acer, 2000, tehnopolisTruck);
		load(lenovo, 2000, tehnopolisTruck);
		load(pentium, 500, tehnopolisTruck);
		load(acer, 2000, billaTruck); */
		
		billaTruck.printTruck();
		tehnopolisTruck.printTruck();
		lukoilTruck.printTruck();
		

	}

}
