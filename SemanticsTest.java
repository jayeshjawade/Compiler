import java.io.*;
import minipython.lexer.Lexer;
import minipython.parser.Parser;
import minipython.node.*;


public class SemanticsTest
{
  
  public static void main(String[] args)
  {
    
	try
    {
     
		Parser parser = new Parser(new Lexer(new PushbackReader(new FileReader(args[0].toString()), 1024)));

		SymbolTable symtable =  new SymbolTable();
    
		Start ast = parser.parse();
	 
		FirstVisitor first = new FirstVisitor(symtable);
		ast.apply(first);
     
		SecondVisitor second = new SecondVisitor(first.getTable(),first.getErrors());
		ast.apply(second);
	}
	
    catch (Exception e)
    {
		e.printStackTrace();
    }
    
  }
  
}
