import java.io.*;
import java.util.*;
class Pattern {
	public static void main (String[] args) {
		// logic for the upper half of the pattern
		char[][] matric = new char[8][8];
		int i=0;
		while(i<4){
		if(i%2==0){
		for(int j=0;j<i+1;j++){
		matric[i][j]='*';
		}
	
		}else{
		for(int j=7;j>=(7-i);j--){
		matric[i][j]='*';
		}}
		i++;
		}
		
		//copyibng upper half in the lower half in reverse order and flipped manner
		for(i=4;i<8;i++){
		for(int j=0;j<8;j++){
		matric[i][j]=matric[7-i][7-j];}}
		
		//filling rest of the empty section with #
		for( i=0;i<8;i++){
		for(int j=0;j<8;j++){
		if(matric[i][j]!='*'){
		matric[i][j]='#';}
		}}
		
		//print result statement
		for( i=0;i<8;i++){
		for(int j=0;j<8;j++){
		System.out.print(matric[i][j]+" ");
		}
		System.out.println();}
		
	}
}




/---------------------OUTPUT---------------/
* # # # # # # # 
# # # # # # * * 
* * * # # # # # 
# # # # * * * * 
* * * * # # # # 
# # # # # * * * 
* * # # # # # # 
# # # # # # # *
