/*
* generated by Xtext
*/
package fr.istic.m2miage.idm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class PollSystemAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.tokens");
	}
}
