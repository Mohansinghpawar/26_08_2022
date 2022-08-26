public class Count {
		
		public static int countObject;
		public Count() {
			countObject++;
		}

		public static void main(String[] args) {
			
			Count count1=new Count();
			Count count2=new Count();
			
			Trainer trainer1=new Trainer();
			Trainer trainer2=new Trainer();
			
			Counsultant counsult1 = new Counsultant();
			Counsultant counsult2 = new Counsultant();
			System.out.println("number of object:"+countObject);
		}

	}

	class Trainer extends Count {

	}
	class Counsultant extends Count{

	}
