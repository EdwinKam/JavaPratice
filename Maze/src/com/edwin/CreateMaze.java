package com.edwin;

import java.util.*;

public class CreateMaze {
	private int a,b, vin, hin, vout, hout;
	Random r = new Random();
	private char[][] array;//declare array
	Scanner s = new Scanner(System.in);
	//constructor
	CreateMaze(){
		a = r.nextInt(26)+5;
		b = r.nextInt(26)+5;
		array= new char[a][b];      //random array size from 5-30
		setUp();

	}
	CreateMaze(int one, int two){
		a = one;        //take user input and declare array
		b = two;
		array= new char[a][b];
		setUp();
	}

	private void setUp(){
		setUpBound();
		setWall();
		setDoor();
		System.out.println(printA());

	}
	public boolean traverseMaze(int v, int h){

		if(reachEnd(v,h)){
			array[v][h] ='x';   //if escape the maze
			return true;
		}else if (deadEnd(v,h)){
			return false;       //if reach dead end
		}
		else{
			String user;
				do{
					System.out.print("y to continue");
					user=s.next();  //ask user for input
				}while(user!="n"&&user=="y");
				if (user=="n"){
					System.exit(0);     //if n then exit system
				}
				array[v][h] ='x';       //step x when enter this [v][h]
				System.out.println(printA());       //print the maze after step
				if(v+1<a&&traverseMaze(v+1,h)){
					return true;        //go down
				}
				if(h+1<b&&traverseMaze(v,h+1)){
					return true;        //go right
				}
				if(v-1>=0&&traverseMaze(v-1,h)){
					return true;        //go up
				}
				if(h-1>=0&&traverseMaze(v,h-1)){
					return true;        //go left
				}
				array[v][h] = '.';      //otherwise, if all way is invalid, then [v][h] change to .
				return false;       //and return false, it means this block 4 ways all invalid

		}
	}

	public boolean autoMaze(int v, int h){ //this method same as the above, but no need user input 'y'

		if(reachEnd(v,h)){
			array[v][h] ='x';
			return true;
		}else if (deadEnd(v,h)){
			return false;
		}
		else{
			array[v][h] ='x';

			if(v+1<a&&autoMaze(v+1,h)){
				return true;
			}
			if(h+1<b&&autoMaze(v,h+1)){
				return true;
			}
			if(v-1>=0&&autoMaze(v-1,h)){
				return true;
			}
			if(h-1>=0&&autoMaze(v,h-1)){
				return true;
			}
			return false;

		}
	}
	//set the maze boundary to all #
	private boolean deadEnd(int v, int h) {
		return (array[v][h]=='#'||array[v][h]=='x');        //check if its dead end
	}
	private boolean reachEnd(int v, int h){
		return (v==vout&&h==hout);      //check if its exit
	}
	private void setUpBound(){
		for (int i=0;i<a;i++){  //set whole array to .
			for(int j=0; j<b;j++)
				array[i][j]='.';
		}
		for (int i =0; i<a;i++){
			array[i][0]='#';
			array[i][b-1]='#';      //4 wall to '#'
		}
		for (int i =0; i<b;i++){
			array[0][i]='#';
			array[a-1][i]='#';
		}
	}
	private void setWall(){
		int vertical;
		int horizontal;
		for (int i =0; i<a*b/5;i++) {//set 1/5 of the array to wall
			vertical = r.nextInt(a - 2) + 1;
			horizontal = r.nextInt(b - 2) + 1;
			array[vertical][horizontal] = '#';
		}

	}
	private void setDoor() {//create an entry and exit
		int rand = r.nextInt(2);
		if(rand==1){//entry
			vin =r.nextInt(a-2)+1;
			hin =0;
			//array[ventry][hentry]='.';
		}else{
			vin =0;
			hin =r.nextInt(b-2)+1;
			//array[0][r.nextInt(b-2)+1]='.';
		}
		rand = r.nextInt(2);//again
		if(rand==1){//exit
			vout =r.nextInt(a-2)+1;
			hout =b-1;
			//array[r.nextInt(a-2)+1][b-1]='.';
		}else{
			vout =a-1;
			hout =r.nextInt(b-2)+1;
			//array[a-1][r.nextInt(b-2)+1]='.';
		}
		array[vin][hin]='.';
		array[vout][hout]='.';
	}
	private String printA(){ //print vertically
		String output="";
		for(int i=0; i<a; i++){
			output = output + "\n"+printB(i);
		}
		return output;
	}
	private String printB(int avalue){//print horizontally
		String output="";
		for(int i=0; i<b; i++){
			output = output + " "+array[avalue][i];
		}
		return output;
	}

	public int getVin() {
		return vin;
	}

	public int getHin() {
		return hin;
	}

	public String toString() {
		return printA();
	}


}
