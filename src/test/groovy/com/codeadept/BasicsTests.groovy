package com.codeadept
/**
 *  
 *  @author jeremy anderson
 *
 */

public class BasicsTests extends GroovyTestCase{

  void testAssertTruth() {
    assert __
  }

  void testAssertWithMessage() {
    assert false : "This is the error message"
  }

  void testAssertEquality() {
    def expected = 3
    def actual = __

    assert expected == actual : "Simple First Grade Math failed"
  }

  void testNullTruth() {
    String nullObject = null
    assert nullObject
  }

}