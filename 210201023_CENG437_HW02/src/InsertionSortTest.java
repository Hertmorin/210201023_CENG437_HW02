import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

	int expected[] = null;
	int input[] = null;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
		expected = null;
		input = null;
		assertNull(expected);
		assertNull(input);
	}

	@Test
	void test1() {
		expected = new int[] { 1 };
		input = new int[] { 1 };
		InsertionSort.insertionSort(input);
		Assert.assertArrayEquals(expected, input);
	}

	@Test
	void test2() {
		expected = new int[] { 1, 2 };
		input = new int[] { 1, 2 };
		InsertionSort.insertionSort(input);
		Assert.assertArrayEquals(expected, input);
	}

	@Test
	void test3() {
		expected = new int[] { 1, 2 };
		input = new int[] { 2, 1 };
		InsertionSort.insertionSort(input);
		Assert.assertArrayEquals(expected, input);
	}

}
