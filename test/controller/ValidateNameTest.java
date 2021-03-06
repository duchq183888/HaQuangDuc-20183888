package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * test name
 * @author duchq
 *
 */
class ValidateNameTest {

	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		"trieu son,true",
		"hai phong, true",
		"123214,false",
		",false",
		"sdp234,false",
		"Ha Noi,true"
	})
	
	void test(String name, boolean expected) {
		boolean isValid = placeOrderController.validateName(name);
		assertEquals(expected, isValid);// using assert
	}

}
