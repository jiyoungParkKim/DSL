/*
* generated by Xtext
*/
grammar InternalPollSystem;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package fr.istic.m2miage.idm.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package fr.istic.m2miage.idm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.m2miage.idm.services.PollSystemGrammarAccess;

}

@parser::members {

 	private PollSystemGrammarAccess grammarAccess;
 	
    public InternalPollSystemParser(TokenStream input, PollSystemGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "PollSystem";	
   	}
   	
   	@Override
   	protected PollSystemGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRulePollSystem
entryRulePollSystem returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPollSystemRule()); }
	 iv_rulePollSystem=rulePollSystem 
	 { $current=$iv_rulePollSystem.current; } 
	 EOF 
;

// Rule PollSystem
rulePollSystem returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='PollSystem' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPollSystemAccess().getPollSystemKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPollSystemAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPollSystemRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_3_0()); 
	    }
		lv_polls_3_0=rulePoll		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPollSystemRule());
	        }
       		add(
       			$current, 
       			"polls",
        		lv_polls_3_0, 
        		"Poll");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRulePoll
entryRulePoll returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPollRule()); }
	 iv_rulePoll=rulePoll 
	 { $current=$iv_rulePoll.current; } 
	 EOF 
;

// Rule Poll
rulePoll returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Poll' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPollRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2());
    }
(	otherlv_3='description' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getPollAccess().getDescriptionKeyword_3_0());
    }
	otherlv_4=':' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPollAccess().getColonKeyword_3_1());
    }
(
(
		lv_description_5_0=RULE_STRING
		{
			newLeafNode(lv_description_5_0, grammarAccess.getPollAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getPollRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"description",
        		lv_description_5_0, 
        		"STRING");
	    }

)
))?(
(
		{ 
	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_4_0()); 
	    }
		lv_questions_6_0=ruleQuestion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPollRule());
	        }
       		add(
       			$current, 
       			"questions",
        		lv_questions_6_0, 
        		"Question");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_7='}' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleQuestion
entryRuleQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getQuestionRule()); }
	 iv_ruleQuestion=ruleQuestion 
	 { $current=$iv_ruleQuestion.current; } 
	 EOF 
;

// Rule Question
ruleQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getTextQuestionParserRuleCall_0()); 
    }
    this_TextQuestion_0=ruleTextQuestion
    { 
        $current = $this_TextQuestion_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getImageQuestionParserRuleCall_1()); 
    }
    this_ImageQuestion_1=ruleImageQuestion
    { 
        $current = $this_ImageQuestion_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_2()); 
    }
    this_SingleChoiceQuestion_2=ruleSingleChoiceQuestion
    { 
        $current = $this_SingleChoiceQuestion_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceQuestionParserRuleCall_3()); 
    }
    this_MultipleChoiceQuestion_3=ruleMultipleChoiceQuestion
    { 
        $current = $this_MultipleChoiceQuestion_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTextQuestion
entryRuleTextQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextQuestionRule()); }
	 iv_ruleTextQuestion=ruleTextQuestion 
	 { $current=$iv_ruleTextQuestion.current; } 
	 EOF 
;

// Rule TextQuestion
ruleTextQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TextQuestion' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='text' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getTextKeyword_3());
    }
(
(
		lv_text_4_0=RULE_STRING
		{
			newLeafNode(lv_text_4_0, grammarAccess.getTextQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTextQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='}' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_5());
    }
)
;





// Entry rule entryRuleImageQuestion
entryRuleImageQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImageQuestionRule()); }
	 iv_ruleImageQuestion=ruleImageQuestion 
	 { $current=$iv_ruleImageQuestion.current; } 
	 EOF 
;

// Rule ImageQuestion
ruleImageQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ImageQuestion' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImageQuestionAccess().getImageQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getImageQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImageQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getImageQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='text' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getImageQuestionAccess().getTextKeyword_3());
    }
(
(
		lv_text_4_0=RULE_STRING
		{
			newLeafNode(lv_text_4_0, grammarAccess.getImageQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImageQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='imagePath' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getImageQuestionAccess().getImagePathKeyword_5());
    }
	otherlv_6=':' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getImageQuestionAccess().getColonKeyword_6());
    }
(
(
		lv_imagePath_7_0=RULE_STRING
		{
			newLeafNode(lv_imagePath_7_0, grammarAccess.getImageQuestionAccess().getImagePathSTRINGTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getImageQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"imagePath",
        		lv_imagePath_7_0, 
        		"STRING");
	    }

)
)	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getImageQuestionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleSingleChoiceQuestion
entryRuleSingleChoiceQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); }
	 iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion 
	 { $current=$iv_ruleSingleChoiceQuestion.current; } 
	 EOF 
