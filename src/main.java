
public class main {
	public static void main(String[] args){
		int x = 1324567;
		
		while(true)
			{
				if(x==0)
				{
					break;
				}
				else
				{
					int temp = x%10;
					if(temp%2==0)
					{
					System.out.println(temp+" liczba jest parzysta");	
						
					}
					else
					{
						System.out.println(temp+" liczba jest nieparzysta");
					}
					x=x/10;
					System.out.println(x+": x po zmianie");
				}
				
			}
		
		
		
		String liczba = "123487674623546905234567871234670999998765456543234500987871243245678899009876544323456788654234561231234876746235469052345678712346709999987654565432345009878712432456788990098765443234567886542345612312348767462354690523456787123467099999876545654323450098787124324567889900987654432345678865423456123123487674623546905234567871234670999998765456543234500987871243245678899009876544323456788654234561232";
		
		char[] liczbaa = liczba.toCharArray();
		if(liczbaa[liczbaa.length-1]%2==0)
		{
			System.out.println("-- liczba jest parzysta");
		} 
		else
		{
			System.out.println("-- liczba jest nieparzysta");
		}
		
		
		
		
		
		
		
		
	}
}
