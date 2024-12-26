import java.util.StringTokenizer;

class Tokeniz{  

 public static void main(String[] args) {
String text ="ITI develops people and ITI hose of developers and ITI for people";

StringTokenizer tok = new StringTokenizer(text," ");
int count =0;
while(tok.hasMoreTokens()){
String word = tok.nextToken();
if(word.equals("ITI"))
count++;

}


System.out.println("Count" + count);




}
}
