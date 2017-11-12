package com

class GetFraction(n: Int, d: Int) {

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) {
      a;
    } else {
      gcd(b, a % b);
    }
  }

  val g = gcd(n, d);
  val numerator: Int = n / g;
  val denominator: Int = d / g;

  override def toString = {
      numerator + "/" + denominator;
  }

  //Auxiliary constructor
  def this(num: Int) {
    this(num, 1);
  }

  //  Addition of Rational
  def sum(a: GetFraction, b: GetFraction) {
    var numerator1: Int = a.numerator * b.denominator;
    var numerator2: Int = b.numerator * a.denominator;
    var denominator: Int = a.denominator * b.denominator;
    var numerator: Int = numerator1 + numerator2;
    var result: GetFraction = new GetFraction(numerator, denominator);
    println ("The result of Rational Sum : " + result.toString());
  }

  //  Addition of Integer 
  def sum(a: Int, b: Int) {
    var num1: GetFraction = new GetFraction(a);
    var num2: GetFraction = new GetFraction(b);
    var result = num1.numerator + num2.numerator;
    println ("The result of Integer Sum : " + result);
  }

  //  Subtraction of Rational
  def subtract(a: GetFraction, b: GetFraction) {
    var numerator1: Int = a.numerator * b.denominator;
    var numerator2: Int = b.numerator * a.denominator;
    var denominator: Int = a.denominator * b.denominator;
    var numerator: Int = numerator1 - numerator2;
    var result: GetFraction = new GetFraction(numerator, denominator);
    println ("The result of Rational Subtraction : " + result.toString());
  }

  //  Subtraction of Integer
  def subtract(a: Int, b: Int) {
    var num1: GetFraction = new GetFraction(a);
    var num2: GetFraction = new GetFraction(b);
    var result = num1.numerator - num2.numerator;
    println ("The result of Integer Subtraction : " + result);
  }

  //  Multiplication of Rational 
  def multiply(a: GetFraction, b: GetFraction) {
    var numerator: Int = a.numerator * b.numerator;
    var denominator: Int = a.denominator * b.denominator;
    var result: GetFraction = new GetFraction(numerator, denominator);
    println ("The result of Rational Multiplication : " + result.toString());
  }

  //  Multiplication of Integer 
  def multiply(a: Int, b: Int) {
    var num1: GetFraction = new GetFraction(a);
    var num2: GetFraction = new GetFraction(b);
    var result = num1.numerator * num2.numerator;
    println ("The result of Integer Multiplication : " + result);
  }

  //  Division of Rational
  def divide(a: GetFraction, b: GetFraction) {
    var numerator: Int = a.numerator * b.denominator;
    var denominator: Int = a.denominator * b.numerator;
    var result: GetFraction = new GetFraction(numerator, denominator);
    println ("The result of Rational Division : " + result.toString());;
  }

  //  Division of Integer 
  def divide(a: Int, b: Int) {
    var numerator1: GetFraction = new GetFraction(a);
    var numerator2: GetFraction = new GetFraction(b);
    var result: Double = numerator1.numerator / numerator2.numerator;
    println ("The result of Integer Divsion : " + result);
  }
}