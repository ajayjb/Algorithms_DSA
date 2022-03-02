package com.ajay.Recursion.BacktrackingAndMazes;

import java.util.ArrayList;
import java.util.Arrays;

public class PathFinder {
    public static void main(String[] args){
//        System.out.println(count(1,1,4));
//        System.out.println(findPath("", 1,1,3));
//        System.out.println(pathFinder2("", 1,1,3));
        boolean[][] maze = {{true, true, true},
                            {true, true, true},
                            {true, true, true}};
//        System.out.println(pathFinder3("", 0, 0 ,maze));
//        System.out.println(pathFinder4("", 0, 0 ,maze));
        pathfinder6("", 0, 0 ,maze);
        int[][] maze1 = new int[3][3];
        pathfinder7("", 0,0, maze1, 1);

        System.out.println();
        System.out.println();
        System.out.println();

        int[][] numRoute = new int[maze.length][maze[0].length];
        pathfinder8("", 0, 0, maze, 1, numRoute);
    }
    static int count(int row, int col, int end){
        if(row==end || col==end){
            return 1;
        }
        int rowStep = count(row+1, col, end);
        int colStep = count(row, col+1, end);
        return rowStep+colStep;
    }

    static ArrayList findPath(String path, int row, int col, int end){
        if(row==end && col==end){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(path);
            return temp;
        }
        if(row==end){
            return findPath(path+"R", row, col+1, end);
        }
        if(col==end){
            return findPath(path+"D", row+1, col, end);
        }
        ArrayList <String> rowStep = findPath(path+"D", row+1, col, end);
        ArrayList <String> colStep = findPath(path+"R", row, col+1, end);
        ArrayList <String> finalCarry = new ArrayList<>();
        finalCarry.addAll(rowStep);
        finalCarry.addAll(colStep);
        return finalCarry;
    }

    // If we travel diagonal also
    static ArrayList<String> pathFinder2(String path, int row, int col, int end){
        if(row==end && col==end){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(path);
            return temp;
        }
        if(row == end){
            return pathFinder2(path+"R", row, col+1, end);
        }
        if(col == end){
            return pathFinder2(path+"D", row+1, col, end);
        }
        ArrayList <String> rowStep = pathFinder2(path+"D", row+1, col, end);
        ArrayList <String> crossStep = pathFinder2(path+"C", row+1, col+1, end);
        ArrayList <String> colStep = pathFinder2(path+"R", row, col+1, end);
        ArrayList <String> finalCarry = new ArrayList<>();
        finalCarry.addAll(rowStep);
        finalCarry.addAll(crossStep);
        finalCarry.addAll(colStep);
        return finalCarry;
    }

    // If there is obstacle along the path, we just have to skip it return from there.(They can travel diagonal also)
    static ArrayList<String> pathFinder3(String path, int row, int col, boolean[][] maze){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(path);
            return temp;
        }
        if(!maze[row][col]){
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        if(row == maze.length-1){
            return pathFinder3(path+"R", row, col+1, maze);
        }
        if(col == maze[0].length-1){
            return pathFinder3(path+"D", row+1, col, maze);
        }
        ArrayList <String> rowStep = pathFinder3(path+"D", row+1, col, maze);
        ArrayList <String> crossStep = pathFinder3(path+"C", row+1, col+1, maze);
        ArrayList <String> colStep = pathFinder3(path+"R", row, col+1, maze);
        ArrayList <String> finalCarry = new ArrayList<>();
        finalCarry.addAll(rowStep);
        finalCarry.addAll(crossStep);
        finalCarry.addAll(colStep);
        return finalCarry;
    }

    // If there is obstacle along the path, we just have to skip it return from there.(They cannot travel diagonal also)
    static ArrayList<String> pathFinder4(String path, int row, int col, boolean[][] maze){
        if(row==maze.length-1 && col==maze[0].length-1){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(path);
            return temp;
        }
        if(!maze[row][col]){
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        if(row == maze.length-1){
            return pathFinder4(path+"R", row, col+1, maze);
        }
        if(col == maze[0].length-1){
            return pathFinder4(path+"D", row+1, col, maze);
        }
        ArrayList <String> rowStep = pathFinder4(path+"D", row+1, col, maze);
        ArrayList <String> colStep = pathFinder4(path+"R", row, col+1, maze);
        ArrayList <String> finalCarry = new ArrayList<>();
        finalCarry.addAll(rowStep);
        finalCarry.addAll(colStep);
        return finalCarry;
    }

    // The purpose of code is same as above, code is more optimized(As of kunal video).
    static void pathfinder5(String path, int r, int c, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(r<maze.length-1){
            pathfinder5(path+"D", r+1, c, maze);
        }
        if(c<maze[0].length-1){
            pathfinder5(path+"R", r, c+1, maze);
        }
    }

    // what if we can travel up down left right.
    static void pathfinder6(String path, int r, int c, boolean[][] maze){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c] = false;
        if(r<maze.length-1){
            pathfinder6(path+"D", r+1, c, maze);
        }
        if(c<maze[0].length-1){
            pathfinder6(path+"R", r, c+1, maze);
        }
        if(r>0){
            pathfinder6(path+"U", r-1, c, maze);
        }
        if(c>0){
            pathfinder6(path+"L", r, c-1, maze);
        }
        maze[r][c] = true;
    }
// This will not work if their any obstacle. for that next will work fine.
    static void pathfinder7(String path, int r, int c, int[][] maze, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            maze[r][c] = step;
            System.out.println(Arrays.toString(maze[0]));
            System.out.println(Arrays.toString(maze[1]));
            System.out.println(Arrays.toString(maze[2]));
            System.out.println(path);
            System.out.println();
            return;
        }
        if(maze[r][c]>0){
            return;
        }
        maze[r][c] = step;
        if(r<maze.length-1){
            pathfinder7(path+"D", r+1, c, maze, step+1);
        }
        if(c<maze[0].length-1){
            pathfinder7(path+"R", r, c+1, maze, step+1);
        }
        if(r>0){
            pathfinder7(path+"U", r-1, c, maze, step+1);
        }
        if(c>0){
            pathfinder7(path+"L", r, c-1, maze, step+1);
        }
        maze[r][c] = 0;
    }

    static void pathfinder8(String path, int r, int c, boolean[][] maze, int step, int[][] numRoute){
        if(r==maze.length-1 && c==maze[0].length-1){
            numRoute[r][c] = step;
            System.out.println(Arrays.toString(numRoute[0]));
            System.out.println(Arrays.toString(numRoute[1]));
            System.out.println(Arrays.toString(numRoute[2]));
            System.out.println(path);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }
        numRoute[r][c] = step;
        maze[r][c] = false;
        if(r<maze.length-1){
            pathfinder8(path+"D", r+1, c, maze, step+1, numRoute);
        }
        if(c<maze[0].length-1){
            pathfinder8(path+"R", r, c+1, maze, step+1, numRoute);
        }
        if(r>0){
            pathfinder8(path+"U", r-1, c, maze, step+1, numRoute);
        }
        if(c>0){
            pathfinder8(path+"L", r, c-1, maze, step+1, numRoute);
        }
        maze[r][c] = true;
        numRoute[r][c] = 0;
    }
}
