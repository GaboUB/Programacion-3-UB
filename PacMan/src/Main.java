
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze maze = new Maze();
		maze.print();

		
		maze.pacmanRight();
		maze.tick();
		maze.print();
		maze.pacmanRight();
		maze.tick();
		maze.print();
		maze.pacmanUp();
		maze.tick();
		maze.print();
		

	}

}
