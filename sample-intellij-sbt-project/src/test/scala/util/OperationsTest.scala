package util

import org.scalatest.Matchers
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._

class OperationsTest extends org.scalatest.FunSpec with Matchers with MockitoSugar{

  val mockCalculator = mock[Calculator]
  when(mockCalculator.add(1,2)).thenReturn(3)
  when(mockCalculator.add(2,2)).thenReturn(4)
  val op = new Operations(mockCalculator)

  describe("addition") {

    it("should add 2 number") {
      op.add(1, 2) should be(3)
    }

    ignore("should add another 2 number") {
      op.add(2, 2) should be(4)
    }

  }

  describe("substraction"){

  }


}
