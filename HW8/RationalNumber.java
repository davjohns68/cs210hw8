// CS210 Assignment #8 "Rational Number"
// David Johnson
// This implements a rational number class including common fields and operators
// Class invariant: Denominator must not == 0

public class RationalNumber {
    // These are the class' fields
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator) {
        // Main constructor
        // Takes a numerator and a denominator as arguments
        // Pre-condition: denominator cannot be 0
        if (denominator == 0) {
            throw new IllegalArgumentException();
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
	
    public RationalNumber() {
        // Default constructor
        this(0, 1);
    }
	
    public int getDenominator() {
        // Returns object's denominator
        return this.denominator;
    }

    public int getNumerator() {	
        // Returns object's numerator
        return this.numerator;
    }

    public String toString() {
        // Returns string representation of the object
        if (this.denominator == 1 && !(this.numerator == 0)) {
            return this.numerator + "";
        } else if (this.denominator == -1 && !(this.numerator == 0)) {
            return "-" + this.numerator;
        } else if (this.numerator == 0) {
            return "0";
        } else if (this.numerator < 0 && this.denominator < 0) {
            return Math.abs(this.numerator) + "/" + Math.abs(this.denominator);
        } else if (this.denominator < 0) {
            return "-" + this.numerator + "/" + Math.abs(this.denominator);
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }
	
    public RationalNumber add(RationalNumber other) {
        // Addition operator for rational numbers
        // Class invariant applies since other cannot contain a "0" denominator
        if (!(this.denominator == other.denominator)) {
            this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
            this.denominator *= other.denominator;
        } else {
            this.numerator += other.numerator;
        }
        return this;
    }

    public RationalNumber subtract(RationalNumber other) {
        // Subtraction operator for rational numbers
        // Class invariant applies since other cannot contain a "0" denominator
        if (!(this.denominator == other.denominator)) {
            this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
            this.denominator *= other.denominator;
        } else {
            this.numerator -= other.numerator;
        }
        return this;
    }

    public RationalNumber multiply(RationalNumber other) {
        // Multiplication operator for rational numbers
        // Class invariant applies since other cannot contain a "0" denominator
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        return this;
    }

    public RationalNumber divide(RationalNumber other) {
        // Multiplication operator for rational numbers
        // Class invariant applies since other cannot contain a "0" denominator
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        return this;
    }	
}
