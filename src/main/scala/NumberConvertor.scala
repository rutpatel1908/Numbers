

/**
  * Created by Profile on 18/07/2017.
  */

object NumberConvertor {

  def main(args: Array[String]): Unit = {

    val scanner = new java.util.Scanner(System.in)
    println("Welcome to Number Convertor. Please enter your number")
    val readNumber = scanner.nextLine()

    println("Conversion Type. Please type Short or Long or Both")
    val readConversionType = scanner.nextLine();


    if(readConversionType == "" || readNumber == 0){
      println("Inserted incorrect details")
    }else{
      val getResult = new Convertor()
      println(getResult.convertNumber(readNumber,readConversionType))
    }

  }

}
