// Generated from c:\SCHOOL\COMPUTER SCIENCE\3rd Year\2nd Semester\PROGLANG CS322\Activities\Group9-Interpreter\Interpreter\Interpreter\Grammar\CodeGrammar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CodeGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGIN=2, BEGINIF=3, END=4, ENDIF=5, DISPLAY=6, SCAN=7, AND=8, 
		ASSIGN=9, DIV=10, PLUS=11, MOD=12, MULT=13, MINUS=14, NEQ=15, NOT=16, 
		OR=17, GT=18, GTE=19, LT=20, LTE=21, EQ=22, POWER=23, DOUBLEQ=24, SINGLEQ=25, 
		DOLLAR=26, AMPERSAND=27, HASH=28, COMMA=29, RBRACK=30, RPAREN=31, LBRACK=32, 
		LPAREN=33, COLON=34, BOOL=35, CHAR=36, INT=37, FLOAT=38, STRING=39, ELSE=40, 
		IF=41, FALSE=42, TRUE=43, WHITESPACE=44, COMMENT=45, NEWLINE=46, INTEGER=47, 
		FLOATING=48, STRINGS=49, CHARA=50, BOOLEAN=51, IDENTIFIER=52, INT_LITERAL=53, 
		CHAR_LITERAL=54, ID=55;
	public static final int
		RULE_code = 0, RULE_statement = 1, RULE_data_type = 2, RULE_declaration = 3, 
		RULE_declaration_statement = 4, RULE_assignment_statement = 5, RULE_scan_statement = 6, 
		RULE_expression = 7, RULE_multOp = 8, RULE_addOp = 9, RULE_compareOp = 10, 
		RULE_boolOp = 11, RULE_exponentOp = 12, RULE_literal = 13, RULE_unary_operator = 14, 
		RULE_display_statement = 15, RULE_symbol = 16, RULE_if_statement = 17, 
		RULE_if_block = 18, RULE_ifelse_block = 19, RULE_block = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"code", "statement", "data_type", "declaration", "declaration_statement", 
			"assignment_statement", "scan_statement", "expression", "multOp", "addOp", 
			"compareOp", "boolOp", "exponentOp", "literal", "unary_operator", "display_statement", 
			"symbol", "if_statement", "if_block", "ifelse_block", "block"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'update me later hehe'", "'BEGIN CODE'", "'BEGIN IF'", "'END CODE'", 
			"'END IF'", "'DISPLAY'", "'SCAN'", "'AND'", "'='", "'/'", "'+'", "'%'", 
			"'*'", "'-'", "'<>'", "'NOT'", "'OR'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'**'", "'"'", "'''", "'$'", "'&'", "'#'", "','", "']'", "')'", 
			"'['", "'('", "':'", "'BOOL'", "'CHAR'", "'INT'", "'FLOAT'", "'STRING'", 
			"'ELSE'", "'IF'", "'FALSE'", "'TRUE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "BEGIN", "BEGINIF", "END", "ENDIF", "DISPLAY", "SCAN", "AND", 
			"ASSIGN", "DIV", "PLUS", "MOD", "MULT", "MINUS", "NEQ", "NOT", "OR", 
			"GT", "GTE", "LT", "LTE", "EQ", "POWER", "DOUBLEQ", "SINGLEQ", "DOLLAR", 
			"AMPERSAND", "HASH", "COMMA", "RBRACK", "RPAREN", "LBRACK", "LPAREN", 
			"COLON", "BOOL", "CHAR", "INT", "FLOAT", "STRING", "ELSE", "IF", "FALSE", 
			"TRUE", "WHITESPACE", "COMMENT", "NEWLINE", "INTEGER", "FLOATING", "STRINGS", 
			"CHARA", "BOOLEAN", "IDENTIFIER", "INT_LITERAL", "CHAR_LITERAL", "ID"
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
	public String getGrammarFileName() { return "CodeGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CodeGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CodeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CodeGrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CodeGrammarParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CodeGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CodeGrammarParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_code);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(42);
				match(NEWLINE);
				}
			}

			setState(45);
			match(BEGIN);
			setState(47);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(46);
				match(NEWLINE);
				}
				break;
			}
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << SCAN) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(49);
				statement();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(55);
				match(NEWLINE);
				}
			}

			setState(58);
			match(END);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(59);
				match(NEWLINE);
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

	public static class StatementContext extends ParserRuleContext {
		public Declaration_statementContext declaration_statement() {
			return getRuleContext(Declaration_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public Display_statementContext display_statement() {
			return getRuleContext(Display_statementContext.class,0);
		}
		public Scan_statementContext scan_statement() {
			return getRuleContext(Scan_statementContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode COMMENT() { return getToken(CodeGrammarParser.COMMENT, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOL:
			case CHAR:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				declaration_statement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				assignment_statement();
				}
				break;
			case DISPLAY:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				display_statement();
				}
				break;
			case SCAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				scan_statement();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				if_block();
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				match(COMMENT);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CodeGrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(CodeGrammarParser.CHAR, 0); }
		public TerminalNode BOOL() { return getToken(CodeGrammarParser.BOOL, 0); }
		public TerminalNode FLOAT() { return getToken(CodeGrammarParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(CodeGrammarParser.STRING, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeGrammarParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CodeGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CodeGrammarParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(IDENTIFIER);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(73);
						match(ASSIGN);
						setState(74);
						match(IDENTIFIER);
						}
						} 
					}
					setState(79);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(80);
				match(ASSIGN);
				setState(81);
				expression(0);
				}
				}
			}

			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(84);
				match(COMMA);
				setState(85);
				match(IDENTIFIER);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(86);
					match(ASSIGN);
					setState(87);
					expression(0);
					}
				}

				}
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Declaration_statementContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Declaration_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration_statement; }
	}

	public final Declaration_statementContext declaration_statement() throws RecognitionException {
		Declaration_statementContext _localctx = new Declaration_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			data_type();
			setState(96);
			declaration();
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(97);
				match(NEWLINE);
				}
				break;
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

	public static class Assignment_statementContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CodeGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CodeGrammarParser.ASSIGN, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(100);
					match(IDENTIFIER);
					setState(101);
					match(ASSIGN);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(104); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(106);
				expression(0);
				}
				break;
			}
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(109);
				match(NEWLINE);
				}
				break;
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

	public static class Scan_statementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(CodeGrammarParser.SCAN, 0); }
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(CodeGrammarParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CodeGrammarParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CodeGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CodeGrammarParser.COMMA, i);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Scan_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan_statement; }
	}

	public final Scan_statementContext scan_statement() throws RecognitionException {
		Scan_statementContext _localctx = new Scan_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_scan_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(SCAN);
			setState(113);
			match(COLON);
			setState(114);
			match(IDENTIFIER);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(115);
				match(COMMA);
				setState(116);
				match(IDENTIFIER);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(122);
				match(NEWLINE);
				}
				break;
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecialCharExpressionContext extends ExpressionContext {
		public TerminalNode LBRACK() { return getToken(CodeGrammarParser.LBRACK, 0); }
		public SymbolContext symbol() {
			return getRuleContext(SymbolContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CodeGrammarParser.RBRACK, 0); }
		public SpecialCharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExponentExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExponentOpContext exponentOp() {
			return getRuleContext(ExponentOpContext.class,0);
		}
		public ExponentExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AdditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(CodeGrammarParser.IDENTIFIER, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultiplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ComparisonExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CompareOpContext compareOp() {
			return getRuleContext(CompareOpContext.class,0);
		}
		public ComparisonExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizeExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public ParenthesizeExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BracketExpressionContext extends ExpressionContext {
		public List<TerminalNode> RBRACK() { return getTokens(CodeGrammarParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CodeGrammarParser.RBRACK, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BooleanExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BoolOpContext boolOp() {
			return getRuleContext(BoolOpContext.class,0);
		}
		public BooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ConcatExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AMPERSAND() { return getToken(CodeGrammarParser.AMPERSAND, 0); }
		public ConcatExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NewlineExpressionContext extends ExpressionContext {
		public TerminalNode DOLLAR() { return getToken(CodeGrammarParser.DOLLAR, 0); }
		public NewlineExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryExpressionContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOATING:
			case STRINGS:
			case CHARA:
			case BOOLEAN:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126);
				literal();
				}
				break;
			case DOLLAR:
				{
				_localctx = new NewlineExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				match(DOLLAR);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(IDENTIFIER);
				}
				break;
			case LBRACK:
				{
				_localctx = new SpecialCharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(LBRACK);
				setState(130);
				symbol();
				setState(131);
				match(RBRACK);
				}
				break;
			case PLUS:
			case MINUS:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				unary_operator();
				setState(134);
				expression(8);
				}
				break;
			case RBRACK:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(RBRACK);
				setState(137);
				expression(0);
				setState(138);
				match(RBRACK);
				}
				break;
			case LPAREN:
				{
				_localctx = new ParenthesizeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140);
				match(LPAREN);
				setState(141);
				expression(0);
				setState(142);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ConcatExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(146);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(147);
						match(AMPERSAND);
						setState(148);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExponentExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(149);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(150);
						exponentOp();
						setState(151);
						expression(6);
						}
						break;
					case 3:
						{
						_localctx = new MultiplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(154);
						multOp();
						setState(155);
						expression(5);
						}
						break;
					case 4:
						{
						_localctx = new AdditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(157);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(158);
						addOp();
						setState(159);
						expression(4);
						}
						break;
					case 5:
						{
						_localctx = new ComparisonExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(162);
						compareOp();
						setState(163);
						expression(3);
						}
						break;
					case 6:
						{
						_localctx = new BooleanExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(166);
						boolOp();
						setState(167);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class MultOpContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(CodeGrammarParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CodeGrammarParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CodeGrammarParser.MOD, 0); }
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MOD) | (1L << MULT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CompareOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CodeGrammarParser.LT, 0); }
		public TerminalNode GT() { return getToken(CodeGrammarParser.GT, 0); }
		public TerminalNode LTE() { return getToken(CodeGrammarParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(CodeGrammarParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(CodeGrammarParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CodeGrammarParser.NEQ, 0); }
		public CompareOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareOp; }
	}

	public final CompareOpContext compareOp() throws RecognitionException {
		CompareOpContext _localctx = new CompareOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compareOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEQ) | (1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(CodeGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(CodeGrammarParser.OR, 0); }
		public TerminalNode NOT() { return getToken(CodeGrammarParser.NOT, 0); }
		public BoolOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOp; }
	}

	public final BoolOpContext boolOp() throws RecognitionException {
		BoolOpContext _localctx = new BoolOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << NOT) | (1L << OR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExponentOpContext extends ParserRuleContext {
		public TerminalNode POWER() { return getToken(CodeGrammarParser.POWER, 0); }
		public ExponentOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponentOp; }
	}

	public final ExponentOpContext exponentOp() throws RecognitionException {
		ExponentOpContext _localctx = new ExponentOpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exponentOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(POWER);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CodeGrammarParser.INTEGER, 0); }
		public TerminalNode FLOATING() { return getToken(CodeGrammarParser.FLOATING, 0); }
		public TerminalNode STRINGS() { return getToken(CodeGrammarParser.STRINGS, 0); }
		public TerminalNode BOOLEAN() { return getToken(CodeGrammarParser.BOOLEAN, 0); }
		public TerminalNode CHARA() { return getToken(CodeGrammarParser.CHARA, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << FLOATING) | (1L << STRINGS) | (1L << CHARA) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Display_statementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CodeGrammarParser.DISPLAY, 0); }
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CodeGrammarParser.NEWLINE, 0); }
		public Display_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display_statement; }
	}

	public final Display_statementContext display_statement() throws RecognitionException {
		Display_statementContext _localctx = new Display_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_display_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(DISPLAY);
			setState(189);
			match(COLON);
			setState(190);
			expression(0);
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(191);
				match(NEWLINE);
				}
				break;
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

	public static class SymbolContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CodeGrammarParser.COMMA, 0); }
		public TerminalNode COLON() { return getToken(CodeGrammarParser.COLON, 0); }
		public TerminalNode AMPERSAND() { return getToken(CodeGrammarParser.AMPERSAND, 0); }
		public TerminalNode ASSIGN() { return getToken(CodeGrammarParser.ASSIGN, 0); }
		public TerminalNode DIV() { return getToken(CodeGrammarParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(CodeGrammarParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(CodeGrammarParser.MOD, 0); }
		public TerminalNode MULT() { return getToken(CodeGrammarParser.MULT, 0); }
		public TerminalNode MINUS() { return getToken(CodeGrammarParser.MINUS, 0); }
		public TerminalNode GT() { return getToken(CodeGrammarParser.GT, 0); }
		public TerminalNode LT() { return getToken(CodeGrammarParser.LT, 0); }
		public TerminalNode DOUBLEQ() { return getToken(CodeGrammarParser.DOUBLEQ, 0); }
		public TerminalNode SINGLEQ() { return getToken(CodeGrammarParser.SINGLEQ, 0); }
		public TerminalNode DOLLAR() { return getToken(CodeGrammarParser.DOLLAR, 0); }
		public TerminalNode HASH() { return getToken(CodeGrammarParser.HASH, 0); }
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << DIV) | (1L << PLUS) | (1L << MOD) | (1L << MULT) | (1L << MINUS) | (1L << GT) | (1L << LT) | (1L << DOUBLEQ) | (1L << SINGLEQ) | (1L << DOLLAR) | (1L << AMPERSAND) | (1L << HASH) | (1L << COMMA) | (1L << RPAREN) | (1L << LPAREN) | (1L << COLON))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CodeGrammarParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CodeGrammarParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CodeGrammarParser.RPAREN, 0); }
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CodeGrammarParser.ELSE, 0); }
		public Ifelse_blockContext ifelse_block() {
			return getRuleContext(Ifelse_blockContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IF);
			setState(197);
			match(LPAREN);
			setState(198);
			expression(0);
			setState(199);
			match(RPAREN);
			setState(200);
			if_block();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(201);
				match(ELSE);
				setState(202);
				ifelse_block();
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode BEGINIF() { return getToken(CodeGrammarParser.BEGINIF, 0); }
		public TerminalNode ENDIF() { return getToken(CodeGrammarParser.ENDIF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(BEGINIF);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGINIF) | (1L << DISPLAY) | (1L << SCAN) | (1L << BOOL) | (1L << CHAR) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << COMMENT) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(206);
				statement();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			match(ENDIF);
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

	public static class Ifelse_blockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Ifelse_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifelse_block; }
	}

	public final Ifelse_blockContext ifelse_block() throws RecognitionException {
		Ifelse_blockContext _localctx = new Ifelse_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ifelse_block);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				block();
				}
				break;
			case BEGINIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				if_block();
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

	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__0);
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
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\5\2.\n\2\3\2\3\2\5\2\62\n"+
		"\2\3\2\7\2\65\n\2\f\2\16\28\13\2\3\2\5\2;\n\2\3\2\3\2\5\2?\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3G\n\3\3\4\3\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\5\3\5\5\5U\n\5\3\5\3\5\3\5\3\5\5\5[\n\5\7\5]\n\5\f\5\16\5`\13\5\3\6"+
		"\3\6\3\6\5\6e\n\6\3\7\3\7\6\7i\n\7\r\7\16\7j\3\7\5\7n\n\7\3\7\5\7q\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\7\bx\n\b\f\b\16\b{\13\b\3\b\5\b~\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0093"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ac\n\t\f\t\16\t\u00af\13\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\5\21\u00c3\n\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00ce\n\23\3\24\3\24\7\24\u00d2\n\24\f\24\16\24\u00d5\13\24\3\24\3\24"+
		"\3\25\3\25\5\25\u00db\n\25\3\26\3\26\3\26\2\3\20\27\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*\2\t\3\2%)\4\2\f\f\16\17\4\2\r\r\20\20\4\2"+
		"\21\21\24\30\4\2\n\n\22\23\3\2\61\65\b\2\13\20\24\24\26\26\32\37!!#$\2"+
		"\u00ed\2-\3\2\2\2\4F\3\2\2\2\6H\3\2\2\2\bJ\3\2\2\2\na\3\2\2\2\fh\3\2\2"+
		"\2\16r\3\2\2\2\20\u0092\3\2\2\2\22\u00b0\3\2\2\2\24\u00b2\3\2\2\2\26\u00b4"+
		"\3\2\2\2\30\u00b6\3\2\2\2\32\u00b8\3\2\2\2\34\u00ba\3\2\2\2\36\u00bc\3"+
		"\2\2\2 \u00be\3\2\2\2\"\u00c4\3\2\2\2$\u00c6\3\2\2\2&\u00cf\3\2\2\2(\u00da"+
		"\3\2\2\2*\u00dc\3\2\2\2,.\7\60\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\61\7"+
		"\4\2\2\60\62\7\60\2\2\61\60\3\2\2\2\61\62\3\2\2\2\62\66\3\2\2\2\63\65"+
		"\5\4\3\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3\2"+
		"\2\28\66\3\2\2\29;\7\60\2\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<>\7\6\2\2=?"+
		"\7\60\2\2>=\3\2\2\2>?\3\2\2\2?\3\3\2\2\2@G\5\n\6\2AG\5\f\7\2BG\5 \21\2"+
		"CG\5\16\b\2DG\5&\24\2EG\7/\2\2F@\3\2\2\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2"+
		"FD\3\2\2\2FE\3\2\2\2G\5\3\2\2\2HI\t\2\2\2I\7\3\2\2\2JT\7\66\2\2KL\7\13"+
		"\2\2LN\7\66\2\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3"+
		"\2\2\2RS\7\13\2\2SU\5\20\t\2TO\3\2\2\2TU\3\2\2\2U^\3\2\2\2VW\7\37\2\2"+
		"WZ\7\66\2\2XY\7\13\2\2Y[\5\20\t\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\V\3\2"+
		"\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\t\3\2\2\2`^\3\2\2\2ab\5\6\4\2bd\5"+
		"\b\5\2ce\7\60\2\2dc\3\2\2\2de\3\2\2\2e\13\3\2\2\2fg\7\66\2\2gi\7\13\2"+
		"\2hf\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2ln\5\20\t\2ml\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2oq\7\60\2\2po\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rs\7"+
		"\t\2\2st\7$\2\2ty\7\66\2\2uv\7\37\2\2vx\7\66\2\2wu\3\2\2\2x{\3\2\2\2y"+
		"w\3\2\2\2yz\3\2\2\2z}\3\2\2\2{y\3\2\2\2|~\7\60\2\2}|\3\2\2\2}~\3\2\2\2"+
		"~\17\3\2\2\2\177\u0080\b\t\1\2\u0080\u0093\5\34\17\2\u0081\u0093\7\34"+
		"\2\2\u0082\u0093\7\66\2\2\u0083\u0084\7\"\2\2\u0084\u0085\5\"\22\2\u0085"+
		"\u0086\7 \2\2\u0086\u0093\3\2\2\2\u0087\u0088\5\36\20\2\u0088\u0089\5"+
		"\20\t\n\u0089\u0093\3\2\2\2\u008a\u008b\7 \2\2\u008b\u008c\5\20\t\2\u008c"+
		"\u008d\7 \2\2\u008d\u0093\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\5\20"+
		"\t\2\u0090\u0091\7!\2\2\u0091\u0093\3\2\2\2\u0092\177\3\2\2\2\u0092\u0081"+
		"\3\2\2\2\u0092\u0082\3\2\2\2\u0092\u0083\3\2\2\2\u0092\u0087\3\2\2\2\u0092"+
		"\u008a\3\2\2\2\u0092\u008e\3\2\2\2\u0093\u00ad\3\2\2\2\u0094\u0095\f\f"+
		"\2\2\u0095\u0096\7\35\2\2\u0096\u00ac\5\20\t\r\u0097\u0098\f\7\2\2\u0098"+
		"\u0099\5\32\16\2\u0099\u009a\5\20\t\b\u009a\u00ac\3\2\2\2\u009b\u009c"+
		"\f\6\2\2\u009c\u009d\5\22\n\2\u009d\u009e\5\20\t\7\u009e\u00ac\3\2\2\2"+
		"\u009f\u00a0\f\5\2\2\u00a0\u00a1\5\24\13\2\u00a1\u00a2\5\20\t\6\u00a2"+
		"\u00ac\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\5\26\f\2\u00a5\u00a6\5"+
		"\20\t\5\u00a6\u00ac\3\2\2\2\u00a7\u00a8\f\3\2\2\u00a8\u00a9\5\30\r\2\u00a9"+
		"\u00aa\5\20\t\4\u00aa\u00ac\3\2\2\2\u00ab\u0094\3\2\2\2\u00ab\u0097\3"+
		"\2\2\2\u00ab\u009b\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a3\3\2\2\2\u00ab"+
		"\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\21\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\t\3\2\2\u00b1\23"+
		"\3\2\2\2\u00b2\u00b3\t\4\2\2\u00b3\25\3\2\2\2\u00b4\u00b5\t\5\2\2\u00b5"+
		"\27\3\2\2\2\u00b6\u00b7\t\6\2\2\u00b7\31\3\2\2\2\u00b8\u00b9\7\31\2\2"+
		"\u00b9\33\3\2\2\2\u00ba\u00bb\t\7\2\2\u00bb\35\3\2\2\2\u00bc\u00bd\t\4"+
		"\2\2\u00bd\37\3\2\2\2\u00be\u00bf\7\b\2\2\u00bf\u00c0\7$\2\2\u00c0\u00c2"+
		"\5\20\t\2\u00c1\u00c3\7\60\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3\2\2\2"+
		"\u00c3!\3\2\2\2\u00c4\u00c5\t\b\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7+\2\2"+
		"\u00c7\u00c8\7#\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7!\2\2\u00ca\u00cd"+
		"\5&\24\2\u00cb\u00cc\7*\2\2\u00cc\u00ce\5(\25\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce%\3\2\2\2\u00cf\u00d3\7\5\2\2\u00d0\u00d2\5\4\3\2"+
		"\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\u00d7\7\7\2\2\u00d7"+
		"\'\3\2\2\2\u00d8\u00db\5*\26\2\u00d9\u00db\5&\24\2\u00da\u00d8\3\2\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db)\3\2\2\2\u00dc\u00dd\7\3\2\2\u00dd+\3\2\2\2"+
		"\31-\61\66:>FOTZ^djmpy}\u0092\u00ab\u00ad\u00c2\u00cd\u00d3\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}