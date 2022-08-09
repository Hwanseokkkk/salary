package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.example.libs.Employee;
import com.example.libs.Input;

public class InputTest {

	@Test
	public void testInput() {
		Employee [] array = new Employee[1];
		Input input = new Input(array);
		int count = input.input();
		//assertNotNull(array[0]); //null이 아닌걸 확인하자.
		//assertEquals(1, count); //count가 잘되는지 확인
		assertEquals("A512", array[0].getEmpno()); //사원번호 확인
	}

}
