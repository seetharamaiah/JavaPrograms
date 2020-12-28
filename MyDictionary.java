
import java.io.*;
import java.io.FileInputStream;


public class MyDictionary 
{
   public int countCharacters(File myFile)
   {  int charCount = 0;
      String data;  
       try{
      
        FileInputStream fStrm = new FileInputStream(myFile); 
        InputStreamReader fData= new InputStreamReader(fStrm); 
        BufferedReader bReadLine = new BufferedReader(fData);      
      while((data = bReadLine.readLine()) != null) {
         charCount += data.length();                        
      }           
      
     
       }catch(Exception ex){ ex.printStackTrace();} return charCount;
   }
    public int countWords(File myFile)
    {
        int wordCount = 0;
      String data;  
       try{  
        FileInputStream fStrm = new FileInputStream(myFile); 
        InputStreamReader fData = new InputStreamReader(fStrm); 
        BufferedReader bReadLine= new BufferedReader(fData);     
         while((data = bReadLine.readLine()) != null)
        { 
             String[] wordList =data.split("\\s+"); 
               wordCount+= wordList.length; 
        } 
       
       
       
       
       }catch(Exception ex){ ex.printStackTrace();} return wordCount;
    }
   public int countVowels(File myFile)
    {   int vowelCount = 0;
    try{
      String[] Numberofwords=null;    
      FileReader fr = new FileReader(myFile);  
      BufferedReader br = new BufferedReader(fr);  
      String data;
       int fcount=0;
      while((data=br.readLine())!=null)
      {
         Numberofwords=data.split(" "); 
         for(int i=0;i<Numberofwords.length;i++)
         {
            for(int j=0;j<Numberofwords[i].length();j++)
            {
               char character=Numberofwords[i].charAt(j);  
               if(character == 'a' || character == 'e' || character == 'i' ||character == 'o' || character == 'u')  
               {
                   fcount=1;
               }
               
            }
            if(fcount==1)
            {
               vowelCount++;
            }
            fcount=0;
          
         } }
      }catch(Exception ex){ ex.printStackTrace();} return vowelCount; 
    }
   public boolean searchWord(File myFile, String myWord)
   {    boolean result = false;
     try{
         String[] Numberofwords=null; 
      FileReader fr = new FileReader(myFile); 
      BufferedReader br = new BufferedReader(fr);
      String data;     
      String input=myWord; 
      int wordCount=0;
     
      while((data=br.readLine())!=null)  
      {
         Numberofwords=data.split(" ");
          for (String word : Numberofwords) 
          {
                 if (word.equals(input))  
                 {
                   wordCount++;    
                 }
          }
      }
      if(wordCount!=0) 
      {
        result=true;
      }
      else
      {
         result=false;
      }
      
      
     }catch(Exception ex){ex.printStackTrace();} return result;
   }
   public File openMyFile(String fName)
   {
       File file =new File(fName);
       return file;
   }
   public void closeFile(File myFile)
   {
       try{
       FileReader frClose = new FileReader(myFile);
       frClose.close();
               }catch(Exception ex){ex.printStackTrace();} 
   }
   
}