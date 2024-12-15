package controller;

import java.util.Scanner;

import service.HotelService;
import serviceimpl.HotelServiceImpl;

public class HotelApp {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		HotelService h1=new HotelServiceImpl();
		System.out.println("{----------------------------------------------------------------}");
		System.err.println("   [<***>==========Welcome to Hyatt Centric============<***>]");
		System.out.println("{----------------------------------------------------------------}");
		
		while(true) {
			System.out.println("<=====================Menu======================>");
			System.out.println("1.Room Details\n2.Available Rooms\n3.Choose the Rooms\n4.Checkout room\n5.Find All Customer\n6.Customer by Id\n7.Exit");
			System.out.println("----------------------------------");
			System.out.println("Enter your Option: ");
			System.out.println("__________________");
			int op=sc.nextInt();
			
			switch(op) {
			case 1: h1.roominfo(); break;
			case 2: h1.availableRoom(); break;
			case 3: h1.allocateRoom(); break;
			case 4: h1.checkout(); break;
			case 5: h1.findAllCustomer(); break;
			case 6: h1.getCustomerById(); break;
			case 7: h1.exit(); break;
			default: System.err.println("Invalid Option.......!!!");
			System.exit(0);
			}
		}
	}
}
