package unit_testing.First_one;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
public class unit_test {
	private calculator calculator1 = new calculator();

	@Test
	void addTest() {
		int n1=10;
		int n2=10;
		int sum =calculator.add(n1,n2);
		
		int expected=20;
		Assertions.assertEquals(expected,sum);
	}
	
	@Test
	void SubTest() {
		int n1=20;
		int n2=10;
		int sum =calculator.sub(n1,n2);
		
		int expected=10;
		Assertions.assertEquals(expected,sum);
	}
	@Test
	void MULTest() {
		int n1=20;
		int n2=10;
		int sum =calculator.mul(n1,n2);
		
		int expected=200;
		Assertions.assertEquals(expected,sum);
	}
	@Test
	void DivTest() {
		int n1=20;
		int n2=10;
		int sum =calculator.div(n1,n2);
		
		int expected=2;
		Assertions.assertEquals(expected,sum);
	}
	
  }

