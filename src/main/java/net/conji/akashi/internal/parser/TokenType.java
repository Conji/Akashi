package net.conji.akashi.internal.parser;

import static net.conji.akashi.internal.parser.TokenKind.BINARY;
import static net.conji.akashi.internal.parser.TokenKind.BRACKET;
import static net.conji.akashi.internal.parser.TokenKind.IR;
import static net.conji.akashi.internal.parser.TokenKind.KEYWORD;
import static net.conji.akashi.internal.parser.TokenKind.LITERAL;
import static net.conji.akashi.internal.parser.TokenKind.SPECIAL;
import static net.conji.akashi.internal.parser.TokenKind.UNARY;

@SuppressWarnings("javadoc")
public enum TokenType {

    ERROR           (SPECIAL, null),
    EOF             (SPECIAL, null),
    EOL             (SPECIAL, null),
    COMMENT         (SPECIAL, null),

    NOT             (UNARY, "!", 14, false),
    NE              (BINARY, "!=", 9, true),
    NE_STRICT       (BINARY, "!==", 9, true),
    MOD             (BINARY, "%", 13, true),
    ASSIGN_MOD      (BINARY, "%=", 2, false),
    BIT_AND         (BINARY, "&", 8, true),
    AND             (BINARY, "&&", 5, true),
    ASSIGN_BIT_AND  (BINARY, "&=", 2, false),
    LPAREN          (BRACKET, "(", 16, true),
    RPAREN          (BRACKET, ")", 0, true),
    MUL             (BINARY, "*", 13, true),
    ASSIGN_MUL      (BINARY, "*=", 2, false),
    ADD             (BINARY, "+", 12, true),
    INCPREFIX       (UNARY, "++", 15, true),
    ASSIGN_ADD      (BINARY, "+=", 2, false),
    COMMARIGHT     (BINARY,  ",",     1, true),
    SUB            (BINARY,  "-",    12, true),
    DECPREFIX      (UNARY,   "--",   15, true),
    ASSIGN_SUB     (BINARY,  "-=",    2, false),
    PERIOD         (BRACKET, ".",    17, true),
    DIV            (BINARY,  "/",    13, true),
    ASSIGN_DIV     (BINARY,  "/=",    2, false),
    COLON          (BINARY,  ":"),
    SEMICOLON      (BINARY,  ";"),
    LT             (BINARY,  "<",    10, true),
    SHL            (BINARY,  "<<",   11, true),
    ASSIGN_SHL     (BINARY,  "<<=",   2, false),
    LE             (BINARY,  "<=",   10, true),
    ASSIGN         (BINARY,  "=",     2, false),
    EQ             (BINARY,  "==",    9, true),
    EQ_STRICT      (BINARY,  "===",   9, true),
    BIND           (BINARY,  "=>",    9, true),
    GT             (BINARY,  ">",    10, true),
    GE             (BINARY,  ">=",   10, true),
    SAR            (BINARY,  ">>",   11, true),
    ASSIGN_SAR     (BINARY,  ">>=",   2, false),
    SHR            (BINARY,  ">>>",  11, true),
    ASSIGN_SHR     (BINARY,  ">>>=",  2, false),
    TERNARY        (BINARY,  "?",     3, false),
    LBRACKET       (BRACKET, "[",    17, true),
    RBRACKET       (BRACKET, "]",     0, true),
    BIT_XOR        (BINARY,  "^",     7, true),
    ASSIGN_BIT_XOR (BINARY,  "^=",    2, false),
    LBRACE         (BRACKET,  "{"),
    BIT_OR         (BINARY,  "|",     6, true),
    ASSIGN_BIT_OR  (BINARY,  "|=",    2, false),
    OR             (BINARY,  "||",    4, true),
    RBRACE         (BRACKET, "}"),
    BIT_NOT        (UNARY,   "~",     14, false),

