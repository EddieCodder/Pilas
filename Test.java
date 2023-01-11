public class Test {
	
	public static void main(String[] args) {
//		// STACKS - ARREGLOS
//		Stack<Integer> stack_array = new StackArray<Integer>(3);
//		stack_array.push(18);
//		System.out.println(stack_array);
//		stack_array.push(23);
//		System.out.println(stack_array);
//		stack_array.push(15);
//		System.out.println(stack_array);
//		stack_array.push(7);
//		System.out.println(stack_array);
//		 
//		try {
//			System.out.println("\nUSANDO TOP\n" + stack_array.top());
//			System.out.println(stack_array);
//	
//			System.out.println("\nUSANDO POP\n" + stack_array.pop());
//			System.out.println(stack_array);
//	
//		} catch (ExceptionIsEmpty e) {
//			System.out.println(e.getMessage());
//		}
		
	
		// STACKS - LISTAS ENLAZADAS
		System.out.println("\n****** LISTAS ENLAZADAS *******");
		Stack<Integer> stack_link = new StackLink<Integer>();
		stack_link.push(76);
		System.out.println(stack_link);
		stack_link.push(12);
		System.out.println(stack_link);	
		stack_link.push(23);
		System.out.println(stack_link);	

		try {
			 System.out.println("\nUSANDO TOP\n" + stack_link.top());
			 System.out.println(stack_link);
			 
			 System.out.println("\nUSANDO POP\n" + stack_link.pop());
			 System.out.println(stack_link);
		} catch (ExceptionIsEmpty e) {
			System.out.println(e.getMessage());
		}
		
	}
}
