package oop.ch02.v05.cooperation;

public class TakeTransTest {

	public static void main(String[] args) {
		
		Student studentJ = new Student("James", 5000);
		Student studentT = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		
		Subway subwayGreen = new Subway(2);
		Subway subwayBlue = new Subway(4);
		
		
		studentJ.takeBus(bus100);
		studentT.takeSubway(subwayGreen);
		
		studentJ.showInfo();
		studentT.showInfo();
		
		bus100.showBusInfo();
		bus200.showBusInfo();
		
		subwayGreen.showSubwayInfo();
		subwayBlue.showSubwayInfo();
		
		System.out.println("--------------------------------------------------");
		
		Taxi taxi1000 = new Taxi(1000);
		Taxi taxi2000 = new Taxi(2000);
		
		Student studentE = new Student("Edward", 15000);
		
		studentE.takeTaxi(taxi1000);
		
		studentE.showInfo();
		
		taxi1000.showTaxiInfo();
		taxi2000.showTaxiInfo();
		
		
	}
	
}