;

// Rule SingleChoiceQuestion
ruleSingleChoiceQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='SingleChoiceQuestion' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='text' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_3());
    }
(
(
		lv_text_4_0=RULE_STRING
		{
			newLeafNode(lv_text_4_0, grammarAccess.getSingleChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='Options' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceQuestionAccess().getOptionsKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSingleChoiceQuestionAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getOptionsSingleChoiceOptionParserRuleCall_7_0()); 
	    }
		lv_options_7_0=ruleSingleChoiceOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_7_0, 
        		"SingleChoiceOption");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getSingleChoiceQuestionAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getSingleChoiceQuestionAccess().getRightCurlyBracketKeyword_9());
    }
)
;





// Entry rule entryRuleMultipleChoiceQuestion
entryRuleMultipleChoiceQuestion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultipleChoiceQuestionRule()); }
	 iv_ruleMultipleChoiceQuestion=ruleMultipleChoiceQuestion 
	 { $current=$iv_ruleMultipleChoiceQuestion.current; } 
	 EOF 
;

// Rule MultipleChoiceQuestion
ruleMultipleChoiceQuestion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='MultipleChoiceQuestion' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceQuestionAccess().getMultipleChoiceQuestionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
    }
	otherlv_3='text' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceQuestionAccess().getTextKeyword_3());
    }
(
(
		lv_text_4_0=RULE_STRING
		{
			newLeafNode(lv_text_4_0, grammarAccess.getMultipleChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceQuestionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"text",
        		lv_text_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='Options' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceQuestionAccess().getOptionsKeyword_5());
    }
	otherlv_6='{' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getMultipleChoiceQuestionAccess().getOptionsMultipleChoiceOptionParserRuleCall_7_0()); 
	    }
		lv_options_7_0=ruleMultipleChoiceOption		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMultipleChoiceQuestionRule());
	        }
       		add(
       			$current, 
       			"options",
        		lv_options_7_0, 
        		"MultipleChoiceOption");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_8='}' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_8());
    }
	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_9());
    }
)
;







// Entry rule entryRuleSingleChoiceOption
entryRuleSingleChoiceOption returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSingleChoiceOptionRule()); }
	 iv_ruleSingleChoiceOption=ruleSingleChoiceOption 
	 { $current=$iv_ruleSingleChoiceOption.current; } 
	 EOF 
;

// Rule SingleChoiceOption
ruleSingleChoiceOption returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='()' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceOptionAccess().getLeftParenthesisRightParenthesisKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='option' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceOptionAccess().getOptionKeyword_2());
    }
	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceOptionAccess().getColonKeyword_3());
    }
(
(
		lv_option_4_0=RULE_STRING
		{
			newLeafNode(lv_option_4_0, grammarAccess.getSingleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"option",
        		lv_option_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='value' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceOptionAccess().getValueKeyword_5());
    }
	otherlv_6=':' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getSingleChoiceOptionAccess().getColonKeyword_6());
    }
(
(
		lv_value_7_0=RULE_STRING
		{
			newLeafNode(lv_value_7_0, grammarAccess.getSingleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"STRING");
	    }

)
))
;





// Entry rule entryRuleMultipleChoiceOption
entryRuleMultipleChoiceOption returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMultipleChoiceOptionRule()); }
	 iv_ruleMultipleChoiceOption=ruleMultipleChoiceOption 
	 { $current=$iv_ruleMultipleChoiceOption.current; } 
	 EOF 
;

// Rule MultipleChoiceOption
ruleMultipleChoiceOption returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='[]' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceOptionAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='option' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceOptionAccess().getOptionKeyword_2());
    }
	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceOptionAccess().getColonKeyword_3());
    }
(
(
		lv_option_4_0=RULE_STRING
		{
			newLeafNode(lv_option_4_0, grammarAccess.getMultipleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"option",
        		lv_option_4_0, 
        		"STRING");
	    }

)
)	otherlv_5='value' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceOptionAccess().getValueKeyword_5());
    }
	otherlv_6=':' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceOptionAccess().getColonKeyword_6());
    }
(
(
		lv_value_7_0=RULE_STRING
		{
			newLeafNode(lv_value_7_0, grammarAccess.getMultipleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"STRING");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


