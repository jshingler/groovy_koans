package com.codeadept
/**
 *  
 *  @author jeremy anderson
 *
 */

public class ArraysTests extends GroovyTestCase {

  void testCreatingArrays() {
    def emptyArray = []

    assert emptyArray.size == __
  }

  void testArraysInGroovyAreArrayLists() {
    def emptyArray = []

    assert emptyArray instanceof ArrayList
  }

  void testArrayLiterals() {
    def array = []
    assert array == []

    array[0] = 1
    assert [1] == array

    array[1] = 2
    assert [1, __] == array

    array << 3
    assert __ == array
  }

  void testAccessingArrayElements() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert "__" == array[0]
    assert "__" == array.first()
    assert "__" == array[3]
    assert "__" == array.last()
    assert "__" == array[-1]
    assert "__" == array[-3]
  }

  void testArraySelectSpecificElements() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert __ == array[0, 1]
    assert __ == array[0, 2]
  }

  void testArrayRanges() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert 0..1 instanceof Range
    assert ["peanut", "butter"] == array[0..1]
    assert [__] == array[0..3]
    assert [__] == array[0..<3]
  }

}