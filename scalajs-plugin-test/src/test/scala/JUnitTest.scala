import org.junit.Test
import org.junit.Assert._

class JUnitTest {

  @Test
  def dummyTest(): Unit = {
    assertEquals(100, DummyObject.square(10))
    assertNotEquals(100, DummyObject.square(5))
  }

}