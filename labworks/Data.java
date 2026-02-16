package labworks;

public class Data {

	private double total;
	private double maxvalue;
	private int count;
	
	public Data() {
		total = 0;
		maxvalue = 0.0;
		count = 0;
	}
	
	public void Add(double value) {
		total += value;
		if(value>maxvalue) maxvalue = value;
		count++;
	}
	
	public double Average() {
		if(count == 0) return 0;
		return total/count;
	}
	
	public double Max() {
		return maxvalue;
	}
	
}