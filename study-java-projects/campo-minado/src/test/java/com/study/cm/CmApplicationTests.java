package com.study.cm;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CmApplicationTests {

	@Test
	void testarSeIgualADois() {
		int a = 1 + 1;
		Assertions.assertEquals(2, a);
	}

	@Test
	void testarSeIgualASete() {
		int a = 2 + 10 - 9;
		Assertions.assertEquals(3, a);
	}

}
