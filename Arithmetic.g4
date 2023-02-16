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
        System.out.print($x + " ");
    }
    | PI {
        $x = Math.PI;
    }
    |<assoc=right> l=expr '^' r=expr {
        System.out.print("^ ");
        $x = Math.pow($l.x, $r.x);
    }
    | op=('+' | '-') expr {
        if ($op.text.equals("-")) {
            System.out.print("neg ");
            $x = -$expr.x;
        } else {
            System.out.print($expr.x);
            $x = $expr.x;
        }
    }
    | l=expr op=('*' | '/') r=expr {
        if ($op.text.equals("*")) {
               System.out.print("* ");
               $x = $l.x * $r.x;
        } else {
                System.out.print("/ ");
                $x = $l.x / $r.x;
        }
    }
    | l=expr op=('+' | '-') r=expr {
        if ($op.text.equals("+")) {
            System.out.print("+ ");
            $x = $l.x + $r.x;
        } else {
            System.out.print("- ");
            $x = $l.x - $r.x;
        }
    }
    | 'sqrt(' expr ')' {
        System.out.print("sqrt ");
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