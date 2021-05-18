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
		LT=11, ASSIGN=12, EQUAL=13, LP=14, RP=15, LBP=16, RBP=17, SEMICOLON=18, 
		INT8=19, INT10=20, INT16=21, REAL8=22, REAL10=23, REAL16=24, IDN=25, WS=26;
	public static final String[] tokenNames = {
		"<INVALID>", "'if'", "'then'", "'else'", "'while'", "'do'", "'+'", "'-'", 
		"'*'", "'/'", "'>'", "'<'", "':='", "'='", "'('", "')'", "'{'", "'}'", 
		"';'", "INT8", "INT10", "INT16", "REAL8", "REAL10", "REAL16", "IDN", "WS"
	};
	public static final int
		RULE_b = 0, RULE_p = 1, RULE_l = 2, RULE_s = 3, RULE_c = 4, RULE_e = 5, 
		RULE_t = 6, RULE_f = 7;
	public static final String[] ruleNames = {
		"b", "p", "l", "s", "c", "e", "t", "f"
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
	public static class BContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(tParser.EOF, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterB(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitB(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitB(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_b);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); p();
			setState(17); match(EOF);
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

	public static class PContext extends ParserRuleContext {
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public LContext l() {
			return getRuleContext(LContext.class,0);
		}
		public PContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PContext p() throws RecognitionException {
		PContext _localctx = new PContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_p);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); l();
			setState(21);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << LBP) | (1L << IDN))) != 0)) {
				{
				setState(20); p();
				}
			}

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

	public static class LContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(tParser.SEMICOLON, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public LContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitL(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitL(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LContext l() throws RecognitionException {
		LContext _localctx = new LContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); s();
			setState(24); match(SEMICOLON);
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

	public static class SContext extends ParserRuleContext {
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
	 
		public SContext() { }
		public void copyFrom(SContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If2Context extends SContext {
		public TerminalNode ELSE() { return getToken(tParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(tParser.IF, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode THEN() { return getToken(tParser.THEN, 0); }
		public List<SContext> s() {
			return getRuleContexts(SContext.class);
		}
		public SContext s(int i) {
			return getRuleContext(SContext.class,i);
		}
		public If2Context(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterIf2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitIf2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitIf2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If1Context extends SContext {
		public TerminalNode IF() { return getToken(tParser.IF, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public TerminalNode THEN() { return getToken(tParser.THEN, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public If1Context(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterIf1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitIf1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitIf1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends SContext {
		public TerminalNode DO() { return getToken(tParser.DO, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(tParser.WHILE, 0); }
		public WhileContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BpContext extends SContext {
		public TerminalNode LBP() { return getToken(tParser.LBP, 0); }
		public TerminalNode RBP() { return getToken(tParser.RBP, 0); }
		public PContext p() {
			return getRuleContext(PContext.class,0);
		}
		public BpContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterBp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitBp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitBp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends SContext {
		public TerminalNode IDN() { return getToken(tParser.IDN, 0); }
		public TerminalNode ASSIGN() { return getToken(tParser.ASSIGN, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public AssignContext(SContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_s);
		try {
			setState(50);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26); match(IDN);
				setState(27); match(ASSIGN);
				setState(28); e(0);
				}
				break;
			case 2:
				_localctx = new If1Context(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29); match(IF);
				setState(30); c();
				setState(31); match(THEN);
				setState(32); s();
				}
				break;
			case 3:
				_localctx = new If2Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34); match(IF);
				setState(35); c();
				setState(36); match(THEN);
				setState(37); s();
				setState(38); match(ELSE);
				setState(39); s();
				}
				break;
			case 4:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41); match(WHILE);
				setState(42); c();
				setState(43); match(DO);
				setState(44); s();
				}
				break;
			case 5:
				_localctx = new BpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46); match(LBP);
				setState(47); p();
				setState(48); match(RBP);
				}
				break;
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

	public static class CContext extends ParserRuleContext {
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	 
		public CContext() { }
		public void copyFrom(CContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends CContext {
		public TerminalNode EQUAL() { return getToken(tParser.EQUAL, 0); }
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public EqualContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RtLtContext extends CContext {
		public List<EContext> e() {
			return getRuleContexts(EContext.class);
		}
		public TerminalNode LT() { return getToken(tParser.LT, 0); }
		public TerminalNode RT() { return getToken(tParser.RT, 0); }
		public EContext e(int i) {
			return getRuleContext(EContext.class,i);
		}
		public RtLtContext(CContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterRtLt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitRtLt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitRtLt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_c);
		int _la;
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new RtLtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52); e(0);
				setState(53);
				_la = _input.LA(1);
				if ( !(_la==RT || _la==LT) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(54); e(0);
				}
				break;
			case 2:
				_localctx = new EqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(56); e(0);
				setState(57); match(EQUAL);
				setState(58); e(0);
				}
				break;
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

	public static class EContext extends ParserRuleContext {
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	 
		public EContext() { }
		public void copyFrom(EContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddSubContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode SUB() { return getToken(tParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(tParser.ADD, 0); }
		public AddSubContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleTContext extends EContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public SingleTContext(EContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterSingleT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitSingleT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitSingleT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		return e(0);
	}

	private EContext e(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EContext _localctx = new EContext(_ctx, _parentState);
		EContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_e, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleTContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(63); t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(70);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AddSubContext(new EContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_e);
					setState(65);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(66);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(67); t(0);
					}
					} 
				}
				setState(72);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class TContext extends ParserRuleContext {
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
	 
		public TContext() { }
		public void copyFrom(TContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MulDivContext extends TContext {
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode DIV() { return getToken(tParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(tParser.MUL, 0); }
		public MulDivContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleFContext extends TContext {
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public SingleFContext(TContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterSingleF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitSingleF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitSingleF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		return t(0);
	}

	private TContext t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TContext _localctx = new TContext(_ctx, _parentState);
		TContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_t, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SingleFContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(74); f();
			}
			_ctx.stop = _input.LT(-1);
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MulDivContext(new TContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_t);
					setState(76);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(77);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(78); f();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParensContext extends FContext {
		public TerminalNode RP() { return getToken(tParser.RP, 0); }
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode LP() { return getToken(tParser.LP, 0); }
		public ParensContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int10Context extends FContext {
		public TerminalNode INT10() { return getToken(tParser.INT10, 0); }
		public Int10Context(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterInt10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitInt10(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitInt10(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int8Context extends FContext {
		public TerminalNode INT8() { return getToken(tParser.INT8, 0); }
		public Int8Context(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterInt8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitInt8(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitInt8(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends FContext {
		public TerminalNode IDN() { return getToken(tParser.IDN, 0); }
		public IdContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Int16Context extends FContext {
		public TerminalNode INT16() { return getToken(tParser.INT16, 0); }
		public Int16Context(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).enterInt16(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tListener ) ((tListener)listener).exitInt16(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof tVisitor ) return ((tVisitor<? extends T>)visitor).visitInt16(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_f);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case LP:
				_localctx = new ParensContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(LP);
				setState(85); e(0);
				setState(86); match(RP);
				}
				break;
			case IDN:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88); match(IDN);
				}
				break;
			case INT8:
				_localctx = new Int8Context(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(89); match(INT8);
				}
				break;
			case INT10:
				_localctx = new Int10Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(90); match(INT10);
				}
				break;
			case INT16:
				_localctx = new Int16Context(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(91); match(INT16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return e_sempred((EContext)_localctx, predIndex);
		case 6: return t_sempred((TContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean t_sempred(TContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean e_sempred(EContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\5\3\30\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\65\n\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7G\n\7\f\7"+
		"\16\7J\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bR\n\b\f\b\16\bU\13\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t_\n\t\3\t\2\4\f\16\n\2\4\6\b\n\f\16\20\2\5\3"+
		"\2\f\r\3\2\b\t\3\2\n\13d\2\22\3\2\2\2\4\25\3\2\2\2\6\31\3\2\2\2\b\64\3"+
		"\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16K\3\2\2\2\20^\3\2\2\2\22\23\5\4\3\2\23"+
		"\24\7\2\2\3\24\3\3\2\2\2\25\27\5\6\4\2\26\30\5\4\3\2\27\26\3\2\2\2\27"+
		"\30\3\2\2\2\30\5\3\2\2\2\31\32\5\b\5\2\32\33\7\24\2\2\33\7\3\2\2\2\34"+
		"\35\7\33\2\2\35\36\7\16\2\2\36\65\5\f\7\2\37 \7\3\2\2 !\5\n\6\2!\"\7\4"+
		"\2\2\"#\5\b\5\2#\65\3\2\2\2$%\7\3\2\2%&\5\n\6\2&\'\7\4\2\2\'(\5\b\5\2"+
		"()\7\5\2\2)*\5\b\5\2*\65\3\2\2\2+,\7\6\2\2,-\5\n\6\2-.\7\7\2\2./\5\b\5"+
		"\2/\65\3\2\2\2\60\61\7\22\2\2\61\62\5\4\3\2\62\63\7\23\2\2\63\65\3\2\2"+
		"\2\64\34\3\2\2\2\64\37\3\2\2\2\64$\3\2\2\2\64+\3\2\2\2\64\60\3\2\2\2\65"+
		"\t\3\2\2\2\66\67\5\f\7\2\678\t\2\2\289\5\f\7\29?\3\2\2\2:;\5\f\7\2;<\7"+
		"\17\2\2<=\5\f\7\2=?\3\2\2\2>\66\3\2\2\2>:\3\2\2\2?\13\3\2\2\2@A\b\7\1"+
		"\2AB\5\16\b\2BH\3\2\2\2CD\f\4\2\2DE\t\3\2\2EG\5\16\b\2FC\3\2\2\2GJ\3\2"+
		"\2\2HF\3\2\2\2HI\3\2\2\2I\r\3\2\2\2JH\3\2\2\2KL\b\b\1\2LM\5\20\t\2MS\3"+
		"\2\2\2NO\f\3\2\2OP\t\4\2\2PR\5\20\t\2QN\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST"+
		"\3\2\2\2T\17\3\2\2\2US\3\2\2\2VW\7\20\2\2WX\5\f\7\2XY\7\21\2\2Y_\3\2\2"+
		"\2Z_\7\33\2\2[_\7\25\2\2\\_\7\26\2\2]_\7\27\2\2^V\3\2\2\2^Z\3\2\2\2^["+
		"\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\21\3\2\2\2\b\27\64>HS^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}