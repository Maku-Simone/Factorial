
import java.util.Scanner;

public class factorial
	{
		public static void main(String Args[])
			{
				Scanner sc = new Scanner(System.in);
				int Num = 0;
				System.out.println("Escribe un sensual número y te daré su sensual factorial");
				Num = sc.nextInt();
				int factorial = 1;
				if(Num == 0)
					{
						System.out.println("El Factorial de: 0 es igual a 0 ");
					}
				else 
					{
						if(Num == 1 || Num == -1)
							{
								System.out.println("El Factorial de 1 y -1 siempre es igual a 1") ;
							}
						else
							{									
								if(Num > 0)
									{
										for(int i =  1; i <= Num; i++)													
											{
												factorial *= i;
											}
											System.out.println("El Factorial de: " + Num +" es igual a " + factorial);
									}
								else 
											{
													int res = 1;
													for(int i = -1; i >= Num && i < 0; i--)													
													{
														res = res * i;
													}
													System.out.println("El Factorial de: " + Num +" es igual a " + res);
											}
							}
					}
			}
	}
