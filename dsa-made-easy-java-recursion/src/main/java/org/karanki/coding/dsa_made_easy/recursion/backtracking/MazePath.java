package org.karanki.coding.dsa_made_easy.recursion.backtracking;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class MazePath {
	
	private int maze[][];
	private int mazeSize;
	private Scanner scanner = new Scanner(System.in);
	private List<PathPoint> pathPoints = new ArrayList<PathPoint>();
	
	

	
	
	private  void go()
	{
		
		feedData();
		
		
		if(!solveMazeRecursive(0, 0))
		{
			System.out.println("Maze doesn't have a viable path to reach to the right most bottom");
			return;
		}
		
		printPath();
		
	}
	
	private void printPath()
	{
		System.out.print("START => ");
		
		for(PathPoint pathPoint : pathPoints)
		{
			System.out.print("[" + pathPoint.getXAxis() + ", " + pathPoint.getYAxis() + "]  => ");
		}
		
		System.out.print("END");
	}
	
	private boolean solveMazeRecursive(int currentXAxis, int currentYAxis) 
	{
		//Base case for recursive
		if(currentXAxis == mazeSize -1 && currentYAxis == mazeSize -1)
		{
			pathPoints.add(new PathPoint(currentXAxis, currentYAxis));
			return true;
		}
		
		if(!isViablePath(currentXAxis, currentYAxis))
		{
			return false;
		}
		else
		{
			pathPoints.add(new PathPoint(currentXAxis, currentYAxis));
		}
		
		
		//check down path
		if(solveMazeRecursive(currentXAxis + 1, currentYAxis))
		{
			return true;
		}
		
		//check right path
		if(solveMazeRecursive(currentXAxis, currentYAxis + 1))
		{
			return true;
		}
		
		return false;
		
		
		
		
	}

	private boolean isViablePath(int currentXAxis, int currentYAxis)
	{
		return currentXAxis >= 0 && currentXAxis < mazeSize &&
					currentYAxis >= 0 && currentYAxis < mazeSize	&&
						maze[currentXAxis][currentYAxis] == 1;
				
				
	}

	private void feedData()
	{
		System.out.print("Enter MAZE size : ");
		mazeSize = scanner.nextInt();
		maze = new int[mazeSize][mazeSize];
		
		System.out.println("Enter maze data only [1 and 0 are allowed]");
		
		for(int i = 0; i <  mazeSize; i++)
		{	
			for(int j = 0; j <  mazeSize; j++)
			{
				maze[i][j] = scanner.nextInt();
			}
		}
	}
	
	private  class PathPoint
	{
		 int xAxis, yAxis;

		public PathPoint(int xAxis, int yAxis) {
			this.xAxis = xAxis;
			this.yAxis = yAxis;
		}

		public int getXAxis() {
			return xAxis;
		}


		public int getYAxis() {
			return yAxis;
		}

	};
	


	public static void main(String[] args) {
		

		new MazePath().go();

	}

}
