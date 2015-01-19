package fr.istic.m2miage.idm.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.istic.m2miage.idm.services.CSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCSSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollStyle'", "'{'", "'bgColor'", "':'", "'borderType'", "'}'", "'SingleQuestionStyle'", "'MultipleQuestionStyle'", "'TextQuestionStyle'", "'Azure'", "'Cyan'", "'LavenderBlush'", "'LightGreen'", "'PaleTurquoise'", "'Box'", "'None'", "'RoundedBox'", "'Dotte'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCSSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCSSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCSSParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g"; }



     	private CSSGrammarAccess grammarAccess;
     	
        public InternalCSSParser(TokenStream input, CSSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Style";	
       	}
       	
       	@Override
       	protected CSSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:68:1: entryRuleStyle returns [EObject current=null] : iv_ruleStyle= ruleStyle EOF ;
    public final EObject entryRuleStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStyle = null;


        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:69:2: (iv_ruleStyle= ruleStyle EOF )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:70:2: iv_ruleStyle= ruleStyle EOF
            {
             newCompositeNode(grammarAccess.getStyleRule()); 
            pushFollow(FOLLOW_ruleStyle_in_entryRuleStyle75);
            iv_ruleStyle=ruleStyle();

            state._fsp--;

             current =iv_ruleStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStyle85); 

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
    // $ANTLR end "entryRuleStyle"


    // $ANTLR start "ruleStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:77:1: ruleStyle returns [EObject current=null] : ( ( (lv_pollStyle_0_0= rulePollStyle ) ) ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) ) ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) ) ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) ) ) ;
    public final EObject ruleStyle() throws RecognitionException {
        EObject current = null;

        EObject lv_pollStyle_0_0 = null;

        EObject lv_singleQuestionStyle_1_0 = null;

        EObject lv_multipleQuestionStyle_2_0 = null;

        EObject lv_textQuestionStyle_3_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:80:28: ( ( ( (lv_pollStyle_0_0= rulePollStyle ) ) ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) ) ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) ) ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) ) ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:81:1: ( ( (lv_pollStyle_0_0= rulePollStyle ) ) ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) ) ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) ) ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) ) )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:81:1: ( ( (lv_pollStyle_0_0= rulePollStyle ) ) ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) ) ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) ) ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:81:2: ( (lv_pollStyle_0_0= rulePollStyle ) ) ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) ) ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) ) ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:81:2: ( (lv_pollStyle_0_0= rulePollStyle ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:82:1: (lv_pollStyle_0_0= rulePollStyle )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:82:1: (lv_pollStyle_0_0= rulePollStyle )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:83:3: lv_pollStyle_0_0= rulePollStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getPollStylePollStyleParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePollStyle_in_ruleStyle131);
            lv_pollStyle_0_0=rulePollStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"pollStyle",
                    		lv_pollStyle_0_0, 
                    		"PollStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:99:2: ( (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:100:1: (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:100:1: (lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:101:3: lv_singleQuestionStyle_1_0= ruleSingleQuestionStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getSingleQuestionStyleSingleQuestionStyleParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSingleQuestionStyle_in_ruleStyle152);
            lv_singleQuestionStyle_1_0=ruleSingleQuestionStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"singleQuestionStyle",
                    		lv_singleQuestionStyle_1_0, 
                    		"SingleQuestionStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:117:2: ( (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:118:1: (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:118:1: (lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:119:3: lv_multipleQuestionStyle_2_0= ruleMultipleQuestionStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getMultipleQuestionStyleMultipleQuestionStyleParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleMultipleQuestionStyle_in_ruleStyle173);
            lv_multipleQuestionStyle_2_0=ruleMultipleQuestionStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"multipleQuestionStyle",
                    		lv_multipleQuestionStyle_2_0, 
                    		"MultipleQuestionStyle");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:135:2: ( (lv_textQuestionStyle_3_0= ruleTextQuestionStyle ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:136:1: (lv_textQuestionStyle_3_0= ruleTextQuestionStyle )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:136:1: (lv_textQuestionStyle_3_0= ruleTextQuestionStyle )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:137:3: lv_textQuestionStyle_3_0= ruleTextQuestionStyle
            {
             
            	        newCompositeNode(grammarAccess.getStyleAccess().getTextQuestionStyleTextQuestionStyleParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTextQuestionStyle_in_ruleStyle194);
            lv_textQuestionStyle_3_0=ruleTextQuestionStyle();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStyleRule());
            	        }
                   		set(
                   			current, 
                   			"textQuestionStyle",
                    		lv_textQuestionStyle_3_0, 
                    		"TextQuestionStyle");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleStyle"


    // $ANTLR start "entryRulePollStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:161:1: entryRulePollStyle returns [EObject current=null] : iv_rulePollStyle= rulePollStyle EOF ;
    public final EObject entryRulePollStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollStyle = null;


        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:162:2: (iv_rulePollStyle= rulePollStyle EOF )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:163:2: iv_rulePollStyle= rulePollStyle EOF
            {
             newCompositeNode(grammarAccess.getPollStyleRule()); 
            pushFollow(FOLLOW_rulePollStyle_in_entryRulePollStyle230);
            iv_rulePollStyle=rulePollStyle();

            state._fsp--;

             current =iv_rulePollStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePollStyle240); 

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
    // $ANTLR end "entryRulePollStyle"


    // $ANTLR start "rulePollStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:170:1: rulePollStyle returns [EObject current=null] : (otherlv_0= 'PollStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) ;
    public final EObject rulePollStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_color_5_0 = null;

        Enumerator lv_borderType_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:173:28: ( (otherlv_0= 'PollStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:174:1: (otherlv_0= 'PollStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:174:1: (otherlv_0= 'PollStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:174:3: otherlv_0= 'PollStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePollStyle277); 

                	newLeafNode(otherlv_0, grammarAccess.getPollStyleAccess().getPollStyleKeyword_0());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:178:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:179:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:179:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:180:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePollStyle294); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPollStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPollStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePollStyle311); 

                	newLeafNode(otherlv_2, grammarAccess.getPollStyleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_rulePollStyle323); 

                	newLeafNode(otherlv_3, grammarAccess.getPollStyleAccess().getBgColorKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_rulePollStyle335); 

                	newLeafNode(otherlv_4, grammarAccess.getPollStyleAccess().getColonKeyword_4());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:208:1: ( (lv_color_5_0= ruleColorEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:209:1: (lv_color_5_0= ruleColorEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:209:1: (lv_color_5_0= ruleColorEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:210:3: lv_color_5_0= ruleColorEnum
            {
             
            	        newCompositeNode(grammarAccess.getPollStyleAccess().getColorColorEnumEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColorEnum_in_rulePollStyle356);
            lv_color_5_0=ruleColorEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPollStyleRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_5_0, 
                    		"ColorEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_rulePollStyle368); 

                	newLeafNode(otherlv_6, grammarAccess.getPollStyleAccess().getBorderTypeKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_rulePollStyle380); 

                	newLeafNode(otherlv_7, grammarAccess.getPollStyleAccess().getColonKeyword_7());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:234:1: ( (lv_borderType_8_0= ruleBorderTypeEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:235:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:235:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:236:3: lv_borderType_8_0= ruleBorderTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getPollStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBorderTypeEnum_in_rulePollStyle401);
            lv_borderType_8_0=ruleBorderTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPollStyleRule());
            	        }
                   		set(
                   			current, 
                   			"borderType",
                    		lv_borderType_8_0, 
                    		"BorderTypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_rulePollStyle413); 

                	newLeafNode(otherlv_9, grammarAccess.getPollStyleAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "rulePollStyle"


    // $ANTLR start "entryRuleSingleQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:264:1: entryRuleSingleQuestionStyle returns [EObject current=null] : iv_ruleSingleQuestionStyle= ruleSingleQuestionStyle EOF ;
    public final EObject entryRuleSingleQuestionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleQuestionStyle = null;


        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:265:2: (iv_ruleSingleQuestionStyle= ruleSingleQuestionStyle EOF )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:266:2: iv_ruleSingleQuestionStyle= ruleSingleQuestionStyle EOF
            {
             newCompositeNode(grammarAccess.getSingleQuestionStyleRule()); 
            pushFollow(FOLLOW_ruleSingleQuestionStyle_in_entryRuleSingleQuestionStyle449);
            iv_ruleSingleQuestionStyle=ruleSingleQuestionStyle();

            state._fsp--;

             current =iv_ruleSingleQuestionStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSingleQuestionStyle459); 

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
    // $ANTLR end "entryRuleSingleQuestionStyle"


    // $ANTLR start "ruleSingleQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:273:1: ruleSingleQuestionStyle returns [EObject current=null] : (otherlv_0= 'SingleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) ;
    public final EObject ruleSingleQuestionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_color_5_0 = null;

        Enumerator lv_borderType_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:276:28: ( (otherlv_0= 'SingleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:277:1: (otherlv_0= 'SingleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:277:1: (otherlv_0= 'SingleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:277:3: otherlv_0= 'SingleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleSingleQuestionStyle496); 

                	newLeafNode(otherlv_0, grammarAccess.getSingleQuestionStyleAccess().getSingleQuestionStyleKeyword_0());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:282:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:282:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSingleQuestionStyle513); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSingleQuestionStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSingleQuestionStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSingleQuestionStyle530); 

                	newLeafNode(otherlv_2, grammarAccess.getSingleQuestionStyleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSingleQuestionStyle542); 

                	newLeafNode(otherlv_3, grammarAccess.getSingleQuestionStyleAccess().getBgColorKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleSingleQuestionStyle554); 

                	newLeafNode(otherlv_4, grammarAccess.getSingleQuestionStyleAccess().getColonKeyword_4());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:311:1: ( (lv_color_5_0= ruleColorEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:312:1: (lv_color_5_0= ruleColorEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:312:1: (lv_color_5_0= ruleColorEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:313:3: lv_color_5_0= ruleColorEnum
            {
             
            	        newCompositeNode(grammarAccess.getSingleQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColorEnum_in_ruleSingleQuestionStyle575);
            lv_color_5_0=ruleColorEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_5_0, 
                    		"ColorEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleSingleQuestionStyle587); 

                	newLeafNode(otherlv_6, grammarAccess.getSingleQuestionStyleAccess().getBorderTypeKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleSingleQuestionStyle599); 

                	newLeafNode(otherlv_7, grammarAccess.getSingleQuestionStyleAccess().getColonKeyword_7());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:337:1: ( (lv_borderType_8_0= ruleBorderTypeEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:338:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:338:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:339:3: lv_borderType_8_0= ruleBorderTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getSingleQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBorderTypeEnum_in_ruleSingleQuestionStyle620);
            lv_borderType_8_0=ruleBorderTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSingleQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"borderType",
                    		lv_borderType_8_0, 
                    		"BorderTypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleSingleQuestionStyle632); 

                	newLeafNode(otherlv_9, grammarAccess.getSingleQuestionStyleAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleSingleQuestionStyle"


    // $ANTLR start "entryRuleMultipleQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:367:1: entryRuleMultipleQuestionStyle returns [EObject current=null] : iv_ruleMultipleQuestionStyle= ruleMultipleQuestionStyle EOF ;
    public final EObject entryRuleMultipleQuestionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleQuestionStyle = null;


        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:368:2: (iv_ruleMultipleQuestionStyle= ruleMultipleQuestionStyle EOF )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:369:2: iv_ruleMultipleQuestionStyle= ruleMultipleQuestionStyle EOF
            {
             newCompositeNode(grammarAccess.getMultipleQuestionStyleRule()); 
            pushFollow(FOLLOW_ruleMultipleQuestionStyle_in_entryRuleMultipleQuestionStyle668);
            iv_ruleMultipleQuestionStyle=ruleMultipleQuestionStyle();

            state._fsp--;

             current =iv_ruleMultipleQuestionStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultipleQuestionStyle678); 

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
    // $ANTLR end "entryRuleMultipleQuestionStyle"


    // $ANTLR start "ruleMultipleQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:376:1: ruleMultipleQuestionStyle returns [EObject current=null] : (otherlv_0= 'MultipleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) ;
    public final EObject ruleMultipleQuestionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_color_5_0 = null;

        Enumerator lv_borderType_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:379:28: ( (otherlv_0= 'MultipleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:380:1: (otherlv_0= 'MultipleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:380:1: (otherlv_0= 'MultipleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:380:3: otherlv_0= 'MultipleQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleMultipleQuestionStyle715); 

                	newLeafNode(otherlv_0, grammarAccess.getMultipleQuestionStyleAccess().getMultipleQuestionStyleKeyword_0());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:385:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:385:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultipleQuestionStyle732); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMultipleQuestionStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMultipleQuestionStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleMultipleQuestionStyle749); 

                	newLeafNode(otherlv_2, grammarAccess.getMultipleQuestionStyleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleMultipleQuestionStyle761); 

                	newLeafNode(otherlv_3, grammarAccess.getMultipleQuestionStyleAccess().getBgColorKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleMultipleQuestionStyle773); 

                	newLeafNode(otherlv_4, grammarAccess.getMultipleQuestionStyleAccess().getColonKeyword_4());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:414:1: ( (lv_color_5_0= ruleColorEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:415:1: (lv_color_5_0= ruleColorEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:415:1: (lv_color_5_0= ruleColorEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:416:3: lv_color_5_0= ruleColorEnum
            {
             
            	        newCompositeNode(grammarAccess.getMultipleQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColorEnum_in_ruleMultipleQuestionStyle794);
            lv_color_5_0=ruleColorEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_5_0, 
                    		"ColorEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleMultipleQuestionStyle806); 

                	newLeafNode(otherlv_6, grammarAccess.getMultipleQuestionStyleAccess().getBorderTypeKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleMultipleQuestionStyle818); 

                	newLeafNode(otherlv_7, grammarAccess.getMultipleQuestionStyleAccess().getColonKeyword_7());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:440:1: ( (lv_borderType_8_0= ruleBorderTypeEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:441:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:441:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:442:3: lv_borderType_8_0= ruleBorderTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getMultipleQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBorderTypeEnum_in_ruleMultipleQuestionStyle839);
            lv_borderType_8_0=ruleBorderTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultipleQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"borderType",
                    		lv_borderType_8_0, 
                    		"BorderTypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleMultipleQuestionStyle851); 

                	newLeafNode(otherlv_9, grammarAccess.getMultipleQuestionStyleAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleMultipleQuestionStyle"


    // $ANTLR start "entryRuleTextQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:470:1: entryRuleTextQuestionStyle returns [EObject current=null] : iv_ruleTextQuestionStyle= ruleTextQuestionStyle EOF ;
    public final EObject entryRuleTextQuestionStyle() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextQuestionStyle = null;


        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:471:2: (iv_ruleTextQuestionStyle= ruleTextQuestionStyle EOF )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:472:2: iv_ruleTextQuestionStyle= ruleTextQuestionStyle EOF
            {
             newCompositeNode(grammarAccess.getTextQuestionStyleRule()); 
            pushFollow(FOLLOW_ruleTextQuestionStyle_in_entryRuleTextQuestionStyle887);
            iv_ruleTextQuestionStyle=ruleTextQuestionStyle();

            state._fsp--;

             current =iv_ruleTextQuestionStyle; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextQuestionStyle897); 

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
    // $ANTLR end "entryRuleTextQuestionStyle"


    // $ANTLR start "ruleTextQuestionStyle"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:479:1: ruleTextQuestionStyle returns [EObject current=null] : (otherlv_0= 'TextQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) ;
    public final EObject ruleTextQuestionStyle() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_color_5_0 = null;

        Enumerator lv_borderType_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:482:28: ( (otherlv_0= 'TextQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:483:1: (otherlv_0= 'TextQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:483:1: (otherlv_0= 'TextQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}' )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:483:3: otherlv_0= 'TextQuestionStyle' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'bgColor' otherlv_4= ':' ( (lv_color_5_0= ruleColorEnum ) ) otherlv_6= 'borderType' otherlv_7= ':' ( (lv_borderType_8_0= ruleBorderTypeEnum ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTextQuestionStyle934); 

                	newLeafNode(otherlv_0, grammarAccess.getTextQuestionStyleAccess().getTextQuestionStyleKeyword_0());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:487:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:488:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:488:1: (lv_name_1_0= RULE_ID )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:489:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTextQuestionStyle951); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTextQuestionStyleAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTextQuestionStyleRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTextQuestionStyle968); 

                	newLeafNode(otherlv_2, grammarAccess.getTextQuestionStyleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTextQuestionStyle980); 

                	newLeafNode(otherlv_3, grammarAccess.getTextQuestionStyleAccess().getBgColorKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTextQuestionStyle992); 

                	newLeafNode(otherlv_4, grammarAccess.getTextQuestionStyleAccess().getColonKeyword_4());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:517:1: ( (lv_color_5_0= ruleColorEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:518:1: (lv_color_5_0= ruleColorEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:518:1: (lv_color_5_0= ruleColorEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:519:3: lv_color_5_0= ruleColorEnum
            {
             
            	        newCompositeNode(grammarAccess.getTextQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleColorEnum_in_ruleTextQuestionStyle1013);
            lv_color_5_0=ruleColorEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_5_0, 
                    		"ColorEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleTextQuestionStyle1025); 

                	newLeafNode(otherlv_6, grammarAccess.getTextQuestionStyleAccess().getBorderTypeKeyword_6());
                
            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleTextQuestionStyle1037); 

                	newLeafNode(otherlv_7, grammarAccess.getTextQuestionStyleAccess().getColonKeyword_7());
                
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:543:1: ( (lv_borderType_8_0= ruleBorderTypeEnum ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:544:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:544:1: (lv_borderType_8_0= ruleBorderTypeEnum )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:545:3: lv_borderType_8_0= ruleBorderTypeEnum
            {
             
            	        newCompositeNode(grammarAccess.getTextQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleBorderTypeEnum_in_ruleTextQuestionStyle1058);
            lv_borderType_8_0=ruleBorderTypeEnum();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTextQuestionStyleRule());
            	        }
                   		set(
                   			current, 
                   			"borderType",
                    		lv_borderType_8_0, 
                    		"BorderTypeEnum");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_16_in_ruleTextQuestionStyle1070); 

                	newLeafNode(otherlv_9, grammarAccess.getTextQuestionStyleAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleTextQuestionStyle"


    // $ANTLR start "ruleColorEnum"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:573:1: ruleColorEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Azure' ) | (enumLiteral_1= 'Cyan' ) | (enumLiteral_2= 'LavenderBlush' ) | (enumLiteral_3= 'LightGreen' ) | (enumLiteral_4= 'PaleTurquoise' ) ) ;
    public final Enumerator ruleColorEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:575:28: ( ( (enumLiteral_0= 'Azure' ) | (enumLiteral_1= 'Cyan' ) | (enumLiteral_2= 'LavenderBlush' ) | (enumLiteral_3= 'LightGreen' ) | (enumLiteral_4= 'PaleTurquoise' ) ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:576:1: ( (enumLiteral_0= 'Azure' ) | (enumLiteral_1= 'Cyan' ) | (enumLiteral_2= 'LavenderBlush' ) | (enumLiteral_3= 'LightGreen' ) | (enumLiteral_4= 'PaleTurquoise' ) )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:576:1: ( (enumLiteral_0= 'Azure' ) | (enumLiteral_1= 'Cyan' ) | (enumLiteral_2= 'LavenderBlush' ) | (enumLiteral_3= 'LightGreen' ) | (enumLiteral_4= 'PaleTurquoise' ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 22:
                {
                alt1=3;
                }
                break;
            case 23:
                {
                alt1=4;
                }
                break;
            case 24:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:576:2: (enumLiteral_0= 'Azure' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:576:2: (enumLiteral_0= 'Azure' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:576:4: enumLiteral_0= 'Azure'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_20_in_ruleColorEnum1120); 

                            current = grammarAccess.getColorEnumAccess().getAzureEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorEnumAccess().getAzureEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:582:6: (enumLiteral_1= 'Cyan' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:582:6: (enumLiteral_1= 'Cyan' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:582:8: enumLiteral_1= 'Cyan'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_21_in_ruleColorEnum1137); 

                            current = grammarAccess.getColorEnumAccess().getCyanEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorEnumAccess().getCyanEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:588:6: (enumLiteral_2= 'LavenderBlush' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:588:6: (enumLiteral_2= 'LavenderBlush' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:588:8: enumLiteral_2= 'LavenderBlush'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_22_in_ruleColorEnum1154); 

                            current = grammarAccess.getColorEnumAccess().getLavenderBlushEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorEnumAccess().getLavenderBlushEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:594:6: (enumLiteral_3= 'LightGreen' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:594:6: (enumLiteral_3= 'LightGreen' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:594:8: enumLiteral_3= 'LightGreen'
                    {
                    enumLiteral_3=(Token)match(input,23,FOLLOW_23_in_ruleColorEnum1171); 

                            current = grammarAccess.getColorEnumAccess().getLightGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorEnumAccess().getLightGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:600:6: (enumLiteral_4= 'PaleTurquoise' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:600:6: (enumLiteral_4= 'PaleTurquoise' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:600:8: enumLiteral_4= 'PaleTurquoise'
                    {
                    enumLiteral_4=(Token)match(input,24,FOLLOW_24_in_ruleColorEnum1188); 

                            current = grammarAccess.getColorEnumAccess().getPaleTurquoiseEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorEnumAccess().getPaleTurquoiseEnumLiteralDeclaration_4()); 
                        

                    }


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
    // $ANTLR end "ruleColorEnum"


    // $ANTLR start "ruleBorderTypeEnum"
    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:610:1: ruleBorderTypeEnum returns [Enumerator current=null] : ( (enumLiteral_0= 'Box' ) | (enumLiteral_1= 'None' ) | (enumLiteral_2= 'RoundedBox' ) | (enumLiteral_3= 'Dotte' ) ) ;
    public final Enumerator ruleBorderTypeEnum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:612:28: ( ( (enumLiteral_0= 'Box' ) | (enumLiteral_1= 'None' ) | (enumLiteral_2= 'RoundedBox' ) | (enumLiteral_3= 'Dotte' ) ) )
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:613:1: ( (enumLiteral_0= 'Box' ) | (enumLiteral_1= 'None' ) | (enumLiteral_2= 'RoundedBox' ) | (enumLiteral_3= 'Dotte' ) )
            {
            // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:613:1: ( (enumLiteral_0= 'Box' ) | (enumLiteral_1= 'None' ) | (enumLiteral_2= 'RoundedBox' ) | (enumLiteral_3= 'Dotte' ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:613:2: (enumLiteral_0= 'Box' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:613:2: (enumLiteral_0= 'Box' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:613:4: enumLiteral_0= 'Box'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_25_in_ruleBorderTypeEnum1233); 

                            current = grammarAccess.getBorderTypeEnumAccess().getBOXEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBorderTypeEnumAccess().getBOXEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:619:6: (enumLiteral_1= 'None' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:619:6: (enumLiteral_1= 'None' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:619:8: enumLiteral_1= 'None'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_26_in_ruleBorderTypeEnum1250); 

                            current = grammarAccess.getBorderTypeEnumAccess().getNONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBorderTypeEnumAccess().getNONEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:625:6: (enumLiteral_2= 'RoundedBox' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:625:6: (enumLiteral_2= 'RoundedBox' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:625:8: enumLiteral_2= 'RoundedBox'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_27_in_ruleBorderTypeEnum1267); 

                            current = grammarAccess.getBorderTypeEnumAccess().getROUNDEDBOXEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBorderTypeEnumAccess().getROUNDEDBOXEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:631:6: (enumLiteral_3= 'Dotte' )
                    {
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:631:6: (enumLiteral_3= 'Dotte' )
                    // ../fr.istic.m2miage.idm.css/src-gen/fr/istic/m2miage/idm/parser/antlr/internal/InternalCSS.g:631:8: enumLiteral_3= 'Dotte'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_28_in_ruleBorderTypeEnum1284); 

                            current = grammarAccess.getBorderTypeEnumAccess().getDotteEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBorderTypeEnumAccess().getDotteEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleBorderTypeEnum"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStyle_in_entryRuleStyle75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStyle85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePollStyle_in_ruleStyle131 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ruleSingleQuestionStyle_in_ruleStyle152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleMultipleQuestionStyle_in_ruleStyle173 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTextQuestionStyle_in_ruleStyle194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePollStyle_in_entryRulePollStyle230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePollStyle240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePollStyle277 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePollStyle294 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePollStyle311 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePollStyle323 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePollStyle335 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleColorEnum_in_rulePollStyle356 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_rulePollStyle368 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_rulePollStyle380 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleBorderTypeEnum_in_rulePollStyle401 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_rulePollStyle413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSingleQuestionStyle_in_entryRuleSingleQuestionStyle449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSingleQuestionStyle459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleSingleQuestionStyle496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSingleQuestionStyle513 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSingleQuestionStyle530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSingleQuestionStyle542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSingleQuestionStyle554 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleColorEnum_in_ruleSingleQuestionStyle575 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSingleQuestionStyle587 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSingleQuestionStyle599 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleBorderTypeEnum_in_ruleSingleQuestionStyle620 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleSingleQuestionStyle632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultipleQuestionStyle_in_entryRuleMultipleQuestionStyle668 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultipleQuestionStyle678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleMultipleQuestionStyle715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultipleQuestionStyle732 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleMultipleQuestionStyle749 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMultipleQuestionStyle761 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMultipleQuestionStyle773 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleColorEnum_in_ruleMultipleQuestionStyle794 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleMultipleQuestionStyle806 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMultipleQuestionStyle818 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleBorderTypeEnum_in_ruleMultipleQuestionStyle839 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleMultipleQuestionStyle851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextQuestionStyle_in_entryRuleTextQuestionStyle887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextQuestionStyle897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTextQuestionStyle934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTextQuestionStyle951 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTextQuestionStyle968 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTextQuestionStyle980 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTextQuestionStyle992 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_ruleColorEnum_in_ruleTextQuestionStyle1013 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleTextQuestionStyle1025 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTextQuestionStyle1037 = new BitSet(new long[]{0x000000001E000000L});
    public static final BitSet FOLLOW_ruleBorderTypeEnum_in_ruleTextQuestionStyle1058 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTextQuestionStyle1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleColorEnum1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleColorEnum1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleColorEnum1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleColorEnum1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleColorEnum1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBorderTypeEnum1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBorderTypeEnum1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleBorderTypeEnum1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBorderTypeEnum1284 = new BitSet(new long[]{0x0000000000000002L});

}