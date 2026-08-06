class Answer {
    public int sum(int num1, int num2) {
        return num1+num2;
    }
}
public class Add2Int{
    public static void main(String[] args){
    Answer a = new Answer();
    int result = a.sum(4,5);
    System.out.print(result);
}}
