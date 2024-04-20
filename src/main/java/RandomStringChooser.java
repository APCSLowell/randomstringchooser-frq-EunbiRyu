import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
  private ArrayList <String> wordArr();
  public RandomStringChooser(String[] initialArr){
    wordArr = new ArrayList <String> ();
    for(int i=0; i< initialArr.length();i++){
      wordArr.add(initialArr[i]);
    }
  }
  public String getNext(){
    if(wordArr.size()==0){
      return "NONE";
    }
    int index=(int)(Math.random()*wordArr.size());
    return wordArr.get(index);
    wordArr.remove(index);
  }
}
