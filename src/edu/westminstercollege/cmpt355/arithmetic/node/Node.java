package edu.westminstercollege.cmpt355.arithmetic.node;

public sealed interface Node
    permits Add, Multiply, Subtract, Divide, Number, Pi, Negate, Exponent, Sqrt {
}
