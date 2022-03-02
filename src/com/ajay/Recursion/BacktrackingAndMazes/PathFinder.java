package com.ajay.Recursion.BacktrackingAndMazes;

import java.util.ArrayList;

public class PathFinder {
    public static void main(String[] args){
//        System.out.println(count(1,1,4));
//        System.out.println(findPath("", 1,1,3));
//        System.out.println(pathFinder2("", 1,1,3));
        boolean[][] maze = {{true, true, true},
                            {true, false, true},
                            {true, true, true}};
//        System.out.println(pathFinder3("", 0, 0 ,maze));
//        System.out.println(pathFinder4("", 0, 0 ,maze));
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
    
}
