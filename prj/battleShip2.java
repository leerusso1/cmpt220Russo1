import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class battleShip2 {
	static int numRow = 5; 
    static int numCol = 5;
    static int numShips = 5; 
	  public static void main(String[] args) {
		  File file = new File("src/BoardSize.txt");
		  try {
			Scanner input = new Scanner(file); 
			numRow = input.nextInt(); 
			numCol = input.nextInt(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	        int[][] board = new int[numRow][numCol];
	        int[][] ships = new int[numShips][2];
	        int[] shoot = new int[2];
	        int attempts=0,
	            shotHit=0;
	         
	        
	        initBoard(board);
	        initShips(ships);
	        
	        System.out.println();
	        
	        do{
	            showBoard(board);
	            shoot(shoot);
	            attempts++;
	            
	            if(hit(shoot,ships)){
	                hint(shoot,ships,attempts);
	                shotHit++;
	            }                
	            else
	                hint(shoot,ships,attempts);
	            
	            changeboard(shoot,ships,board);
	            

	        }while(shotHit!=3);
	        
	        System.out.println("\n\n\nBattleship Java game finished! You hit 3 ships in "+attempts+" attempts");
	        showBoard(board);
	    }
	    
	    public static void initBoard(int[][] board){
	        for(int row=0 ; row < numRow ; row++ )
	            for(int column=0 ; column < numCol ; column++ )
	                board[row][column]=-1;
	    }
	    
	    public static void showBoard(int[][] board){
	       
	        for (int i=1; i < numRow + 1; i++) {
	        	 System.out.print("\t" + i);
	        }
	        System.out.println();
	        
	        for(int row=0 ; row < numRow ; row++ ){
	            System.out.print((row+1)+"");
	            for(int column=0 ; column < numCol ; column++ ){
	                if(board[row][column]==-1){
	                    System.out.print("\t"+"~");
	                }else if(board[row][column]==0){
	                    System.out.print("\t"+"*");
	                }else if(board[row][column]==1){
	                    System.out.print("\t"+"X");
	                }
	                
	            }
	            System.out.println();
	        }

	    }

	    public static void initShips(int[][] ships){
	        Random random = new Random();
	        
	        for(int ship=0 ; ship < numShips ; ship++){
	            ships[ship][0]=random.nextInt(numRow);
	            ships[ship][1]=random.nextInt(numCol);
	            
	            for(int last=0 ; last < ship ; last++){
	                if( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) )
	                    do{
	                        ships[ship][0]=random.nextInt(numRow);
	                        ships[ship][1]=random.nextInt(numCol);
	                    }while( (ships[ship][0] == ships[last][0])&&(ships[ship][1] == ships[last][1]) );
	            }
	            
	        }
	    }

	    public static void shoot(int[] shoot){
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Row: ");
	        shoot[0] = input.nextInt();
	        shoot[0]--;
	        
	        System.out.print("Column: ");
	        shoot[1] = input.nextInt();
	        shoot[1]--;
	        
	    }
	    
	    public static boolean hit(int[] shoot, int[][] ships){
	        
	        for(int ship=0 ; ship<ships.length ; ship++){
	            if( shoot[0]==ships[ship][0] && shoot[1]==ships[ship][1]){
	                System.out.printf("You hit a ship located in (%d,%d)\n",shoot[0]+1,shoot[1]+1);
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void hint(int[] shoot, int[][] ships, int attempt){
	        int row=0,
	            column=0;
	        
	        for(int line=0 ; line < ships.length ; line++){
	            if(ships[line][0]==shoot[0])
	                row++;
	            if(ships[line][1]==shoot[1])
	                column++;
	        }
	        
	        System.out.printf("\nHint %d: \nRow %d -> %d ships\n" +
	                                 "Column %d -> %d ships\n",attempt,shoot[0]+1,row,shoot[1]+1,column);
	    }

	    public static void changeboard(int[] shoot, int[][] ships, int[][] board){
	        if(hit(shoot,ships))
	            board[shoot[0]][shoot[1]]=1;
	        else
	            board[shoot[0]][shoot[1]]=0;
	    }
}
