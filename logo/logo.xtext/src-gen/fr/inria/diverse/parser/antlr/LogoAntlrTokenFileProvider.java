/*
 * generated by Xtext 2.19.0
 */
package fr.inria.diverse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LogoAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("fr/inria/diverse/parser/antlr/internal/InternalLogo.tokens");
	}
}
