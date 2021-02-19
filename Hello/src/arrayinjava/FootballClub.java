package arrayinjava;

public class FootballClub {
		public static void main(String[] args) {
			String club[]= {"Machester United","Manchester City","Everton","Liverpool","WestHam Unites","Lees united"};
			String result = longestFootballClub(club);
			System.out.println("The longest Football club name is:"+result);
			
			
			}
			
		
	public static String longestFootballClub (String club[]) {
			
			int size = club.length;
			String max = club[0];
			for(int i=1; i<size; i++) {
				if (club[0].length()> max.length()) {
					max = club[i];
				}
			}
			return max;
	}


}
