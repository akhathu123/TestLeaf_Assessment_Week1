package week1.day1;

public class HotelSample {
	
	public void soup(int soupcount) {
		System.out.println("I want"+soupcount+ "soup.");
	}
	public String soup(int soupcount, String souptype) {
		String soup = soupcount+souptype;
		return souptype;
	}

	public static void main(String[] args) {
		
		HotelSample hotel = new HotelSample();
		hotel.soup(3);
		String soup = hotel.soup(2, "NonVeg");
		System.out.println(soup);

	}

}
