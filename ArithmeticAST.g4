grammar ArithmeticAST;

@parser::header{
import edu.westminstercollege.cmpt355.arithmetic.node.*;
import edu.westminstercollege.cmpt355.arithmetic.node.Number;
}

input
    returns [Node n]
    : expr EOF {
        $n = $expr.n;
    }
    ;

expr
returns [Node n]
    : NUMBER {
        $n = new Number($NUMBER.text);
    }
    | PI {
        $n = new Pi();
    }
    | l=expr '^' r=expr {
        $n = new Exponent($l.n, $r.n);
    }
    | op=('+' | '-') expr {
        if ($op.text.equals("-")) {
            $n = new Negate($expr.n);
        } else {
            $n = $expr.n;
        }
    }
    | l=expr op=('*' | '/') r=expr {
        if ($op.text.equals("*"))
                $n = new Multiply($l.n, $r.n);
            else
                $n = new Divide($l.n, $r.n);;
    }
    | l=expr op=('+' | '-') r=expr {
        if ($op.text.equals("+"))
            $n = new Add($l.n, $r.n);
        else
            $n = new Subtract($l.n, $r.n);
    }
    | 'sqrt(' expr ')' {
        $n = new Sqrt($expr.n);
    }
    | '(' expr ')' {
        $n = $expr.n;
    }
    ;

NUMBER
    : [0-9]+ '.' [0-9]+
    | [0-9]+
    ;

PI
    : 'pi'
    | 'π'
    ;

WS
    : [ \r\n\t]+ -> skip
    ;