// Generated from java-escape by ANTLR 4.11.1
package edu.westminstercollege.cmpt355.arithmetic;

import edu.westminstercollege.cmpt355.arithmetic.node.*;
import edu.westminstercollege.cmpt355.arithmetic.node.Number;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ArithmeticASTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUMBER=7, PI=8, WS=9;
	public static final int
		RULE_input = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"input", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUMBER", "PI", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArithmeticASTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public Node n;
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ArithmeticASTParser.EOF, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			((InputContext)_localctx).expr = expr(0);
			setState(5);
			match(EOF);

			        ((InputContext)_localctx).n =  ((InputContext)_localctx).expr.n;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Node n;
		public ExprContext l;
		public Token op;
		public ExprContext expr;
		public ExprContext r;
		public TerminalNode NUMBER() { return getToken(ArithmeticASTParser.NUMBER, 0); }
		public TerminalNode PI() { return getToken(ArithmeticASTParser.PI, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(9);
				match(NUMBER);

				        ((ExprContext)_localctx).n =  new Number(_localctx.n.text);
				    
				}
				break;
			case PI:
				{
				setState(11);
				match(PI);

				        ((ExprContext)_localctx).n =  new Pi();
				    
				}
				break;
			case T__0:
			case T__1:
				{
				setState(13);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(14);
				((ExprContext)_localctx).expr = expr(4);


				    
				}
				break;
			case T__4:
				{
				setState(17);
				match(T__4);
				setState(18);
				((ExprContext)_localctx).expr = expr(0);
				setState(19);
				match(T__5);

				        ((ExprContext)_localctx).n =  ((ExprContext)_localctx).expr.n;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(36);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(34);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(24);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(25);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__2 || _la==T__3) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(26);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(4);

						                  if ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("*"))
						                          ((ExprContext)_localctx).n =  new Multiply(((ExprContext)_localctx).l.n, ((ExprContext)_localctx).r.n);
						                      else
						                          ((ExprContext)_localctx).n =  new Divide(((ExprContext)_localctx).l.n, ((ExprContext)_localctx).r.n);;
						              
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(29);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(30);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(31);
						((ExprContext)_localctx).r = ((ExprContext)_localctx).expr = expr(3);

						                  if ((((ExprContext)_localctx).op!=null?((ExprContext)_localctx).op.getText():null).equals("+"))
						                      ((ExprContext)_localctx).n =  new Add(((ExprContext)_localctx).l.n, ((ExprContext)_localctx).r.n);
						                  else
						                      ((ExprContext)_localctx).n =  new Subtract(((ExprContext)_localctx).l.n, ((ExprContext)_localctx).r.n);
						              
						}
						break;
					}
					} 
				}
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\t(\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u0017\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001#\b\u0001\n\u0001\f\u0001&\t\u0001\u0001\u0001\u0000\u0001\u0002"+
		"\u0002\u0000\u0002\u0000\u0002\u0001\u0000\u0001\u0002\u0001\u0000\u0003"+
		"\u0004*\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0016\u0001\u0000\u0000"+
		"\u0000\u0004\u0005\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000"+
		"\u0001\u0006\u0007\u0006\u0000\uffff\uffff\u0000\u0007\u0001\u0001\u0000"+
		"\u0000\u0000\b\t\u0006\u0001\uffff\uffff\u0000\t\n\u0005\u0007\u0000\u0000"+
		"\n\u0017\u0006\u0001\uffff\uffff\u0000\u000b\f\u0005\b\u0000\u0000\f\u0017"+
		"\u0006\u0001\uffff\uffff\u0000\r\u000e\u0007\u0000\u0000\u0000\u000e\u000f"+
		"\u0003\u0002\u0001\u0004\u000f\u0010\u0006\u0001\uffff\uffff\u0000\u0010"+
		"\u0017\u0001\u0000\u0000\u0000\u0011\u0012\u0005\u0005\u0000\u0000\u0012"+
		"\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005\u0006\u0000\u0000\u0014"+
		"\u0015\u0006\u0001\uffff\uffff\u0000\u0015\u0017\u0001\u0000\u0000\u0000"+
		"\u0016\b\u0001\u0000\u0000\u0000\u0016\u000b\u0001\u0000\u0000\u0000\u0016"+
		"\r\u0001\u0000\u0000\u0000\u0016\u0011\u0001\u0000\u0000\u0000\u0017$"+
		"\u0001\u0000\u0000\u0000\u0018\u0019\n\u0003\u0000\u0000\u0019\u001a\u0007"+
		"\u0001\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0004\u001b\u001c\u0006"+
		"\u0001\uffff\uffff\u0000\u001c#\u0001\u0000\u0000\u0000\u001d\u001e\n"+
		"\u0002\u0000\u0000\u001e\u001f\u0007\u0000\u0000\u0000\u001f \u0003\u0002"+
		"\u0001\u0003 !\u0006\u0001\uffff\uffff\u0000!#\u0001\u0000\u0000\u0000"+
		"\"\u0018\u0001\u0000\u0000\u0000\"\u001d\u0001\u0000\u0000\u0000#&\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\u0003\u0016"+
		"\"$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}