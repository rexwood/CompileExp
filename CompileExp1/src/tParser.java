// Generated from t.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, ADD=6, SUB=7, MUL=8, DIV=9, RT=10, 
		LT=11, ASSIGN=12, LP=13, RP=14, SEMICOLON=15, INT8=16, INT10=17, INT16=18, 
		REAL8=19, REAL10=20, REAL16=21, IDN=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'then'", "'else'", "'while'", "'do'", "'+'", "'-'", 
		"'*'", "'/'", "'>'", "'<'", "'='", "'('", "')'", "';'", "INT8", "INT10", 
		"INT16", "REAL8", "REAL10", "REAL16", "IDN", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_stat = 1;
	public static final String[] ruleNames = {
		"prog", "stat"
	};

	@Override
	public String getGrammarFileName() { return "t.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4); stat();
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << WHILE) | (1L << DO) | (1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << RT) | (1L << LT) | (1L << ASSIGN) | (1L << LP) | (1L << RP) | (1L << SEMICOLON) | (1L << INT8) | (1L << INT10) | (1L << INT16) | (1L << REAL8) | (1L << REAL10) | (1L << REAL16) | (1L << IDN))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OpContext extends StatContext {
		public Token op;
		public TerminalNode ASSIGN() { return getToken(tParser.ASSIGN, 0); }
		public TerminalNode RP() { return getToken(tParser.RP, 0); }
		public TerminalNode SEMICOLON() { return getToken(tParser.SEMICOLON, 0); }
		public TerminalNode LP() { return getToken(tParser.LP, 0); }
		public TerminalNode SUB() { return getToken(tParser.SUB, 0); }
		public TerminalNode LT() { return getToken(tParser.LT, 0); }
		public TerminalNode ADD() { return getToken(tParser.ADD, 0); }
		public TerminalNode RT() { return getToken(tParser.RT, 0); }
		public TerminalNode DIV() { return getToken(tParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(tParser.MUL, 0); }
		public OpContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReservedContext extends StatContext {
		public Token reserved;
		public TerminalNode ELSE() { return getToken(tParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(tParser.IF, 0); }
		public TerminalNode DO() { return getToken(tParser.DO, 0); }
		public TerminalNode THEN() { return getToken(tParser.THEN, 0); }
		public TerminalNode WHILE() { return getToken(tParser.WHILE, 0); }
		public ReservedContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitReserved(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealContext extends StatContext {
		public Token realnum;
		public TerminalNode REAL10() { return getToken(tParser.REAL10, 0); }
		public TerminalNode REAL8() { return getToken(tParser.REAL8, 0); }
		public TerminalNode REAL16() { return getToken(tParser.REAL16, 0); }
		public RealContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends StatContext {
		public TerminalNode IDN() { return getToken(tParser.IDN, 0); }
		public IdContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends StatContext {
		public Token integer;
		public TerminalNode INT16() { return getToken(tParser.INT16, 0); }
		public TerminalNode INT8() { return getToken(tParser.INT8, 0); }
		public TerminalNode INT10() { return getToken(tParser.INT10, 0); }
		public IntContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(14);
			switch (_input.LA(1)) {
			case IF:
			case THEN:
			case ELSE:
			case WHILE:
			case DO:
				_localctx = new ReservedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				((ReservedContext)_localctx).reserved = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << THEN) | (1L << ELSE) | (1L << WHILE) | (1L << DO))) != 0)) ) {
					((ReservedContext)_localctx).reserved = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ADD:
			case SUB:
			case MUL:
			case DIV:
			case RT:
			case LT:
			case ASSIGN:
			case LP:
			case RP:
			case SEMICOLON:
				_localctx = new OpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(10);
				((OpContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << RT) | (1L << LT) | (1L << ASSIGN) | (1L << LP) | (1L << RP) | (1L << SEMICOLON))) != 0)) ) {
					((OpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case INT8:
			case INT10:
			case INT16:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(11);
				((IntContext)_localctx).integer = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT8) | (1L << INT10) | (1L << INT16))) != 0)) ) {
					((IntContext)_localctx).integer = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case REAL8:
			case REAL10:
			case REAL16:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(12);
				((RealContext)_localctx).realnum = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << REAL8) | (1L << REAL10) | (1L << REAL16))) != 0)) ) {
					((RealContext)_localctx).realnum = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case IDN:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(13); match(IDN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\23\4\2\t\2\4\3"+
		"\t\3\3\2\6\2\b\n\2\r\2\16\2\t\3\3\3\3\3\3\3\3\3\3\5\3\21\n\3\3\3\2\2\4"+
		"\2\4\2\6\3\2\3\7\3\2\b\21\3\2\22\24\3\2\25\27\25\2\7\3\2\2\2\4\20\3\2"+
		"\2\2\6\b\5\4\3\2\7\6\3\2\2\2\b\t\3\2\2\2\t\7\3\2\2\2\t\n\3\2\2\2\n\3\3"+
		"\2\2\2\13\21\t\2\2\2\f\21\t\3\2\2\r\21\t\4\2\2\16\21\t\5\2\2\17\21\7\30"+
		"\2\2\20\13\3\2\2\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2"+
		"\2\21\5\3\2\2\2\4\t\20";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}