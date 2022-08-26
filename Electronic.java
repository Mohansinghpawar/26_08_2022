class Electronic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics electronic=new Electronics();
		electronic.audio();
		electronic.power();
		Television television=new Television();
		television.picture();
		television.audio();
		Radio radio=new Radio();
		radio.frequency();
		radio.audio();
	}
}
class Electronics{
	public void audio() {
		System.out.println("setting audio...");
	}
    public void power() {
		 System.out.println("setting power....");
	}
}
class Television extends Electronics{
	public void picture() {
		System.out.println("Screening....");
	}
    @Override
	public void audio() {
		System.out.println("overriden from Electronics.....");
	}
}
class Radio extends Electronics{
	public void frequency() {
		System.out.println("setting frequency.....");
	}
	@Override
	public void audio() {
	     System.out.println("overriden from electronics.....");
	}
}
