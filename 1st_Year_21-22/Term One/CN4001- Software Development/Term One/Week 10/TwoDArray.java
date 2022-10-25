/**
 * Program to process a 2D Array
 */
public class TwoDArray 
{
    public static void main(String[] args)
    {
        // initialise 2D array
        char[][] a2DArray = { 
                                {'X', 'X', 'O'},
                                {'O', 'X', 'O'},
                                {'X', 'O', 'X'}
                            };
        // display grid       
        displayGrid(a2DArray);
        // check row 1
        System.out.print("Row 1: X total = ");
        System.out.println(checkRow1(a2DArray, 'X'));
        // check left diagonal
        System.out.print("Left Diagonal: X total = ");
        System.out.println(checkLeftD(a2DArray, 'X'));           
    }

    // display grid
    static void displayGrid ( char[][] grid )
    {
        for (int row = 0; row < grid.length; row++)
        {
            for (int col = 0; col < grid[0].length; col++)
            {
                System.out.print(grid[row][col]);
            }
            System.out.println();
        }
    } 

    // check row for symbol
    static int checkRow1 (char[][] grid , char symbol )
    {
	int count = 0;
	for (int col = 0; col < grid[0].length; col++)
	{
            if (grid[0][col] == symbol)
            {
                count++;
            }
	}
	return count;
    } 

    // check left diagonal for symbol
    static int checkLeftD( char[][] grid, char symbol )
    {
        int count = 0;
        for (int num = 0; num < grid.length; num++)
        {
            if (grid[num][num] == symbol)
            {
                count++;
            }
        }
        return count;
    }
}
