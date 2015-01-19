/*
* generated by Xtext
*/
package fr.istic.m2miage.idm.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.istic.m2miage.idm.services.PollSystemGrammarAccess;

public class PollSystemParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private PollSystemGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.istic.m2miage.idm.parser.antlr.internal.InternalPollSystemParser createParser(XtextTokenStream stream) {
		return new fr.istic.m2miage.idm.parser.antlr.internal.InternalPollSystemParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "PollSystem";
	}
	
	public PollSystemGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PollSystemGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}