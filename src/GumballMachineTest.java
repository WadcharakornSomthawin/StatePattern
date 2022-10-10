import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GumballMachineTest {

	@Test
	void test() {
		GumballMachine machine1 = new GumballMachine(5);
		machine1.insertQuarter();//HasQuarter
		machine1.turnCrank();//SoldState
		machine1.insertQuarter();//HasQuarter
		machine1.turnCrank();//SoldState
		machine1.insertQuarter();//HasQuarter
		machine1.turnCrank();//SoldState
		machine1.insertQuarter();//HasQuarter
		machine1.turnCrank();//SoldState
		machine1.insertQuarter();//HasQuarter
		machine1.turnCrank();//SoldOut
		
		machine1.insertQuarter();//SoldOut
		machine1.turnCrank();//SoldOut
	}

}
