package com.edwin;

import java.util.*;

public class CreateMaze {
	private int a,b, vin, hin, vout, hout,vp,hp;
	Random r = new Random();
	private char[][] array;//declare array
	Scanner s = new Scanner(System.in);
	//constructor
	CreateMaze(){
		a = r.nextInt(26)+5;
		b = r.nextInt(26)+5;
		array= new char[a][b];
		setUp();

	}
	CreateMaze(int one, int two){
		a = one;
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
			array[v][h] ='x';
			return true;
		}else if (deadEnd(v,h)){
			//System.out.println("??");
			return false;
		}
		else{
			String user;
				do{
					System.out.print("y to continue");
					user=s.next();
				}while(user!="n"&&user=="y");
				if (user=="n"){
					System.exit(0);
				}
				array[v][h] ='x';
				System.out.println(printA());
				if(v+1<a&&traverseMaze(v+1,h)){
					//array[v][h] ='x';
					//array[v + 1][h] = 'x';
					return true;
				}else if(array[v+1][h]=='x') {
					//array[v + 1][h] = '.';
					//array[v][h] ='x';
				}
				if(h+1<b&&traverseMaze(v,h+1)){
					//array[v][h+1]='x';
					return true;
				}else if (array[v][h+1]=='x'){
					//array[v][h+1]='.';
					//array[v][h] ='x';
				}
				if(v-1>=0&&traverseMaze(v-1,h)){
					//array[v - 1][h] = 'x';
					return true;
				}else if(v-1>=0&&array[v-1][h]=='x') {
					//array[v - 1][h] = '.';
					//array[v][h] ='x';
				}
				if(h-1>=0&&traverseMaze(v,h-1)){
					//array[v][h - 1] = 'x';
					return true;
				}else if(h-1>=0&&array[v][h-1]=='x') {
					//array[v][h - 1] = '.';
					//array[v][h] ='x';
				}
				array[v][h] = '.';
				return false;

		}
	}

	public boolean autoMaze(int v, int h){

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
			}else if(array[v+1][h]=='x') {
			}
			if(h+1<b&&autoMaze(v,h+1)){
				return true;
			}else if (array[v][h+1]=='x'){
			}
			if(v-1>=0&&autoMaze(v-1,h)){
				return true;
			}else if(v-1>=0&&array[v-1][h]=='x') {
			}
			if(h-1>=0&&autoMaze(v,h-1)){
				return true;
			}else if(h-1>=0&&array[v][h-1]=='x') {
			}
			return false;

		}
	}
	//set the maze boundary to all #
	private boolean deadEnd(int v, int h) {
		return (array[v][h]=='#'||array[v][h]=='x');
	}
	private boolean reachEnd(int v, int h){
		return (v==vout&&h==hout);
	}
	private void setUpBound(){
		for (int i=0;i<a;i++){  //set whole array to .
			for(int j=0; j<b;j++)
				array[i][j]='.';
		}
		for (int i =0; i<a;i++){
			array[i][0]='#';
			array[i][b-1]='#';
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

	public int getVout() {
		return vout;
	}

	public int getHin() {
		return hin;
	}

	public int getHout() {
		return hout;
	}

	public String toString() {
		return printA();
	}


}
