public class Calc {
   //static int firstNo;
   //static char operationChar;
    //static int secondNo;

    //Method to compute the result
    public static int Compute(int firstNo, char operationChar, int secondNo){
        int result;
        switch(operationChar){
            case '+':
                result = firstNo + secondNo;
                break;
            case '-':
                result = firstNo - secondNo;
                break;
            case '*':
                result = firstNo * secondNo;
                break;
            case '/':
                result = firstNo / secondNo;
                break;
            case '%':
                result = firstNo % secondNo;
                break;
             default:
                System.out.println("Please Enter the valid character");   
                break;
                
                 }
    }
}
