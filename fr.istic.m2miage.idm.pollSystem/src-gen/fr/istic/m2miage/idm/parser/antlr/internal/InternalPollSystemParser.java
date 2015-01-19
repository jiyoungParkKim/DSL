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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPollSystemParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollSystem'", "'{'", "'}'", "'Poll'", "'description'", "':'", "'TextQuestion'", "'text'", "'ImageQuestion'", "'imagePath'", "'SingleChoiceQuestion'", "'Options'", "'MultipleChoiceQuestion'", "'()'", "'option'", "'value'", "'[]'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalPollSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPollSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPollSystemParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g"; }



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



    // $ANTLR start "entryRulePollSystem"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:67:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:68:2: (iv_rulePollSystem= rulePollSystem EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:69:2: iv_rulePollSystem= rulePollSystem EOF
            {
             newCompositeNode(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_rulePollSystem_in_entryRulePollSystem75);
            iv_rulePollSystem=rulePollSystem();

            state._fsp--;

             current =iv_rulePollSystem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollSystem85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:76:1: rulePollSystem returns [EObject current=null] : (otherlv_0= 'PollSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_polls_3_0= rulePoll ) )+ otherlv_4= '}' ) ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_polls_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:79:28: ( (otherlv_0= 'PollSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_polls_3_0= rulePoll ) )+ otherlv_4= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:80:1: (otherlv_0= 'PollSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_polls_3_0= rulePoll ) )+ otherlv_4= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:80:1: (otherlv_0= 'PollSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_polls_3_0= rulePoll ) )+ otherlv_4= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:80:3: otherlv_0= 'PollSystem' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_polls_3_0= rulePoll ) )+ otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePollSystem122); 

                	newLeafNode(otherlv_0, grammarAccess.getPollSystemAccess().getPollSystemKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:85:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePollSystem139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPollSystemAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPollSystemRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePollSystem156); 

                	newLeafNode(otherlv_2, grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:106:1: ( (lv_polls_3_0= rulePoll ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:107:1: (lv_polls_3_0= rulePoll )
            	    {
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:107:1: (lv_polls_3_0= rulePoll )
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:108:3: lv_polls_3_0= rulePoll
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePoll_in_rulePollSystem177);
            	    lv_polls_3_0=rulePoll();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPollSystemRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"polls",
            	            		lv_polls_3_0, 
            	            		"Poll");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_rulePollSystem190); 

                	newLeafNode(otherlv_4, grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRulePoll"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:136:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:137:2: (iv_rulePoll= rulePoll EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:138:2: iv_rulePoll= rulePoll EOF
            {
             newCompositeNode(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_rulePoll_in_entryRulePoll226);
            iv_rulePoll=rulePoll();

            state._fsp--;

             current =iv_rulePoll; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePoll236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:145:1: rulePoll returns [EObject current=null] : (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_questions_6_0= ruleQuestion ) )+ otherlv_7= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_7=null;
        EObject lv_questions_6_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:148:28: ( (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_questions_6_0= ruleQuestion ) )+ otherlv_7= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:149:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_questions_6_0= ruleQuestion ) )+ otherlv_7= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:149:1: (otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_questions_6_0= ruleQuestion ) )+ otherlv_7= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:149:3: otherlv_0= 'Poll' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )? ( (lv_questions_6_0= ruleQuestion ) )+ otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_rulePoll273); 

                	newLeafNode(otherlv_0, grammarAccess.getPollAccess().getPollKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:153:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:154:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:154:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:155:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePoll290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPollAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPollRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePoll307); 

                	newLeafNode(otherlv_2, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:175:1: (otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:175:3: otherlv_3= 'description' otherlv_4= ':' ( (lv_description_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_rulePoll320); 

                        	newLeafNode(otherlv_3, grammarAccess.getPollAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,16,FOLLOW_16_in_rulePoll332); 

                        	newLeafNode(otherlv_4, grammarAccess.getPollAccess().getColonKeyword_3_1());
                        
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:183:1: ( (lv_description_5_0= RULE_STRING ) )
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:184:1: (lv_description_5_0= RULE_STRING )
                    {
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:184:1: (lv_description_5_0= RULE_STRING )
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:185:3: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePoll349); 

                    			newLeafNode(lv_description_5_0, grammarAccess.getPollAccess().getDescriptionSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPollRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_5_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:201:4: ( (lv_questions_6_0= ruleQuestion ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==19||LA3_0==21||LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:202:1: (lv_questions_6_0= ruleQuestion )
            	    {
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:202:1: (lv_questions_6_0= ruleQuestion )
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:203:3: lv_questions_6_0= ruleQuestion
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQuestion_in_rulePoll377);
            	    lv_questions_6_0=ruleQuestion();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPollRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"questions",
            	            		lv_questions_6_0, 
            	            		"Question");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_rulePoll390); 

                	newLeafNode(otherlv_7, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:231:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:232:2: (iv_ruleQuestion= ruleQuestion EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:233:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_ruleQuestion_in_entryRuleQuestion426);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuestion436); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:240:1: ruleQuestion returns [EObject current=null] : (this_TextQuestion_0= ruleTextQuestion | this_ImageQuestion_1= ruleImageQuestion | this_SingleChoiceQuestion_2= ruleSingleChoiceQuestion | this_MultipleChoiceQuestion_3= ruleMultipleChoiceQuestion ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        EObject this_TextQuestion_0 = null;

        EObject this_ImageQuestion_1 = null;

        EObject this_SingleChoiceQuestion_2 = null;

        EObject this_MultipleChoiceQuestion_3 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:243:28: ( (this_TextQuestion_0= ruleTextQuestion | this_ImageQuestion_1= ruleImageQuestion | this_SingleChoiceQuestion_2= ruleSingleChoiceQuestion | this_MultipleChoiceQuestion_3= ruleMultipleChoiceQuestion ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:244:1: (this_TextQuestion_0= ruleTextQuestion | this_ImageQuestion_1= ruleImageQuestion | this_SingleChoiceQuestion_2= ruleSingleChoiceQuestion | this_MultipleChoiceQuestion_3= ruleMultipleChoiceQuestion )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:244:1: (this_TextQuestion_0= ruleTextQuestion | this_ImageQuestion_1= ruleImageQuestion | this_SingleChoiceQuestion_2= ruleSingleChoiceQuestion | this_MultipleChoiceQuestion_3= ruleMultipleChoiceQuestion )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 21:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:245:5: this_TextQuestion_0= ruleTextQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getTextQuestionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTextQuestion_in_ruleQuestion483);
                    this_TextQuestion_0=ruleTextQuestion();

                    state._fsp--;

                     
                            current = this_TextQuestion_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:255:5: this_ImageQuestion_1= ruleImageQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getImageQuestionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleImageQuestion_in_ruleQuestion510);
                    this_ImageQuestion_1=ruleImageQuestion();

                    state._fsp--;

                     
                            current = this_ImageQuestion_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:265:5: this_SingleChoiceQuestion_2= ruleSingleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getSingleChoiceQuestionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion537);
                    this_SingleChoiceQuestion_2=ruleSingleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_SingleChoiceQuestion_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:275:5: this_MultipleChoiceQuestion_3= ruleMultipleChoiceQuestion
                    {
                     
                            newCompositeNode(grammarAccess.getQuestionAccess().getMultipleChoiceQuestionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleMultipleChoiceQuestion_in_ruleQuestion564);
                    this_MultipleChoiceQuestion_3=ruleMultipleChoiceQuestion();

                    state._fsp--;

                     
                            current = this_MultipleChoiceQuestion_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleTextQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:291:1: entryRuleTextQuestion returns [EObject current=null] : iv_ruleTextQuestion= ruleTextQuestion EOF ;
    public final EObject entryRuleTextQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextQuestion = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:292:2: (iv_ruleTextQuestion= ruleTextQuestion EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:293:2: iv_ruleTextQuestion= ruleTextQuestion EOF
            {
             newCompositeNode(grammarAccess.getTextQuestionRule()); 
            pushFollow(FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion599);
            iv_ruleTextQuestion=ruleTextQuestion();

            state._fsp--;

             current =iv_ruleTextQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextQuestion609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextQuestion"


    // $ANTLR start "ruleTextQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:300:1: ruleTextQuestion returns [EObject current=null] : (otherlv_0= 'TextQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleTextQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:303:28: ( (otherlv_0= 'TextQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:304:1: (otherlv_0= 'TextQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:304:1: (otherlv_0= 'TextQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:304:3: otherlv_0= 'TextQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTextQuestion646); 

                	newLeafNode(otherlv_0, grammarAccess.getTextQuestionAccess().getTextQuestionKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:309:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:309:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextQuestion663); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTextQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTextQuestion680); 

                	newLeafNode(otherlv_2, grammarAccess.getTextQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleTextQuestion692); 

                	newLeafNode(otherlv_3, grammarAccess.getTextQuestionAccess().getTextKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:334:1: ( (lv_text_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:335:1: (lv_text_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:335:1: (lv_text_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:336:3: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTextQuestion709); 

            			newLeafNode(lv_text_4_0, grammarAccess.getTextQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleTextQuestion726); 

                	newLeafNode(otherlv_5, grammarAccess.getTextQuestionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextQuestion"


    // $ANTLR start "entryRuleImageQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:364:1: entryRuleImageQuestion returns [EObject current=null] : iv_ruleImageQuestion= ruleImageQuestion EOF ;
    public final EObject entryRuleImageQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageQuestion = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:365:2: (iv_ruleImageQuestion= ruleImageQuestion EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:366:2: iv_ruleImageQuestion= ruleImageQuestion EOF
            {
             newCompositeNode(grammarAccess.getImageQuestionRule()); 
            pushFollow(FOLLOW_ruleImageQuestion_in_entryRuleImageQuestion762);
            iv_ruleImageQuestion=ruleImageQuestion();

            state._fsp--;

             current =iv_ruleImageQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageQuestion772); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImageQuestion"


    // $ANTLR start "ruleImageQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:373:1: ruleImageQuestion returns [EObject current=null] : (otherlv_0= 'ImageQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'imagePath' otherlv_6= ':' ( (lv_imagePath_7_0= RULE_STRING ) ) otherlv_8= '}' ) ;
    public final EObject ruleImageQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_imagePath_7_0=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:376:28: ( (otherlv_0= 'ImageQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'imagePath' otherlv_6= ':' ( (lv_imagePath_7_0= RULE_STRING ) ) otherlv_8= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:377:1: (otherlv_0= 'ImageQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'imagePath' otherlv_6= ':' ( (lv_imagePath_7_0= RULE_STRING ) ) otherlv_8= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:377:1: (otherlv_0= 'ImageQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'imagePath' otherlv_6= ':' ( (lv_imagePath_7_0= RULE_STRING ) ) otherlv_8= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:377:3: otherlv_0= 'ImageQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'imagePath' otherlv_6= ':' ( (lv_imagePath_7_0= RULE_STRING ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleImageQuestion809); 

                	newLeafNode(otherlv_0, grammarAccess.getImageQuestionAccess().getImageQuestionKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:381:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:382:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:382:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:383:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImageQuestion826); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImageQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImageQuestion843); 

                	newLeafNode(otherlv_2, grammarAccess.getImageQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleImageQuestion855); 

                	newLeafNode(otherlv_3, grammarAccess.getImageQuestionAccess().getTextKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:407:1: ( (lv_text_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:408:1: (lv_text_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:408:1: (lv_text_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:409:3: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageQuestion872); 

            			newLeafNode(lv_text_4_0, grammarAccess.getImageQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleImageQuestion889); 

                	newLeafNode(otherlv_5, grammarAccess.getImageQuestionAccess().getImagePathKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleImageQuestion901); 

                	newLeafNode(otherlv_6, grammarAccess.getImageQuestionAccess().getColonKeyword_6());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:433:1: ( (lv_imagePath_7_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:434:1: (lv_imagePath_7_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:434:1: (lv_imagePath_7_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:435:3: lv_imagePath_7_0= RULE_STRING
            {
            lv_imagePath_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleImageQuestion918); 

            			newLeafNode(lv_imagePath_7_0, grammarAccess.getImageQuestionAccess().getImagePathSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImageQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"imagePath",
                    		lv_imagePath_7_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleImageQuestion935); 

                	newLeafNode(otherlv_8, grammarAccess.getImageQuestionAccess().getRightCurlyBracketKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImageQuestion"


    // $ANTLR start "entryRuleSingleChoiceQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:463:1: entryRuleSingleChoiceQuestion returns [EObject current=null] : iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF ;
    public final EObject entryRuleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceQuestion = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:464:2: (iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:465:2: iv_ruleSingleChoiceQuestion= ruleSingleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion971);
            iv_ruleSingleChoiceQuestion=ruleSingleChoiceQuestion();

            state._fsp--;

             current =iv_ruleSingleChoiceQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleChoiceQuestion981); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleChoiceQuestion"


    // $ANTLR start "ruleSingleChoiceQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:472:1: ruleSingleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'SingleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleSingleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleSingleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_options_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:475:28: ( (otherlv_0= 'SingleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleSingleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:476:1: (otherlv_0= 'SingleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleSingleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:476:1: (otherlv_0= 'SingleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleSingleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:476:3: otherlv_0= 'SingleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleSingleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleSingleChoiceQuestion1018); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceQuestionAccess().getSingleChoiceQuestionKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:480:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:481:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:481:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:482:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleChoiceQuestion1035); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSingleChoiceQuestion1052); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleSingleChoiceQuestion1064); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceQuestionAccess().getTextKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:506:1: ( (lv_text_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:507:1: (lv_text_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:507:1: (lv_text_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:508:3: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleChoiceQuestion1081); 

            			newLeafNode(lv_text_4_0, grammarAccess.getSingleChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleSingleChoiceQuestion1098); 

                	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceQuestionAccess().getOptionsKeyword_5());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleSingleChoiceQuestion1110); 

                	newLeafNode(otherlv_6, grammarAccess.getSingleChoiceQuestionAccess().getLeftCurlyBracketKeyword_6());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:532:1: ( (lv_options_7_0= ruleSingleChoiceOption ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==24) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:533:1: (lv_options_7_0= ruleSingleChoiceOption )
            	    {
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:533:1: (lv_options_7_0= ruleSingleChoiceOption )
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:534:3: lv_options_7_0= ruleSingleChoiceOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSingleChoiceQuestionAccess().getOptionsSingleChoiceOptionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSingleChoiceOption_in_ruleSingleChoiceQuestion1131);
            	    lv_options_7_0=ruleSingleChoiceOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSingleChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_7_0, 
            	            		"SingleChoiceOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleSingleChoiceQuestion1144); 

                	newLeafNode(otherlv_8, grammarAccess.getSingleChoiceQuestionAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleSingleChoiceQuestion1156); 

                	newLeafNode(otherlv_9, grammarAccess.getSingleChoiceQuestionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleChoiceQuestion"


    // $ANTLR start "entryRuleMultipleChoiceQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:566:1: entryRuleMultipleChoiceQuestion returns [EObject current=null] : iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF ;
    public final EObject entryRuleMultipleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceQuestion = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:567:2: (iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:568:2: iv_ruleMultipleChoiceQuestion= ruleMultipleChoiceQuestion EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceQuestionRule()); 
            pushFollow(FOLLOW_ruleMultipleChoiceQuestion_in_entryRuleMultipleChoiceQuestion1192);
            iv_ruleMultipleChoiceQuestion=ruleMultipleChoiceQuestion();

            state._fsp--;

             current =iv_ruleMultipleChoiceQuestion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultipleChoiceQuestion1202); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoiceQuestion"


    // $ANTLR start "ruleMultipleChoiceQuestion"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:575:1: ruleMultipleChoiceQuestion returns [EObject current=null] : (otherlv_0= 'MultipleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleMultipleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' ) ;
    public final EObject ruleMultipleChoiceQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_text_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_options_7_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:578:28: ( (otherlv_0= 'MultipleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleMultipleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:579:1: (otherlv_0= 'MultipleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleMultipleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:579:1: (otherlv_0= 'MultipleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleMultipleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:579:3: otherlv_0= 'MultipleChoiceQuestion' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'text' ( (lv_text_4_0= RULE_STRING ) ) otherlv_5= 'Options' otherlv_6= '{' ( (lv_options_7_0= ruleMultipleChoiceOption ) )+ otherlv_8= '}' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleMultipleChoiceQuestion1239); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceQuestionAccess().getMultipleChoiceQuestionKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:583:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:584:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:584:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:585:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultipleChoiceQuestion1256); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceQuestionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMultipleChoiceQuestion1273); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMultipleChoiceQuestion1285); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceQuestionAccess().getTextKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:609:1: ( (lv_text_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:610:1: (lv_text_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:610:1: (lv_text_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:611:3: lv_text_4_0= RULE_STRING
            {
            lv_text_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultipleChoiceQuestion1302); 

            			newLeafNode(lv_text_4_0, grammarAccess.getMultipleChoiceQuestionAccess().getTextSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceQuestionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleMultipleChoiceQuestion1319); 

                	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceQuestionAccess().getOptionsKeyword_5());
                
            otherlv_6=(Token)match(input,12,FOLLOW_12_in_ruleMultipleChoiceQuestion1331); 

                	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceQuestionAccess().getLeftCurlyBracketKeyword_6());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:635:1: ( (lv_options_7_0= ruleMultipleChoiceOption ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:636:1: (lv_options_7_0= ruleMultipleChoiceOption )
            	    {
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:636:1: (lv_options_7_0= ruleMultipleChoiceOption )
            	    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:637:3: lv_options_7_0= ruleMultipleChoiceOption
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultipleChoiceQuestionAccess().getOptionsMultipleChoiceOptionParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultipleChoiceOption_in_ruleMultipleChoiceQuestion1352);
            	    lv_options_7_0=ruleMultipleChoiceOption();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultipleChoiceQuestionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_7_0, 
            	            		"MultipleChoiceOption");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            otherlv_8=(Token)match(input,13,FOLLOW_13_in_ruleMultipleChoiceQuestion1365); 

                	newLeafNode(otherlv_8, grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleMultipleChoiceQuestion1377); 

                	newLeafNode(otherlv_9, grammarAccess.getMultipleChoiceQuestionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoiceQuestion"


    // $ANTLR start "entryRuleSingleChoiceOption"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:671:1: entryRuleSingleChoiceOption returns [EObject current=null] : iv_ruleSingleChoiceOption= ruleSingleChoiceOption EOF ;
    public final EObject entryRuleSingleChoiceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleChoiceOption = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:672:2: (iv_ruleSingleChoiceOption= ruleSingleChoiceOption EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:673:2: iv_ruleSingleChoiceOption= ruleSingleChoiceOption EOF
            {
             newCompositeNode(grammarAccess.getSingleChoiceOptionRule()); 
            pushFollow(FOLLOW_ruleSingleChoiceOption_in_entryRuleSingleChoiceOption1415);
            iv_ruleSingleChoiceOption=ruleSingleChoiceOption();

            state._fsp--;

             current =iv_ruleSingleChoiceOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleChoiceOption1425); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleChoiceOption"


    // $ANTLR start "ruleSingleChoiceOption"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:680:1: ruleSingleChoiceOption returns [EObject current=null] : (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleSingleChoiceOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_option_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:683:28: ( (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:684:1: (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:684:1: (otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:684:3: otherlv_0= '()' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSingleChoiceOption1462); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleChoiceOptionAccess().getLeftParenthesisRightParenthesisKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:688:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:689:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:689:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleChoiceOption1479); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSingleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleSingleChoiceOption1496); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleChoiceOptionAccess().getOptionKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleSingleChoiceOption1508); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleChoiceOptionAccess().getColonKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:714:1: ( (lv_option_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:715:1: (lv_option_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:715:1: (lv_option_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:716:3: lv_option_4_0= RULE_STRING
            {
            lv_option_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleChoiceOption1525); 

            			newLeafNode(lv_option_4_0, grammarAccess.getSingleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"option",
                    		lv_option_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleSingleChoiceOption1542); 

                	newLeafNode(otherlv_5, grammarAccess.getSingleChoiceOptionAccess().getValueKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleSingleChoiceOption1554); 

                	newLeafNode(otherlv_6, grammarAccess.getSingleChoiceOptionAccess().getColonKeyword_6());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:740:1: ( (lv_value_7_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:741:1: (lv_value_7_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:741:1: (lv_value_7_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:742:3: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSingleChoiceOption1571); 

            			newLeafNode(lv_value_7_0, grammarAccess.getSingleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleChoiceOption"


    // $ANTLR start "entryRuleMultipleChoiceOption"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:766:1: entryRuleMultipleChoiceOption returns [EObject current=null] : iv_ruleMultipleChoiceOption= ruleMultipleChoiceOption EOF ;
    public final EObject entryRuleMultipleChoiceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleChoiceOption = null;


        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:767:2: (iv_ruleMultipleChoiceOption= ruleMultipleChoiceOption EOF )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:768:2: iv_ruleMultipleChoiceOption= ruleMultipleChoiceOption EOF
            {
             newCompositeNode(grammarAccess.getMultipleChoiceOptionRule()); 
            pushFollow(FOLLOW_ruleMultipleChoiceOption_in_entryRuleMultipleChoiceOption1612);
            iv_ruleMultipleChoiceOption=ruleMultipleChoiceOption();

            state._fsp--;

             current =iv_ruleMultipleChoiceOption; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultipleChoiceOption1622); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleChoiceOption"


    // $ANTLR start "ruleMultipleChoiceOption"
    // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:775:1: ruleMultipleChoiceOption returns [EObject current=null] : (otherlv_0= '[]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) ) ;
    public final EObject ruleMultipleChoiceOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_option_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;

         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:778:28: ( (otherlv_0= '[]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:779:1: (otherlv_0= '[]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:779:1: (otherlv_0= '[]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:779:3: otherlv_0= '[]' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'option' otherlv_3= ':' ( (lv_option_4_0= RULE_STRING ) ) otherlv_5= 'value' otherlv_6= ':' ( (lv_value_7_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleMultipleChoiceOption1659); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleChoiceOptionAccess().getLeftSquareBracketRightSquareBracketKeyword_0());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:783:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:784:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:784:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:785:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultipleChoiceOption1676); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMultipleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleMultipleChoiceOption1693); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleChoiceOptionAccess().getOptionKeyword_2());
                
            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleMultipleChoiceOption1705); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleChoiceOptionAccess().getColonKeyword_3());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:809:1: ( (lv_option_4_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:810:1: (lv_option_4_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:810:1: (lv_option_4_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:811:3: lv_option_4_0= RULE_STRING
            {
            lv_option_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultipleChoiceOption1722); 

            			newLeafNode(lv_option_4_0, grammarAccess.getMultipleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"option",
                    		lv_option_4_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleMultipleChoiceOption1739); 

                	newLeafNode(otherlv_5, grammarAccess.getMultipleChoiceOptionAccess().getValueKeyword_5());
                
            otherlv_6=(Token)match(input,16,FOLLOW_16_in_ruleMultipleChoiceOption1751); 

                	newLeafNode(otherlv_6, grammarAccess.getMultipleChoiceOptionAccess().getColonKeyword_6());
                
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:835:1: ( (lv_value_7_0= RULE_STRING ) )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:836:1: (lv_value_7_0= RULE_STRING )
            {
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:836:1: (lv_value_7_0= RULE_STRING )
            // ../fr.istic.m2miage.idm.pollSystem/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalPollSystem.g:837:3: lv_value_7_0= RULE_STRING
            {
            lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultipleChoiceOption1768); 

            			newLeafNode(lv_value_7_0, grammarAccess.getMultipleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleChoiceOptionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleChoiceOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePollSystem_in_entryRulePollSystem75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollSystem85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePollSystem122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePollSystem139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePollSystem156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rulePoll_in_rulePollSystem177 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePollSystem190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePoll_in_entryRulePoll226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePoll236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rulePoll273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePoll290 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePoll307 = new BitSet(new long[]{0x0000000000AA8000L});
    public static final BitSet FOLLOW_15_in_rulePoll320 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePoll332 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePoll349 = new BitSet(new long[]{0x0000000000AA8000L});
    public static final BitSet FOLLOW_ruleQuestion_in_rulePoll377 = new BitSet(new long[]{0x0000000000AAA000L});
    public static final BitSet FOLLOW_13_in_rulePoll390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuestion_in_entryRuleQuestion426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuestion436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextQuestion_in_ruleQuestion483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageQuestion_in_ruleQuestion510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_ruleQuestion537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleChoiceQuestion_in_ruleQuestion564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextQuestion_in_entryRuleTextQuestion599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestion609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTextQuestion646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextQuestion663 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextQuestion680 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTextQuestion692 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTextQuestion709 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTextQuestion726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageQuestion_in_entryRuleImageQuestion762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageQuestion772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleImageQuestion809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImageQuestion826 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImageQuestion843 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleImageQuestion855 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageQuestion872 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleImageQuestion889 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleImageQuestion901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleImageQuestion918 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImageQuestion935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleChoiceQuestion_in_entryRuleSingleChoiceQuestion971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceQuestion981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleSingleChoiceQuestion1018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleChoiceQuestion1035 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSingleChoiceQuestion1052 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSingleChoiceQuestion1064 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleChoiceQuestion1081 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSingleChoiceQuestion1098 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSingleChoiceQuestion1110 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleSingleChoiceOption_in_ruleSingleChoiceQuestion1131 = new BitSet(new long[]{0x0000000001002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleChoiceQuestion1144 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleChoiceQuestion1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleChoiceQuestion_in_entryRuleMultipleChoiceQuestion1192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoiceQuestion1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleMultipleChoiceQuestion1239 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoiceQuestion1256 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMultipleChoiceQuestion1273 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMultipleChoiceQuestion1285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultipleChoiceQuestion1302 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMultipleChoiceQuestion1319 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMultipleChoiceQuestion1331 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleMultipleChoiceOption_in_ruleMultipleChoiceQuestion1352 = new BitSet(new long[]{0x0000000008002000L});
    public static final BitSet FOLLOW_13_in_ruleMultipleChoiceQuestion1365 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMultipleChoiceQuestion1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleChoiceOption_in_entryRuleSingleChoiceOption1415 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleChoiceOption1425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSingleChoiceOption1462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleChoiceOption1479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSingleChoiceOption1496 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleChoiceOption1508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleChoiceOption1525 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSingleChoiceOption1542 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleChoiceOption1554 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSingleChoiceOption1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleChoiceOption_in_entryRuleMultipleChoiceOption1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultipleChoiceOption1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMultipleChoiceOption1659 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleChoiceOption1676 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMultipleChoiceOption1693 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultipleChoiceOption1705 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultipleChoiceOption1722 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleMultipleChoiceOption1739 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultipleChoiceOption1751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultipleChoiceOption1768 = new BitSet(new long[]{0x0000000000000002L});

}