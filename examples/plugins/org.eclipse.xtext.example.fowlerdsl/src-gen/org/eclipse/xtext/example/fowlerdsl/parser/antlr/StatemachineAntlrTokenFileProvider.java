/*
* generated by Xtext
*/
package org.eclipse.xtext.example.fowlerdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class StatemachineAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/example/fowlerdsl/parser/antlr/internal/InternalStatemachine.tokens");
	}
}
