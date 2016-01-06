//Variable Scope
class ScopeErrors{
	int x = 5;
	public static void main(String[] args) {
    	x++; // won't compile, x is an 'instance' variable
    }
}