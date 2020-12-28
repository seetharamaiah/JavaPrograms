
import java.io.File;


public class TestDictionary extends MyDictionary
{
    public static void main(String[] args) {
         TestDictionary td=new TestDictionary();
         File myFile=new File("src\\test.txt");
         td.openMyFile("test.txt");
         System.out.println("Total Number of Characters :"+td.countCharacters(myFile));
         System.out.println("Total Number of Words :"+td.countWords(myFile));
         System.out.println("Total Number of Vowels :"+td.countVowels(myFile));
         System.out.println("Search the Word:"+td.searchWord(myFile,"language"));
         td.closeFile(myFile);
         System.out.println("File is Closed");
    }
   
}
