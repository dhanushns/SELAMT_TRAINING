package OOPS;

public class P4 {
	
	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		IOB  iob = new IOB();
		SBI sbi = new SBI();
		System.out.println("ROI of HDFC : " + hdfc.getRateOfInterest());
		System.out.println("ROI of IOB : " + iob.getRateOfInterest());
		System.out.println("ROI of SBI : " + sbi.getRateOfInterest());
		
	}
}

class Bank{
	
	float getRateOfInterest() {
		return 1F;
	}
	
}


class HDFC extends Bank{
	
	float getRateOfInterest() {
		return 2F;
	}
	
}

class IOB extends Bank{
	
	float getRateOfInterest() {
		return 1F;
	}
	
}

class SBI extends Bank{
	
	float getRateOfInterest() {
		return 3F;
	}
	
}