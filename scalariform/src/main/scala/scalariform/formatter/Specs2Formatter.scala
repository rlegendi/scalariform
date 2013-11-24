package scalariform.formatter

import scalariform.lexer.Tokens._
import scalariform.lexer.Token

import scalariform.parser._
import scalariform.utils._
import scalariform.formatter.preferences._

trait Specs2Formatter { self: HasFormattingPreferences with AnnotationFormatter with HasHiddenTokenInfo with TypeFormatter with ExprFormatter with ScalaFormatter ⇒

}
