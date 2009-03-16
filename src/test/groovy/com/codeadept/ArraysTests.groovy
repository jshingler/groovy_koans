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

  void testArraysInGroovyAreLists() {
    def emptyArray = []

    assert emptyArray instanceof List
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

  void testArraySublist() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert [__] == array.subList(0, 2)
    assert [__] == array.subList(0, 4)

    shouldFail __, {array.subList(0, 5)}
  }

  void testArrayRanges() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert 0..1 instanceof Range

    assert [1, 2, 3, 4, 5] != 1..5
    assert [__] == (1..5).toArray()
    assert [__] == (1..<5).toArray()
  }

  void testSlicingArraysWithRanges() {
    def array = ["peanut", "butter", "and", "jelly"]

    assert ["peanut", "butter"] == array[0..1]
    assert [__] == array[0..3]
    assert [__] == array[0..<3]
  }

  void testPushAndPop() {
    def array = [1, 2]

    array.push 3
    assert [__] == array

    def poppedVal = array.pop()
    assert __ == poppedVal

    assert [__] == array
  }

  void testParallelAssignment() {
    def (x, y) = [1, 2]

    assert x == __
    assert y == __

    (x, y) = [y, x]

    assert x == __
    assert y == __
  }

  void testParallelAssignmentWithNotEnoughElements() {
    def (x, y) = [1]

    assert x == __
    assert y == __
  }

  void testParallelAssignmentWithTooManyElements() {
    def (x, y) = [1, 2, 3, 4]

    assert x == __
    assert y == __
  }

}