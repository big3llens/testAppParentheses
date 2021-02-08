
public class TestApp {
    private Stack stack;

    public boolean stringParser(String s){
        stack = new Stack(s.length());
        for (int i = 0; i < stack.getSize(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case '(':
                case '[':
                case '{':
                    stack.add(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if (!stack.isEmpty()) {
                        char topChar = stack.delete();
                        if (ch == ')' && topChar != '(' || ch == ']' && topChar != '[' || ch == '}' && topChar != '{')
                            return false;
                    } else System.out.println("Пустая строка");
                    break;
                default:
                    break;
            }
            }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
