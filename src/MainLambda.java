

//	 interface Interface {
//		
//		public void show();
//	}
//	class B implements Interface
//		{
//			
//			public void show() 
//			{
//				System.out.println("hello");
//			}
//		}
	
		public class MainLambda {
			public static void main(String[] args) {
				InterfaceA I;
				I = new InterfaceA()
				{
					
					public void show(int i) 
					{
						System.out.println("hello");
					}
				};
				
				I = (int i) -> System.out.println("kkkkkk"+i);
				I.show(6);
				
				I = (int i) -> System.out.println("kkkkkk"+i);
			}
		}
		



