//2016114965 이효동
public class MusicSystemTest 
{
	public static void main( String[] args ) 
	{
		// create subclass objects
		Music music = new Music("흥부전",1700);
		Classic classic = new Classic("캐논", 1732, "파헬벨");
		Pop pop = new Pop("바람이 분다",2004,"이소라");
		
		System.out.println(music);
		System.out.println(classic);
		System.out.println(pop);

		Music[] musics = new Music[3];
		
		musics[0] = music;
		musics[1] = classic;
		musics[2] = pop;

		for ( Music currentmusic : musics ) 
		{
			System.out.println( currentmusic );

			if ( currentmusic instanceof Classic ) 
			{
				Classic classic1 = ( Classic ) currentmusic;
				System.out.println(classic1.getComposer());
			}
			
			else if(currentmusic instanceof Pop)
			{
				Pop pop1 = (Pop) currentmusic;
				System.out.println(pop1.getSinger());
			}
		}

		for ( int j = 0; j < musics.length; j++ )
			System.out.printf( "Music %d is a ch.10.%s\n", j, 
				musics[ j ].getClass().getName() ); 
	} // end main
} // end class MusicSystemTest