package scalariform.formatter

import scalariform.parser.ScalaParser
import scalariform.parser.FullDefOrDcl

object MyTest extends App with SpecificFormatter {
  override val debug = false

  def parse(parser: ScalaParser) = parser.nonLocalDefOrDcl()

  type Result = FullDefOrDcl

  def format(formatter: ScalaFormatter, result: Result) = formatter.format(result)(FormatterState(indentLevel = 0))
  
}
