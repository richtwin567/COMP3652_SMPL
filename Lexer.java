/* The following code was generated by JFlex 1.7.0 */

/* Specification for ArithExp tokens */

// user customisations
import java_cup.runtime.*;
import lib3652.util.TokenException;

// Jlex directives
    

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Lexer.jflex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\75\1\2\1\3\1\73\1\0\1\2\1\1\22\75\1\3\1\31"+
    "\1\72\1\6\1\74\1\13\1\33\1\74\1\22\1\23\1\11\1\7"+
    "\1\20\1\10\1\65\1\12\1\67\1\64\7\5\1\66\1\15\1\21"+
    "\1\30\1\16\1\32\1\54\1\17\6\63\24\70\1\24\1\71\1\25"+
    "\1\14\1\4\1\4\1\36\1\61\1\45\1\40\1\47\1\50\1\70"+
    "\1\52\1\51\2\70\1\46\1\70\1\37\1\41\1\44\1\56\1\42"+
    "\1\53\1\43\1\60\1\57\1\70\1\62\1\70\1\55\1\26\1\34"+
    "\1\27\1\35\6\75\1\0\32\75\1\0\u15df\75\1\0\u097f\75\13\0"+
    "\35\75\2\0\5\75\1\0\57\75\1\0\u0fa0\75\1\0\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\uffff\75\ud00f\75";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\3\1\30\1\31\1\32\1\33\15\3\1\34\1\5"+
    "\2\35\1\36\1\37\1\40\1\0\1\41\1\42\3\0"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\3\3"+
    "\1\52\12\3\1\53\2\3\1\54\2\0\1\55\1\56"+
    "\1\57\1\60\1\61\5\3\1\62\2\3\1\63\1\64"+
    "\6\3\1\0\1\65\1\66\1\67\1\70\1\3\1\71"+
    "\1\72\1\73\1\74\1\75\1\3\1\76\1\3\1\0"+
    "\1\3\1\77\1\100\2\3\1\101\2\3\1\102\1\103"+
    "\1\104\1\105";

  private static int [] zzUnpackAction() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\76\0\174\0\174\0\272\0\370\0\u0136\0\272"+
    "\0\272\0\u0174\0\u01b2\0\272\0\272\0\u01f0\0\174\0\174"+
    "\0\174\0\174\0\174\0\174\0\272\0\272\0\174\0\174"+
    "\0\u022e\0\u026c\0\u02aa\0\174\0\174\0\174\0\u02e8\0\u0326"+
    "\0\u0364\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516"+
    "\0\u0554\0\u0592\0\u05d0\0\174\0\174\0\174\0\u060e\0\174"+
    "\0\u05d0\0\174\0\u064c\0\174\0\174\0\u068a\0\u06c8\0\u0706"+
    "\0\272\0\272\0\272\0\174\0\174\0\174\0\174\0\u0744"+
    "\0\u0782\0\u07c0\0\272\0\u07fe\0\u083c\0\u087a\0\u08b8\0\u08f6"+
    "\0\u0934\0\u0972\0\u09b0\0\u09ee\0\u0a2c\0\272\0\u0a6a\0\u0aa8"+
    "\0\174\0\u0ae6\0\u0b24\0\u06c8\0\u0706\0\272\0\272\0\272"+
    "\0\u0b62\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a\0\272\0\u0c98\0\u0cd6"+
    "\0\272\0\272\0\u0d14\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\u0e4a"+
    "\0\u0e88\0\u0ec6\0\272\0\u0f04\0\272\0\u0f42\0\272\0\272"+
    "\0\272\0\272\0\272\0\u0f80\0\272\0\u0fbe\0\u0ffc\0\u103a"+
    "\0\272\0\u1078\0\u10b6\0\u10f4\0\174\0\u1132\0\u1170\0\272"+
    "\0\272\0\272\0\272";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\3\2\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\5"+
    "\1\51\1\5\1\52\10\5\1\6\1\53\2\6\2\5"+
    "\1\54\1\3\2\55\1\0\2\56\1\0\16\56\2\0"+
    "\45\56\1\57\1\60\2\56\103\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\34\5\10\0\1\5\1\6\7\5"+
    "\7\0\2\5\3\0\1\5\4\0\26\5\1\6\1\61"+
    "\2\6\2\5\47\0\1\62\1\0\1\63\1\0\1\64"+
    "\1\65\7\0\1\66\1\67\1\70\17\0\6\5\1\71"+
    "\2\5\7\0\2\5\3\0\1\5\4\0\34\5\10\0"+
    "\5\5\1\72\1\73\2\5\7\0\2\5\3\0\1\5"+
    "\4\0\34\5\22\0\1\74\75\0\1\75\63\0\11\5"+
    "\1\0\1\76\5\0\2\5\3\0\1\5\4\0\34\5"+
    "\22\0\1\77\63\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\1\5\1\100\32\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\3\5\1\101\30\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\11\5\1\102\22\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\4\5"+
    "\1\103\27\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\11\5\1\104\22\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\14\5\1\105\17\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\1\106\3\5\1\107"+
    "\27\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\1\110\1\5\1\111\31\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\11\5\1\112\1\5\1\113\20\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\10\5"+
    "\1\114\7\5\1\115\13\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\12\5\1\116\21\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\13\5\1\117\6\5"+
    "\1\120\11\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\27\5\3\61\2\5\47\0\1\56\27\0\1\56"+
    "\40\0\16\121\1\0\7\121\4\0\1\121\1\122\11\0"+
    "\1\123\55\0\2\123\1\0\2\123\72\0\1\124\2\0"+
    "\1\124\13\0\1\125\55\0\2\125\1\0\2\125\12\0"+
    "\11\5\7\0\2\5\3\0\1\5\4\0\2\5\1\126"+
    "\31\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\5\5\1\127\26\5\10\0\11\5\7\0\2\5\3\0"+
    "\1\5\4\0\12\5\1\130\21\5\10\0\11\5\7\0"+
    "\2\5\3\0\1\5\4\0\1\131\33\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\11\5\1\132\22\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\13\5"+
    "\1\133\20\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\3\5\1\134\7\5\1\135\20\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\4\5\1\136\3\5"+
    "\1\137\4\5\1\140\16\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\4\5\1\141\27\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\5\5\1\142\26\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\15\5"+
    "\1\143\16\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\15\5\1\144\16\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\21\5\1\145\1\146\11\5\10\0"+
    "\11\5\7\0\2\5\3\0\1\5\4\0\17\5\1\147"+
    "\14\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\23\5\1\150\10\5\43\0\1\121\3\0\1\121\25\0"+
    "\1\121\11\0\1\151\55\0\2\151\1\0\2\151\12\0"+
    "\11\5\7\0\2\5\3\0\1\5\4\0\2\5\1\152"+
    "\31\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\1\5\1\153\32\5\10\0\11\5\7\0\2\5\3\0"+
    "\1\5\4\0\4\5\1\154\27\5\10\0\11\5\7\0"+
    "\2\5\3\0\1\5\4\0\7\5\1\155\24\5\10\0"+
    "\11\5\7\0\2\5\3\0\1\5\4\0\1\5\1\156"+
    "\32\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\10\5\1\157\23\5\10\0\11\5\7\0\2\5\3\0"+
    "\1\5\4\0\11\5\1\160\22\5\10\0\11\5\7\0"+
    "\2\5\3\0\1\5\4\0\5\5\1\161\26\5\10\0"+
    "\11\5\7\0\2\5\3\0\1\5\4\0\11\5\1\162"+
    "\22\5\10\0\11\5\7\0\2\5\3\0\1\5\4\0"+
    "\16\5\1\163\15\5\10\0\11\5\7\0\2\5\3\0"+
    "\1\5\4\0\1\164\33\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\11\5\1\165\22\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\15\5\1\166\16\5"+
    "\11\0\1\167\55\0\2\167\1\0\2\167\12\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\13\5\1\170\20\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\16\5"+
    "\1\171\15\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\5\5\1\172\26\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\10\5\1\173\23\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\5\5\1\174\26\5"+
    "\11\0\1\175\55\0\2\175\1\0\2\175\12\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\1\5\1\176\32\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\10\5"+
    "\1\177\23\5\10\0\11\5\7\0\2\5\3\0\1\5"+
    "\4\0\16\5\1\200\15\5\10\0\11\5\7\0\2\5"+
    "\3\0\1\5\4\0\4\5\1\201\27\5\10\0\11\5"+
    "\7\0\2\5\3\0\1\5\4\0\5\5\1\202\26\5"+
    "\10\0\11\5\7\0\2\5\3\0\1\5\4\0\1\5"+
    "\1\203\32\5\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4526];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\2\11\12\1\6\11\2\1\2\11\3\1\3\11"+
    "\15\1\3\11\1\1\1\11\1\1\1\11\1\0\2\11"+
    "\3\0\3\1\4\11\21\1\1\11\2\0\25\1\1\0"+
    "\15\1\1\0\5\1\1\11\6\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[131];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	StringBuffer buffer = new StringBuffer();

    public int getChar() {
	return yychar + 1;
    }

    public int getColumn() {
    	return yycolumn + 1;
    }

    public int getLine() {
	return yyline + 1;
    }

    public String getText() {
	return yytext();
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 210) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, TokenException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	return new Symbol(sym.EOF);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { //skip newline, but reset char counter
			 yychar = 0;
            } 
            // fall through
          case 70: break;
          case 2: 
            { // skip whitespace
            } 
            // fall through
          case 71: break;
          case 3: 
            { // VAR
	       return new Symbol(sym.VAR, yytext());
            } 
            // fall through
          case 72: break;
          case 4: 
            { // INTEGER
	       return new Symbol(sym.INT, 
				new Integer(yytext()));
            } 
            // fall through
          case 73: break;
          case 5: 
            { // error situation
	       String msg = String.format("Unrecognised Token: %s", yytext());
	       throw new TokenException(msg);
            } 
            // fall through
          case 74: break;
          case 6: 
            { return new Symbol(sym.PLUS);
            } 
            // fall through
          case 75: break;
          case 7: 
            { return new Symbol(sym.MINUS);
            } 
            // fall through
          case 76: break;
          case 8: 
            { return new Symbol(sym.MUL);
            } 
            // fall through
          case 77: break;
          case 9: 
            { return new Symbol(sym.DIV);
            } 
            // fall through
          case 78: break;
          case 10: 
            { return new Symbol(sym.MOD);
            } 
            // fall through
          case 79: break;
          case 11: 
            { return new Symbol(sym.POW);
            } 
            // fall through
          case 80: break;
          case 12: 
            { return new Symbol(sym.COLON);
            } 
            // fall through
          case 81: break;
          case 13: 
            { return new Symbol(sym.EQUAL,Cmp.EQ);
            } 
            // fall through
          case 82: break;
          case 14: 
            { return new Symbol(sym.AT);
            } 
            // fall through
          case 83: break;
          case 15: 
            { return new Symbol(sym.COMMA);
            } 
            // fall through
          case 84: break;
          case 16: 
            { return new Symbol(sym.SEMI);
            } 
            // fall through
          case 85: break;
          case 17: 
            { return new Symbol(sym.LPAREN);
            } 
            // fall through
          case 86: break;
          case 18: 
            { return new Symbol(sym.RPAREN);
            } 
            // fall through
          case 87: break;
          case 19: 
            { return new Symbol(sym.LBRACKET);
            } 
            // fall through
          case 88: break;
          case 20: 
            { return new Symbol(sym.RBRACKET);
            } 
            // fall through
          case 89: break;
          case 21: 
            { return new Symbol(sym.LBRACE);
            } 
            // fall through
          case 90: break;
          case 22: 
            { return new Symbol(sym.RBRACE);
            } 
            // fall through
          case 91: break;
          case 23: 
            { return new Symbol(sym.COMPARISON,Cmp.LT);
            } 
            // fall through
          case 92: break;
          case 24: 
            { return new Symbol(sym.COMPARISON,Cmp.GT);
            } 
            // fall through
          case 93: break;
          case 25: 
            { return new Symbol(sym.AMP);
            } 
            // fall through
          case 94: break;
          case 26: 
            { return new Symbol(sym.BAR);
            } 
            // fall through
          case 95: break;
          case 27: 
            { return new Symbol(sym.TILDE);
            } 
            // fall through
          case 96: break;
          case 28: 
            { buffer.setLength(0); 
				yybegin(STRING); 
				return new Symbol(sym.DQUOTE, yytext());
            } 
            // fall through
          case 97: break;
          case 29: 
            { // unsure if more should be done with this
		buffer.append(yytext());
            } 
            // fall through
          case 98: break;
          case 30: 
            { yybegin(YYINITIAL);
				return new Symbol(sym.STRING,buffer);
            } 
            // fall through
          case 99: break;
          case 31: 
            { return new Symbol(sym.FLOAT, new Double(yytext()));
            } 
            // fall through
          case 100: break;
          case 32: 
            { return new Symbol(sym.BOOLLIT, true);
            } 
            // fall through
          case 101: break;
          case 33: 
            { return new Symbol(sym.ELIST);
            } 
            // fall through
          case 102: break;
          case 34: 
            { return new Symbol(sym.BOOLLIT, false);
            } 
            // fall through
          case 103: break;
          case 35: 
            { return new Symbol(sym.BCOME);
            } 
            // fall through
          case 104: break;
          case 36: 
            { return new Symbol(sym.BCOMS);
            } 
            // fall through
          case 105: break;
          case 37: 
            { return new Symbol(sym.LCOM);
            } 
            // fall through
          case 106: break;
          case 38: 
            { return new Symbol(sym.ASSIGN);
            } 
            // fall through
          case 107: break;
          case 39: 
            { return new Symbol(sym.COMPARISON,Cmp.LE);
            } 
            // fall through
          case 108: break;
          case 40: 
            { return new Symbol(sym.COMPARISON,Cmp.NE);
            } 
            // fall through
          case 109: break;
          case 41: 
            { return new Symbol(sym.COMPARISON,Cmp.GE);
            } 
            // fall through
          case 110: break;
          case 42: 
            { return new Symbol(sym.OR);
            } 
            // fall through
          case 111: break;
          case 43: 
            { return new Symbol(sym.IF);
            } 
            // fall through
          case 112: break;
          case 44: 
            { return new Symbol(sym.CHAR, yytext().substring(2).charAt(0));
            } 
            // fall through
          case 113: break;
          case 45: 
            { return new Symbol(sym.INT, Integer.parseInt(yytext().substring(2), 2));
            } 
            // fall through
          case 114: break;
          case 46: 
            { return new Symbol(sym.INT, Integer.parseInt(yytext().substring(2), 16));
            } 
            // fall through
          case 115: break;
          case 47: 
            { return new Symbol(sym.AND);
            } 
            // fall through
          case 116: break;
          case 48: 
            { return new Symbol(sym.NOT);
            } 
            // fall through
          case 117: break;
          case 49: 
            { return new Symbol(sym.DEF);
            } 
            // fall through
          case 118: break;
          case 50: 
            { return new Symbol(sym.CAR);
            } 
            // fall through
          case 119: break;
          case 51: 
            { return new Symbol(sym.CDR);
            } 
            // fall through
          case 120: break;
          case 52: 
            { return new Symbol(sym.LET);
            } 
            // fall through
          case 121: break;
          case 53: 
            { return new Symbol(sym.READ);
            } 
            // fall through
          case 122: break;
          case 54: 
            { return new Symbol(sym.THEN);
            } 
            // fall through
          case 123: break;
          case 55: 
            { return new Symbol(sym.PAIR);
            } 
            // fall through
          case 124: break;
          case 56: 
            { return new Symbol(sym.PROC);
            } 
            // fall through
          case 125: break;
          case 57: 
            { return new Symbol(sym.CALL);
            } 
            // fall through
          case 126: break;
          case 58: 
            { return new Symbol(sym.CASE);
            } 
            // fall through
          case 127: break;
          case 59: 
            { return new Symbol(sym.LIST);
            } 
            // fall through
          case 128: break;
          case 60: 
            { return new Symbol(sym.ELSE);
            } 
            // fall through
          case 129: break;
          case 61: 
            { return new Symbol(sym.ISEQV);
            } 
            // fall through
          case 130: break;
          case 62: 
            { return new Symbol(sym.SIZE);
            } 
            // fall through
          case 131: break;
          case 63: 
            { return new Symbol(sym.ISPAIR);
            } 
            // fall through
          case 132: break;
          case 64: 
            { return new Symbol(sym.PRINT);
            } 
            // fall through
          case 133: break;
          case 65: 
            { return new Symbol(sym.CHAR, Character.toChars(Integer.parseInt(yytext().substring(2))));
            } 
            // fall through
          case 134: break;
          case 66: 
            { return new Symbol(sym.ISEQ);
            } 
            // fall through
          case 135: break;
          case 67: 
            { return new Symbol(sym.SUBSTR);
            } 
            // fall through
          case 136: break;
          case 68: 
            { return new Symbol(sym.READINT);
            } 
            // fall through
          case 137: break;
          case 69: 
            { return new Symbol(sym.PRINTLN);
            } 
            // fall through
          case 138: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
