import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Tests {

	@Test
	void test1() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L, new BigDecimal(8.0));
		Assert.assertTrue("Same day", ip.updatePayment(p2)==true);;
	}
	@Test
	void test2() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+1, new BigDecimal(8.0));
		Assert.assertTrue("day+1",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test3() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+2, new BigDecimal(8.0));
		Assert.assertTrue("day+2",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test4() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+3, new BigDecimal(8.0));
		Assert.assertTrue("day+3",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test5() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+4, new BigDecimal(8.0));
		Assert.assertTrue("day+4",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test6() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+5, new BigDecimal(8.0));
		Assert.assertTrue("day+5",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test7() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L+6, new BigDecimal(8.0));
		Assert.assertTrue("day+6",  ip.updatePayment(p2)==false);;
	}
	@Test
	void test8() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-1, new BigDecimal(8.0));
		Assert.assertTrue("day-1",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test9() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-2, new BigDecimal(8.0));
		Assert.assertTrue("day-2",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test10() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-3, new BigDecimal(8.0));
		Assert.assertTrue("day-3",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test11() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-4, new BigDecimal(8.0));
		Assert.assertTrue("day-4",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test12() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-5, new BigDecimal(8.0));
		Assert.assertTrue("day-5",  ip.updatePayment(p2)==true);;
	}
	@Test
	void test13() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-6, new BigDecimal(8.0));
		Assert.assertTrue("day-6",  ip.updatePayment(p2)==false);;
	}
	@Test
	void test14() {
		Payment p = new Payment(10L, new BigDecimal(8.5));
		InterestPayment ip = new InterestPayment(p);
		Payment p2 = new Payment(10L-1, new BigDecimal(8.0));
		Assert.assertTrue("day-1",  ip.updatePayment(p2)==true);;
	}

}
