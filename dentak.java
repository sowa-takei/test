public class dentak {
    public static void main(String[] args) {
	double inputnum1 = 0;
	double inputnum2 = 0;
	String inputstr;
	char operand;
        while(true){
	try{
		System.out.println("num1に数字を入れてください。");
		inputstr = new java.util.Scanner(System.in).nextLine();
			if(inputstr.equals("C")){
				System.out.println("クリアしました。");
				continue;
			} else if(checkNum(inputstr)){
				inputnum1 = Double.parseDouble(inputstr);
			} else {
				System.out.println("数字ではありません。");
				continue;
			}
			System.out.println("");
			System.out.println("演算子（+ - * / のいずれか）を入れてください。");
			inputstr = new java.util.Scanner(System.in).nextLine();
			//入力文字の最初の文字を演算子とする
			operand = inputstr.charAt(0);
			if(inputstr.equals('C')){
				System.out.println("クリアしました。");
				continue;
			} else if (checkOpe(operand) == false){
				System.out.println("演算子ではありません");
				continue;
			}
			System.out.println("");
			System.out.println("num2に数字を入れてください。");
			inputstr = new java.util.Scanner(System.in).nextLine();
			if(inputstr.equals("C")){
				System.out.println("クリアしました。");
				continue;
			} else if (checkNum(inputstr)){
				inputnum2 = Double.parseDouble(inputstr);
			} else {
				System.out.println("数字ではありません。");
				continue;
				}
			System.out.println("");
			displayAnswer(inputnum1,inputnum2,operand);
			break;
		} catch(Exception e){
			System.out.println("例外が発生しました");
		}
		}
	}
	//四則演算を行い結果を表示するメソッド
	static void displayAnswer(double number1,double number2,char inope ){
		double answer=0;
		switch(inope){
		case '+':
			answer = number1 + number2;
			break;
		case '-':
			answer = number1 - number2;
			break;
		case '*':
			answer = number1 * number2;
			break;
		//inope = '/'のとき
		default:
			if(number2 == 0){
				System.out.println("0除算のため計算できません");
				//プログラムを終了させる
				System.exit(0);
			} else {
				answer = number1 / number2;
			}
			}
			System.out.println("計算結果："+ answer);
		}
	//入力文字が数字かどうか確認するメソッド
	static boolean checkNum(String checknum){
		boolean result = true;
		//一文字ずつ先頭から確認する。for文は文字数分繰り返す
		for(int i=0; i<checknum.length(); i++){
		//一文字めの文字についてCharacter.isDigitメソッドで判定する
		if(Character.isDigit(checknum.charAt(i))){
				continue;
			}else{
			//数字でない場合は検証結果をfalseにする
			result = false;
			break;
			}
		}
		return result;
		}
	//入力文字が演算子かどうか確認するメソッド
	static boolean checkOpe(char operand){
		if( "+-*/".indexOf(operand) == -1){
			return false;
		}
		return true;
		}
		}