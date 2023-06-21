package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// Infix -> 중위표기법
// Postfix -> 후위표기법
public class InfixToPostfix {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();

        // 결과를 담아둘 StringBuilder
        StringBuilder answerBuilder = new StringBuilder();
        // 연산자 담는 스택 (연산자 = operator)
        Stack<Character> operStack = new Stack<>();

        // 문자 단위로 순회
        for (int i = 0; i < input.length(); i++) {
            char token = input.charAt(i);
            // TODO 연산자(+, -, *, /, '(')일때
            if (false) {
                // TODO 스택이 비어있다면 push  (if)
                // TODO 스택이 비지 않았다면, (else)
                // TODO 스택의 제일 위의 연산자가 나보다 우선순위가 낮은 연산자가 올때까지 pop (while)
                // TODO 순회 중 스택이 다 빌 경우 반복 중단  (if break)
                // TODO while 종료 후 스택에 push
            }
            // 닫는 괄호일때
            else if (token == ')') {
                // TODO 스택에서 여는 괄호가 나올때까지 pop
            }
            // 숫자의 경우 바로 출력
            else answerBuilder.append(token);
        }

        // TODO 연산자 스택이 빌때까지 pop

        System.out.println(answerBuilder);
    }

    // 5+3*1+(4-9)*3
    public static void main(String[] args) throws IOException {
        new InfixToPostfix().solution();
    }
}
