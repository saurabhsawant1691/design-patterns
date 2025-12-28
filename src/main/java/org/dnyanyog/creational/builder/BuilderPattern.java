package org.dnyanyog.creational.builder;

 class Computer {

	// Required Parameters
	private String HDD;
	private String RAM;
	
	// Optional Parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public String getHDD() {return HDD;}
	
	public String getRAM() {return RAM;}
	
	public boolean isGraphicsCardEnabled() {return isGraphicsCardEnabled;}
	
	public boolean isBluetoothEnabled() {return isBluetoothEnabled;}
	
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	};
	
	public static class ComputerBuilder {
		private String HDD;
		private String RAM;
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram) {
			this.HDD = hdd;
			this.RAM = ram;
		}
		
		public ComputerBuilder setIsGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public ComputerBuilder setIsBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {return new Computer (this); }
	}
}

 public class BuilderPattern {
	 public static void main(String[] args) {
		 Computer computer = new Computer.ComputerBuilder("500", "400")
				 .setIsGraphicsCardEnabled(true)
				 .setIsBluetoothEnabled(true)
				 .build();
		 
		 // Print the specifications of the computer
		 System.out.println("HDD: " + computer.getHDD());
		 System.out.println("RAM: " + computer.getRAM());
		 System.out.println("Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
		 System.out.println("Bluetooth Enabled: " + computer.isBluetoothEnabled());
	 }
 }