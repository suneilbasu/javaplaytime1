import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
public class MonsterTwo{

	static  char[][] battleBoard = new char[10][10];

	public static void buildBattleBoard(){
		for(char[] row : battleBoard){
			Arrays.fill(row,'*');
		}
	}
	public static void redrawBoard(){
		int k = 1;
		while(k<= 30){System.out.print('-'); k++;} //draw dash line
		System.out.println();

		for (int i=0; i < battleBoard.length; i++){
			for(int j = 0; j < battleBoard[i].length; j++){
				System.out.print("|" + battleBoard[i][j]+"|");
			}
			System.out.println();
		}
		k = 1;
		while(k<= 30){System.out.print('-'); k++;} //draw dash line
		System.out.println();
	}
}