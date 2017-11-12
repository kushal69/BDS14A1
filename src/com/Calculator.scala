package com

object Calculator {
  def choices() = {
    println("Enter a choice from the below to perform operation :");
    println("1. Rational Add");
    println("2. Rational Subtraction");
    println("3. Rational Multiply");
    println("4. Rational Divide");
    println("5. Number Add");
    println("6. Number Subtraction");
    println("7. Number Multiply");
    println("8. Number Divide");
    println("9. Exit");
  }

  def getInput(choice: Int) {
    var fraction: GetFraction = new GetFraction(1, 1);
    choice match {
      case 1 =>
        print("Rational Sum : ");
        print("Enter numerator value Rational no. 1 : ");
        val n1 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 1 : ");
        val d1 = scala.io.StdIn.readInt();

        print("Enter numerator value Rational no. 2 : ");
        val n2 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 2 : ");
        val d2 = scala.io.StdIn.readInt();

        fraction.sum(new GetFraction(n1, d1), new GetFraction(n2, d2));

      case 2 =>
        println("Rational Subtraction :");
        print("Enter numerator value Rational no. 1 : ");
        val n1 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 1 : ");
        val d1 = scala.io.StdIn.readInt();

        print("Enter numerator value Rational no. 2 : ");
        val n2 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 2 : ");
        val d2 = scala.io.StdIn.readInt();

        fraction.subtract(new GetFraction(n1, d1), new GetFraction(n2, d2));

      case 3 =>
        print("Rational Multiplication : ");
        print("Enter numerator value Rational no. 1 : ");
        val n1 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 1 : ");
        val d1 = scala.io.StdIn.readInt();

        print("Enter numerator value Rational no. 2 : ");
        val n2 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 2 : ");
        val d2 = scala.io.StdIn.readInt();

        fraction.multiply(new GetFraction(n1, d1), new GetFraction(n2, d2));

      case 4 =>
        println("Rational Division :");
        print("Enter numerator value Rational no. 1 : ");
        val n1 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 1 : ");
        val d1 = scala.io.StdIn.readInt();

        print("Enter numerator value Rational no. 2 : ");
        val n2 = scala.io.StdIn.readInt();
        print("Enter denomenator value Rational no. 2 : ");
        val d2 = scala.io.StdIn.readInt();

        fraction.divide(new GetFraction(n1, d1), new GetFraction(n2, d2));

      case 5 =>
        println("Number Sum :");
        print("Enter value 1 : ");
        val v1 = scala.io.StdIn.readInt();
        print("Enter value 2 : ");
        val v2 = scala.io.StdIn.readInt();

        fraction.sum(v1, v2);

      case 6 =>
        println("Number Subtraction :");
        print("Enter value 1 : ");
        val v1 = scala.io.StdIn.readInt();
        print("Enter value 2 : ");
        val v2 = scala.io.StdIn.readInt();

        fraction.subtract(v1, v2);

      case 7 =>
        println("Number Multiplication :");
        print("Enter value 1 : ");
        val v1 = scala.io.StdIn.readInt();
        print("Enter value 2 : ");
        val v2 = scala.io.StdIn.readInt();

        fraction.multiply(v1, v2);

      case 8 =>
        println("Number Division :");
        print("Enter value 1 : ");
        val v1 = scala.io.StdIn.readInt();
        print("Enter value 2 : ");
        val v2 = scala.io.StdIn.readInt();

        fraction.divide(v1, v2);
    }
  }

  def main(args: Array[String]) {
    while(true) {
      choices();
      var input = scala.io.StdIn.readInt();
      if (input < 9) {
        getInput(input);
      } else {
        println("Exited .....");
        System.exit(0);
      }
    }
  }
}