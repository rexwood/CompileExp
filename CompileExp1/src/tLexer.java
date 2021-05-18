// Generated from t.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, WHILE=4, DO=5, ADD=6, SUB=7, MUL=8, DIV=9, RT=10, 
		LT=11, ASSIGN=12, LP=13, RP=14, SEMICOLON=15, INT8=16, INT10=17, INT16=18, 
		REAL8=19, REAL10=20, REAL16=21, IDN=22, WS=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'"
	};
	public static final String[] ruleNames = {
		"IF", "THEN", "ELSE", "WHILE", "DO", "ADD", "SUB", "MUL", "DIV", "RT", 
		"LT", "ASSIGN", "LP", "RP", "SEMICOLON", "INT8", "INT10", "INT16", "REAL8", 
		"REAL10", "REAL16", "IDN", "WS", "DIGIT", "LETTER"
	};


	public tLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "t.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00d5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21"+
		"c\n\21\f\21\16\21f\13\21\3\22\3\22\3\22\7\22k\n\22\f\22\16\22n\13\22\5"+
		"\22p\n\22\3\23\3\23\3\23\3\23\7\23v\n\23\f\23\16\23y\13\23\3\24\3\24\3"+
		"\24\7\24~\n\24\f\24\16\24\u0081\13\24\3\24\3\24\3\24\7\24\u0086\n\24\f"+
		"\24\16\24\u0089\13\24\3\25\3\25\3\25\7\25\u008e\n\25\f\25\16\25\u0091"+
		"\13\25\5\25\u0093\n\25\3\25\3\25\3\25\7\25\u0098\n\25\f\25\16\25\u009b"+
		"\13\25\3\26\3\26\3\26\3\26\7\26\u00a1\n\26\f\26\16\26\u00a4\13\26\3\26"+
		"\3\26\3\26\7\26\u00a9\n\26\f\26\16\26\u00ac\13\26\3\27\3\27\3\27\7\27"+
		"\u00b1\n\27\f\27\16\27\u00b4\13\27\3\27\3\27\7\27\u00b8\n\27\f\27\16\27"+
		"\u00bb\13\27\3\27\3\27\3\27\5\27\u00c0\n\27\3\27\3\27\7\27\u00c4\n\27"+
		"\f\27\16\27\u00c7\13\27\5\27\u00c9\n\27\3\30\6\30\u00cc\n\30\r\30\16\30"+
		"\u00cd\3\30\3\30\3\31\3\31\3\32\3\32\2\2\33\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\2\63\2\3\2\n\3\2\629\3\2\63;\3\2\62;\4\2ZZzz\4\2\62;ch"+
		"\4\2\60\60aa\5\2\13\f\17\17\"\"\4\2C\\c|\u00e6\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\65\3\2\2\2\58\3\2\2"+
		"\2\7=\3\2\2\2\tB\3\2\2\2\13H\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2"+
		"\2\23Q\3\2\2\2\25S\3\2\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35[\3\2"+
		"\2\2\37]\3\2\2\2!_\3\2\2\2#o\3\2\2\2%q\3\2\2\2\'z\3\2\2\2)\u0092\3\2\2"+
		"\2+\u009c\3\2\2\2-\u00ad\3\2\2\2/\u00cb\3\2\2\2\61\u00d1\3\2\2\2\63\u00d3"+
		"\3\2\2\2\65\66\7k\2\2\66\67\7h\2\2\67\4\3\2\2\289\7v\2\29:\7j\2\2:;\7"+
		"g\2\2;<\7p\2\2<\6\3\2\2\2=>\7g\2\2>?\7n\2\2?@\7u\2\2@A\7g\2\2A\b\3\2\2"+
		"\2BC\7y\2\2CD\7j\2\2DE\7k\2\2EF\7n\2\2FG\7g\2\2G\n\3\2\2\2HI\7f\2\2IJ"+
		"\7q\2\2J\f\3\2\2\2KL\7-\2\2L\16\3\2\2\2MN\7/\2\2N\20\3\2\2\2OP\7,\2\2"+
		"P\22\3\2\2\2QR\7\61\2\2R\24\3\2\2\2ST\7@\2\2T\26\3\2\2\2UV\7>\2\2V\30"+
		"\3\2\2\2WX\7?\2\2X\32\3\2\2\2YZ\7*\2\2Z\34\3\2\2\2[\\\7+\2\2\\\36\3\2"+
		"\2\2]^\7=\2\2^ \3\2\2\2_`\7\62\2\2`d\t\2\2\2ac\t\2\2\2ba\3\2\2\2cf\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\"\3\2\2\2fd\3\2\2\2gp\7\62\2\2hl\t\3\2\2ik\t"+
		"\4\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mp\3\2\2\2nl\3\2\2\2og\3"+
		"\2\2\2oh\3\2\2\2p$\3\2\2\2qr\7\62\2\2rs\t\5\2\2sw\t\6\2\2tv\t\6\2\2ut"+
		"\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x&\3\2\2\2yw\3\2\2\2z{\7\62\2\2"+
		"{\177\t\2\2\2|~\t\2\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\7\60\2\2\u0083"+
		"\u0087\t\2\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088(\3\2\2\2\u0089\u0087"+
		"\3\2\2\2\u008a\u0093\7\62\2\2\u008b\u008f\t\3\2\2\u008c\u008e\t\4\2\2"+
		"\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u008a\3\2\2\2\u0092"+
		"\u008b\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\7\60\2\2\u0095\u0099\5"+
		"\61\31\2\u0096\u0098\5\61\31\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2"+
		"\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a*\3\2\2\2\u009b\u0099\3"+
		"\2\2\2\u009c\u009d\7\62\2\2\u009d\u009e\t\5\2\2\u009e\u00a2\t\6\2\2\u009f"+
		"\u00a1\t\6\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7\60\2\2\u00a6\u00aa\t\6\2\2\u00a7\u00a9\t\6\2\2\u00a8\u00a7\3"+
		"\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		",\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00c8\5\63\32\2\u00ae\u00b1\5\63\32"+
		"\2\u00af\u00b1\5\61\31\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00c9\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b8\5\63\32\2\u00b6\u00b8\5\61\31\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bf\t\7\2\2\u00bd\u00c0\5\63\32\2\u00be\u00c0\5\61\31\2\u00bf\u00bd"+
		"\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c5\3\2\2\2\u00c1\u00c4\5\63\32\2"+
		"\u00c2\u00c4\5\61\31\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00b2\3\2\2\2\u00c8\u00b9\3\2\2\2\u00c9.\3\2\2\2"+
		"\u00ca\u00cc\t\b\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\b\30\2\2"+
		"\u00d0\60\3\2\2\2\u00d1\u00d2\t\4\2\2\u00d2\62\3\2\2\2\u00d3\u00d4\t\t"+
		"\2\2\u00d4\64\3\2\2\2\27\2dlow\177\u0087\u008f\u0092\u0099\u00a2\u00aa"+
		"\u00b0\u00b2\u00b7\u00b9\u00bf\u00c3\u00c5\u00c8\u00cd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}