package serviceimpl;

import java.util.LinkedHashMap;
import java.util.*;

import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService,HotelRepo {

	Scanner sc=new Scanner(System.in);
	{                         //non static block is used here(start) 
		//use to create Rooms
		for(int i=1;i<=10;i++) {
			cm.put(i, null);
		}
		for(int i=1;i<=8;i++) {
			sm.put(i, null);
		}
		for(int i=1;i<=5;i++) {
			dm.put(i, null);
		}
	}                          //non static blocks is used here(end)

	@Override
	public void roominfo() {
		System.err.println("<\\***************<<\\Classic Rooms//>>****************//>");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: No");
		System.out.println("Tv: No");
		System.out.println("Wifi: No");
		System.out.println("Price: 1000");
		System.out.println("Breakafst: Not Including");
		
		System.err.println("<\\***************<<\\Standard Rooms//>>***************//>");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: Yes");
		System.out.println("Tv: Yes");
		System.out.println("Wifi: No");
		System.out.println("Price: 1800");
		System.out.println("Breakafst: Including");
		
		System.err.println("<\\***************<<\\Deluxe Rooms//>*****************//>");
		System.out.println("Hot Water: Yes");
		System.out.println("AC: Yes");
		System.out.println("Tv: Yes");
		System.out.println("Wifi: Yes");
		System.out.println("Price: 3000");
		System.out.println("Breakafst: Including");
	}
   
	public void checkRoom(LinkedHashMap<Integer,Customer> l1) {
    	boolean f=false;
    	for(Integer ele:l1.keySet()) {
    		if(l1.get(ele)==null) {
    			System.out.println(ele+" ");
    			f=true;
    		}
    	}
    	System.out.println();
    	if(f==false) {
    		System.out.println("==========Room is not available==========");
    	}
    }	
   
    @Override
	public void availableRoom() {
		System.out.println("<<<<<<<<<<<<Available Rooms>>>>>>>>>>>>>");
		System.out.println("________________________________________");
		
		System.out.println("**********<\\Classic Rooms//>**********");
		checkRoom(cm);
		System.out.println("**********<\\Standard Rooms//>**********");
		checkRoom(sm);
		System.out.println("**********<\\Deluxe Rooms//>**********");
		checkRoom(dm);
	}
    
    Customer createCustomer() {
    	System.out.println("=========Enter Customer Details========");
    	
    	System.out.println("Enter Customer Name: ");
    	String cname=sc.next();
    	
    	System.out.println("Enter Customer id: ");
    	int cid=sc.nextInt();
    	
    	System.out.println("Enter Customer Mobile no: ");
    	long cphno=sc.nextLong();
    	
    	System.out.println("Enter Customer Email: ");
    	String cemail=sc.next();
    	
    	System.out.println("Enter Customer house no: ");
    	int hn=sc.nextInt();
    	
    	System.out.println("Enter Customer Street: ");
    	String str=sc.next();
    	
    	System.out.println("Enter Customer Pincode: ");
    	int pincode=sc.nextInt();
    	
    	System.out.println("Enter Customer Dist: ");
    	String dist=sc.next();
    	
    	System.out.println("Enter Customer State: ");
    	String state=sc.next();
    	
    	Address a=new Address(hn, str, pincode, dist, state);
    	return new Customer(cname, cid, cphno, cemail, a);
    }
   
    void mapRoom(LinkedHashMap<Integer,Customer> l1, int roomNo,double amt) {
    	if(l1.get(roomNo)==null) {
    		Customer c=createCustomer();
    		a1.add(c);
    		l1.put(roomNo, c);
    		c.setCamt(amt);
    		System.out.println("Room No "+roomNo+" has been allocated for "+c.getCname());
    		System.out.println("--------------------------------------------------------");
    	}
    	else {
    		System.out.println("Room is Empty....!!!!");
    	}
    }
	@Override
	public void allocateRoom() {
		System.out.println("<<<<<<<<<<<<<<<<<Menu>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		System.out.println("--------------------------------------------");
		
	    Scanner sc=new Scanner(System.in);
	    int ip=sc.nextInt();
	    
	    switch(ip) {
	    case 1: System.out.println("Enter the RoomNo............"); 
	            int roomNo1=sc.nextInt();
	            if(roomNo1>=1&& roomNo1<=10) {
	            	 mapRoom(cm,roomNo1,1000);
	            }else {
	            	System.out.println("Enter correct room no.......");
	            }
	            break;
	   
	    case 2: System.out.println("Enter the RoomNo............"); 
                int roomNo2=sc.nextInt();
                if(roomNo2>=1&& roomNo2<=8) {
	            	 mapRoom(sm,roomNo2,1800);
	            }else {
	            	System.out.println("Enter correct room no.......");
	            }
                break;
	    
	    case 3: System.out.println("Enter the RoomNo............"); 
                int roomNo3=sc.nextInt();
                if(roomNo3>=1&& roomNo3<=5) {
	            	 mapRoom(dm,roomNo3,3000);
	            }else {
	            	System.err.println("Incorrect room no......!!!");
	            	System.out.println("\nEnter correct room no.....->");
	            }
                break;
	    
	    default: System.err.println("Invalid Options.....!!!!!!!");
	    }
	}

	void unMapRoom(LinkedHashMap<Integer,Customer> l1,int roomno) {
		if(l1.get(roomno)!=null) {
			Customer c1=l1.get(roomno);
			System.out.println(c1);
			System.out.println(c1.getCname()+" need to pay "+c1.getCamt()+" Rs. ");
		}
	}
	@Override
	public void checkout() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<Menu>>>>>>>>>>>>>>>>>>>");
		System.out.println("1.Classic Room\n2.Standard Room\n3.Deluxe Room");
		int ip=sc.nextInt();
		System.out.println("Enter ur room no:->");
		int roomno=sc.nextInt();
		
		switch(ip) {
		
		case 1: if(roomno>=1 && roomno<=10) {
			   unMapRoom(cm,roomno);
		   }else {
			   System.err.println("Invalid roomno.....");
		   }
		   break;
			
		case 2: if(roomno>=1 && roomno<=8) {
			unMapRoom(sm,roomno);
		}else {
			System.err.println("Invalid roomno.....");
		}
		break;
			
		case 3: if(roomno>=1 && roomno<=5) {
			unMapRoom(dm,roomno);
		}else {
			System.err.println("Invalid roomno.....");
		}
		break;
		
		default: System.err.println("Invalid Option....!!!!!!!");
		}
	}

	@Override
	public void findAllCustomer() {
		if(a1.size()==0) {
			System.out.println("Database is empty......");
		}
		else {
			for(Customer ele:a1) {
				System.out.println(ele);
			}
		}
		
	}

	@Override
	public void getCustomerById() {
		boolean f=false;
		System.out.println("Enter the customer id....");
		int cid=sc.nextInt();
		
		for(Customer ele:a1) {
			if(ele.getCid()==cid) {
				System.out.println(ele);
				f=true;
				break;
			}
			if(f==false) {
				System.err.println("Invalid Customer Id....");
			}
		}
	}
	
	@Override
	public void exit() {
		System.out.print("Exiting");
		for(int i=1;i<=8;i++) {
			try {
				Thread.sleep(450);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.err.print(".");
		}
		System.out.println("\nThank you! Visit Again.....!!!!!");
	}
}
