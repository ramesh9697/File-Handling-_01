package fileHandling;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class FileHandling {

public static void main(String[] args){
 char x;
Scanner sc=new Scanner(System.in);
System.out.println("enter your option for file handling");
x=sc.next().charAt(0);
switch(x)
{
case '1' :createFile();
               break;
case '2':writeFile();
              break;
case '3':readFile();
				break;
case'4':appendFile();
				break;
default:
System.out.println("wrong option");
} 
sc.close();
}
private static void createFile() {  
try{
File obj=new File("E:newFile1.txt");
if(obj.createNewFile())
{
System.out.println("the file created successfully"+obj.getName());
}

else{    
	System.out.println("File already exists");   }}
catch(IOException e){
System.out.println("error occured");
e.printStackTrace();
}
}
private static void readFile() {  
	try{
File obj=new File("E:newFile1.txt");
Scanner robj=new Scanner (obj);
while(robj.hasNext()){
String data=robj.nextLine();
System.out.println(data);  }
robj.close();
}
catch(FileNotFoundException  e)
	{
System.out.println("error occured");
e.printStackTrace();}}
private static void writeFile() {  
	try{
FileWriter obj=new FileWriter("E:newFile1.txt");
obj.write("first line writtening inside new file");
obj.close();
System.out.println("we have successfully written in the file");}
catch(IOException e){
System.out.println("error occured");
e.printStackTrace();
}
	}
private static void appendFile() {
String str="This is second line append to nextFile";
File file=new File("E:newFile1.txt");
FileWriter fr=null;
BufferedWriter br=null;
PrintWriter pr=null;  
try{
fr=new FileWriter(file,true);
br=new BufferedWriter(fr);
pr=new PrintWriter(br);
pr.println(str);}
catch(IOException e)
{
System.out.println("error occured");
e.printStackTrace();
}
finally{   
	try{
pr.close();
br.close();
fr.close();}
catch(IOException e){
e.printStackTrace();
} 
}
}
}



