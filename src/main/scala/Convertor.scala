/**
  * Created by Profile on 19/07/2017.
  */
class Convertor {

  val englishConversion= List("thousand","million", "billion", "trillion", "quadrillion", "quintillion", "sextillion")
  val frenchConversion= List("thousand", "million", "millard", "billion", "billiard", "trillion", "trilliard")




  def convertNumber(number: String, conversion: String): String = {

    def num(formattedNumber: String, typeOfConversion: List[String]): String = formattedNumber.length match {
      case check if (formattedNumber.length <= 3) => formattedNumber
      case 4 => formattedNumber.head.toString + " " + typeOfConversion(0) + " " + num(formattedNumber.tail, typeOfConversion)
      case 7 => formattedNumber.head.toString + " " + typeOfConversion(1) + " " + num(formattedNumber.tail, typeOfConversion)
      case 10 => formattedNumber.head.toString + " " + typeOfConversion(2) + " " + num(formattedNumber.tail, typeOfConversion)
      case 13 => formattedNumber.head.toString + " " + typeOfConversion(3) + " " + num(formattedNumber.tail, typeOfConversion)
      case 16 => formattedNumber.head.toString + " " + typeOfConversion(4) + " " + num(formattedNumber.tail, typeOfConversion)
      case 19 => formattedNumber.head.toString + " " + typeOfConversion(5) + " " + num(formattedNumber.tail, typeOfConversion)
      case 22 => formattedNumber.head.toString + " " + typeOfConversion(6) + " " + num(formattedNumber.tail, typeOfConversion)
      case _ => formattedNumber.head.toString + num(formattedNumber.tail, typeOfConversion)
    }

    if(conversion == "Short") {"Short Conversion: " + num(number,englishConversion)}
    else if(conversion == "Long") {"Long Conversion: " + num(number,frenchConversion)}
    else if(conversion == "Both") {"Short Conversion: " + {num(number,englishConversion)} + "\n" + "Long Conversion: " + {num(number.toString,frenchConversion)}}
    else "Incorrect Conversion Type"

  }

}
