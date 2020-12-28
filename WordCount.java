import java.io.*;
public class WordCount 
{
        public static void main(String args[]) throws Exception{
        int rowCount=1;
        String eachLine;  
        File fileInput=new File("src\\Input.txt");
        File fileOutput=new File("src\\Output.txt");
        BufferedWriter BWriter = new BufferedWriter(new FileWriter(fileOutput, true)); 
        FileReader fileName = new FileReader(fileInput);  
        BufferedReader bReader = new BufferedReader(fileName);  
        RandomAccessFile removeExistedData = new RandomAccessFile(fileOutput, "rw");
        removeExistedData.setLength(0);
        while((eachLine = bReader.readLine()) != null) 
        {   
            String NumberofWords[]=eachLine.split(" ");  
            BWriter.write(rowCount+++". "+NumberofWords.length+" "+eachLine+"\n");
        }  
        BWriter.close();   
        bReader.close();  
   }    
}