    ABSTRACT       (KEYWORD,   "abstract"),
//  BOOLEAN        (FUTURE,   "boolean"),
    BREAK          (KEYWORD,  "break"),
//  BYTE           (FUTURE,   "byte"),
    CASE           (KEYWORD,  "case"),
    CATCH          (KEYWORD,  "catch"),
//  CHAR           (FUTURE,   "char"),
    CLASS          (KEYWORD,   "class"),
    CONST          (KEYWORD,  "const"),
    CONTINUE       (KEYWORD,  "continue"),
    DEBUGGER       (KEYWORD,  "debugger"),
    DEFAULT        (KEYWORD,  "default"),
    DELETE         (UNARY,    "delete",     14, false),
    DO             (KEYWORD,  "do"),
//  DOUBLE         (FUTURE,   "double"),
//  EACH           (KEYWORD,  "each"),  // Contextual.
    ELSE           (KEYWORD,  "else"),
    ENUM           (KEYWORD,   "enum"),
    EXPORT         (KEYWORD,   "export"),
    EXTENDS        (KEYWORD,   "extends"),
    FALSE          (LITERAL,  "false"),
//  FINAL          (FUTURE,   "final"),
    FINALLY        (KEYWORD,  "finally"),
//  FLOAT          (FUTURE,   "float"),
    FOR            (KEYWORD,  "for"),
    FUNCTION       (KEYWORD,  "function"),
//  GET            (KEYWORD,  "get"), // Contextual.
//  GOTO           (FUTURE,   "goto"),
    IF             (KEYWORD,   "if"),
    IMPLEMENTS     (KEYWORD,   "implements"),
    IMPORT         (KEYWORD,   "import"),
    IN             (BINARY,   "in",         10, true),
    INSTANCEOF     (BINARY,   "instanceof", 10, true),
//  INT            (FUTURE,   "int"),
    INTERFACE      (KEYWORD,   "interface"),
    LET            (KEYWORD,   "let"),
//  LONG           (FUTURE,   "long"),
//  NATIVE         (FUTURE,   "native"),
    NEW            (UNARY,    "new",        17, false),
    NULL           (LITERAL,  "null"),
    PACKAGE        (KEYWORD,   "package"),
    PRIVATE        (KEYWORD,   "private"),
    PROTECTED      (KEYWORD,   "protected"),
    PUBLIC         (KEYWORD,   "public"),
    RETURN         (KEYWORD,  "return"),
//  SET            (KEYWORD,  "set"), // Contextual.
//  SHORT          (FUTURE,   "short"),
    STATIC         (KEYWORD,   "static"),
    SUPER          (KEYWORD,   "super"),
    SWITCH         (KEYWORD,  "switch"),
//  SYNCHRONIZED   (FUTURE,   "synchronized"),
    THIS           (KEYWORD,  "this"),
    THROW          (KEYWORD,  "throw"),
//  THROWS         (FUTURE,   "throws"),
//  TRANSIENT      (FUTURE,   "transient"),
    TRUE           (LITERAL,  "true"),
    TRY            (KEYWORD,  "try"),
    TYPEOF         (UNARY,    "typeof",     14, false),
    VAR            (KEYWORD,  "var"),
    VOID           (UNARY,    "void",       14, false),
//  VOLATILE       (FUTURE,   "volatile"),
    WHILE          (KEYWORD,  "while"),
    WITH           (KEYWORD,  "with"),
    YIELD          (KEYWORD,  "yield"),

    DECIMAL        (LITERAL,  null),
    OCTAL          (LITERAL,  null),
    HEXADECIMAL    (LITERAL,  null),
    FLOATING       (LITERAL,  null),
    STRING         (LITERAL,  null),
    ESCSTRING      (LITERAL,  null),
    EXECSTRING     (LITERAL,  null),
    IDENT          (LITERAL,  null),
    REGEX          (LITERAL,  null),
    XML            (LITERAL,  null),
    OBJECT         (LITERAL,  null),
    ARRAY          (LITERAL,  null),

    COMMALEFT      (IR,       null),
    CONVERT        (IR,       null),
    DISCARD        (IR,       null),
    DECPOSTFIX     (IR,       null),
    INCPOSTFIX     (IR,       null);


    private TokenType next;
    private final TokenKind kind;
    private final String name;
    private final int precedence;
    private final boolean isLeftAssociative;

    private static final TokenType[] values;

    TokenType(final TokenKind kind, final String name) {
        this.next = null;
        this.kind = kind;
        this.name = name;
        this.precedence = 0;
        this.isLeftAssociative = false;
    }

    TokenType(final TokenKind kind, final String name, final int precedence, final boolean isLeftAssociative) {
        this.next = null;
        this.kind = kind;
        this.name = name;
        this.precedence = precedence;
        this.isLeftAssociative = isLeftAssociative;
    }

    static {
        values = TokenType.values();
    }
}