package scalariform.formatter

import scalariform.parser._
import scalariform.formatter._
import scalariform.formatter.preferences._

// format: OFF
class Specs2FormatterTest extends AbstractFormatterTest {

  """class HelloWorldSpec extends Specification {
    |
    |  "The 'Hello world' string" should {
    |    "contain 11 characters" in {
    |      "Hello world" must have size 11
    |    }
    |    "start with 'Hello'" in {
    |      "Hello world" must startWith("Hello")
    |    }
    |    "end with 'world'" in {
    |      "Hello world" must endWith("world")
    |    }
    |  }
    |}""" ==>
  """class HelloWorldSpec extends Specification {
    |
    |  "The 'Hello world' string" should {
    |    "contain 11 characters" in {
    |      "Hello world" must have size 11
    |    }
    |    "start with 'Hello'" in {
    |      "Hello world" must startWith("Hello")
    |    }
    |    "end with 'world'" in {
    |      "Hello world" must endWith("world")
    |    }
    |  }
    |}"""
 
  """class HelloWorldSpec extends Specification {
    |  def is = s2"""+"""""""""+"""
    |      This is a specification to check the 'Hello world' string
    |  
    |      The 'Hello world' string should
    |        contain 11 characters                             $e1
    |        start with 'Hello'                                $e2
    |        end with 'world'                                  $e3
    |                                                          """+"""""""""+"""
    |
    |  def e1 = "Hello world" must have size 11
    |  def e2 = "Hello world" must startWith("Hello")
    |  def e3 = "Hello world" must endWith("world")
    |}""" ==>
  """class HelloWorldSpec extends Specification {
    |  def is = s2"""+"""""""""+"""
    |      This is a specification to check the 'Hello world' string
    |  
    |      The 'Hello world' string should
    |        contain 11 characters                             $e1
    |        start with 'Hello'                                $e2
    |        end with 'world'                                  $e3
    |                                                          """+"""""""""+"""
    |
    |  def e1 = "Hello world" must have size 11
    |  def e2 = "Hello world" must startWith("Hello")
    |  def e3 = "Hello world" must endWith("world")
    |}"""

  // format: ON

  override val debug = true

  def parse(parser: ScalaParser) = parser.nonLocalDefOrDcl()

  type Result = FullDefOrDcl

  def format(formatter: ScalaFormatter, result: Result) = formatter.format(result)(FormatterState(indentLevel = 0))

}
