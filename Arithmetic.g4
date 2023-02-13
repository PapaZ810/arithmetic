grammar Arithmetic;

@parser::header {
// This code will be included at the top of the parser .java file
import java.lang.Math;
}

input
returns [double x]
    : expr EOF {
        $x = $expr.x;
    }
    ;

expr
returns [double x]
    : NUMBER {
        // When you name something from the grammar, put a $ in front of it.
        $x = Double.parseDouble($NUMBER.text);
    }
    | PI {
        $x = Math.PI;
    }
    |<assoc=right> l=expr '^' r=expr {
        $x = Math.pow($l.x, $r.x);
    }
    | op=('+' | '-') expr {
        if ($op.text.equals("-"))
            $x = -$expr.x;
        else
            $x = $expr.x;
    }
    | l=expr op=('*' | '/') r=expr {
        if ($op.text.equals("*"))
                $x = $l.x * $r.x;
            else
                $x = $l.x / $r.x;
    }
    | l=expr op=('+' | '-') r=expr {
        if ($op.text.equals("+"))
            $x = $l.x + $r.x;
        else
            $x = $l.x - $r.x;
    }
    | 'sqrt(' expr ')' {
        $x = Math.sqrt($expr.x);
    }
    | '(' expr ')' {
        $x = $expr.x;
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