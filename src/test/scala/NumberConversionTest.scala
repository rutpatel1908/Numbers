import org.scalatest._

/**
  * Created by Profile on 19/07/2017.
  */



class NumberConversionTest extends FlatSpec with Matchers{

  val conversionTest = new Convertor()
  val scannerTest = new NumberConversionTest()

  //Short Conversion Tests

  it should "Follow the 10^3 notation and it should display the digits 123 in Short Conversion" in{
    assert(conversionTest.convertNumber("123","Short") === "Short Conversion: 123")
  }

  it should "Follow the 10^4 notation and it should display the digits 1234 in Short Conversion" in{
    assert(conversionTest.convertNumber("1234","Short") === "Short Conversion: 1 thousand 234")
  }

  it should "Follow the 10^6 notation and it should display the digits 123456 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456","Short") === "Short Conversion: 123 thousand 456")
  }

  it should "Follow the 10^9 notation and it should display the digits 123456789 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456789","Short") === "Short Conversion: 123 million 456 thousand 789")
  }

  it should "Follow the 10^12 notation and it should display the digits 123456789101 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456789101","Short") === "Short Conversion: 123 billion 456 million 789 thousand 101")
  }

  it should "Follow the 10^15 notation and it should display the digits 123456789101112 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456789101112","Short") === "Short Conversion: 123 trillion 456 billion 789 million 101 thousand 112")
  }

  it should "Follow the 10^18 notation and it should display the digits 123456789101112131 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456789101112131","Short") === "Short Conversion: 123 quadrillion 456 trillion 789 billion 101 million 112 thousand 131")
  }

  it should "Follow the 10^21 notation and it should display the digits 123456789101112131 in Short Conversion" in{
    assert(conversionTest.convertNumber("123456789101112131415","Short") === "Short Conversion: 123 quintillion 456 quadrillion 789 trillion 101 billion 112 million 131 thousand 415")
  }

  it should "Follow the 10^22 notation and it should display the digits 1234567891011121314156 in Short Conversion" in{
    assert(conversionTest.convertNumber("1234567891011121314156","Short") === "Short Conversion: 1 sextillion 234 quintillion 567 quadrillion 891 trillion 011 billion 121 million 314 thousand 156")
  }



  //Long Conversion Tests

  it should "Follow the 10^3 notation and it should display the digits 123 in Long Conversion" in{
    assert(conversionTest.convertNumber("123","Long") === "Long Conversion: 123")
  }

  it should "Follow the 10^4 notation and it should display the digits 1234 in Long Conversion" in{
    assert(conversionTest.convertNumber("1234","Long") === "Long Conversion: 1 thousand 234")
  }

  it should "Follow the 10^6 notation and it should display the digits 123456 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456","Long") === "Long Conversion: 123 thousand 456")
  }

  it should "Follow the 10^9 notation and it should display the digits 123456789 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456789","Long") === "Long Conversion: 123 million 456 thousand 789")
  }

  it should "Follow the 10^12 notation and it should display the digits 123456789101 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456789101","Long") === "Long Conversion: 123 millard 456 million 789 thousand 101")
  }

  it should "Follow the 10^15 notation and it should display the digits 123456789101112 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456789101112","Long") === "Long Conversion: 123 billion 456 millard 789 million 101 thousand 112")
  }

  it should "Follow the 10^18 notation and it should display the digits 123456789101112131 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456789101112131","Long") === "Long Conversion: 123 billiard 456 billion 789 millard 101 million 112 thousand 131")
  }

  it should "Follow the 10^21 notation and it should display the digits 123456789101112131 in Long Conversion" in{
    assert(conversionTest.convertNumber("123456789101112131415","Long") === "Long Conversion: 123 trillion 456 billiard 789 billion 101 millard 112 million 131 thousand 415")
  }

  it should "Follow the 10^22 notation and it should display the digits 1234567891011121314156 in Long Conversion" in{
    assert(conversionTest.convertNumber("1234567891011121314156","Long") === "Long Conversion: 1 trilliard 234 trillion 567 billiard 891 billion 011 millard 121 million 314 thousand 156")
  }



  //Scanner test
  it should "It should print out error message if we try to enter 0 as the input" in{
    assert(conversionTest.convertNumber("123","Long") === "Long Conversion: 123")
  }
}
