package kup9_lab7;

public class ArrFillAnalyze {
	
	static int size;
	double[] data;
	
	
	ArrFillAnalyze(int size) {
		ArrFillAnalyze.size = size;
		data = new double[ArrFillAnalyze.size];
	}
	
	public static double min(double [] data) {
		double min = data[0];
		for(double index : data) {
			if(index < min)
				min = index;
		}
		return min;
	}
	
	public static double max(double [] data) {
		double max = data[0];
		for(double index : data) {
			if(index > max)
				max = index;
		}
		return max;
	}
	
	public static double sum(double [] data) {
		double sum = 0.0;
		for(double index : data) {
			sum += index;
		}
		return sum;
	}
	
	public static double ave(double [] data) {
		double result = sum(data);
		double average = result / size;
		return average;
	}

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}

	public int getSize() {
		return size;
	}
	
	
	
}
