package fr.istic.m2miage.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.m2miage.idm.cSS.CSSPackage;
import fr.istic.m2miage.idm.cSS.MultipleQuestionStyle;
import fr.istic.m2miage.idm.cSS.PollStyle;
import fr.istic.m2miage.idm.cSS.SingleQuestionStyle;
import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.cSS.TextQuestionStyle;
import fr.istic.m2miage.idm.services.CSSGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CSSSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CSSGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CSSPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CSSPackage.MULTIPLE_QUESTION_STYLE:
				if(context == grammarAccess.getMultipleQuestionStyleRule()) {
					sequence_MultipleQuestionStyle(context, (MultipleQuestionStyle) semanticObject); 
					return; 
				}
				else break;
			case CSSPackage.POLL_STYLE:
				if(context == grammarAccess.getPollStyleRule()) {
					sequence_PollStyle(context, (PollStyle) semanticObject); 
					return; 
				}
				else break;
			case CSSPackage.SINGLE_QUESTION_STYLE:
				if(context == grammarAccess.getSingleQuestionStyleRule()) {
					sequence_SingleQuestionStyle(context, (SingleQuestionStyle) semanticObject); 
					return; 
				}
				else break;
			case CSSPackage.STYLE:
				if(context == grammarAccess.getStyleRule()) {
					sequence_Style(context, (Style) semanticObject); 
					return; 
				}
				else break;
			case CSSPackage.TEXT_QUESTION_STYLE:
				if(context == grammarAccess.getTextQuestionStyleRule()) {
					sequence_TextQuestionStyle(context, (TextQuestionStyle) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID color=ColorEnum borderType=BorderTypeEnum)
	 */
	protected void sequence_MultipleQuestionStyle(EObject context, MultipleQuestionStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__COLOR));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__BORDER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.MULTIPLE_QUESTION_STYLE__BORDER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultipleQuestionStyleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMultipleQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getMultipleQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0(), semanticObject.getBorderType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID color=ColorEnum borderType=BorderTypeEnum)
	 */
	protected void sequence_PollStyle(EObject context, PollStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.POLL_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.POLL_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.POLL_STYLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.POLL_STYLE__COLOR));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.POLL_STYLE__BORDER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.POLL_STYLE__BORDER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPollStyleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPollStyleAccess().getColorColorEnumEnumRuleCall_5_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getPollStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0(), semanticObject.getBorderType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID color=ColorEnum borderType=BorderTypeEnum)
	 */
	protected void sequence_SingleQuestionStyle(EObject context, SingleQuestionStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__COLOR));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__BORDER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.SINGLE_QUESTION_STYLE__BORDER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleQuestionStyleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getSingleQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0(), semanticObject.getBorderType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (pollStyle=PollStyle singleQuestionStyle=SingleQuestionStyle multipleQuestionStyle=MultipleQuestionStyle textQuestionStyle=TextQuestionStyle)
	 */
	protected void sequence_Style(EObject context, Style semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.STYLE__POLL_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.STYLE__POLL_STYLE));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.STYLE__SINGLE_QUESTION_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.STYLE__SINGLE_QUESTION_STYLE));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.STYLE__MULTIPLE_QUESTION_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.STYLE__MULTIPLE_QUESTION_STYLE));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.STYLE__TEXT_QUESTION_STYLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.STYLE__TEXT_QUESTION_STYLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStyleAccess().getPollStylePollStyleParserRuleCall_0_0(), semanticObject.getPollStyle());
		feeder.accept(grammarAccess.getStyleAccess().getSingleQuestionStyleSingleQuestionStyleParserRuleCall_1_0(), semanticObject.getSingleQuestionStyle());
		feeder.accept(grammarAccess.getStyleAccess().getMultipleQuestionStyleMultipleQuestionStyleParserRuleCall_2_0(), semanticObject.getMultipleQuestionStyle());
		feeder.accept(grammarAccess.getStyleAccess().getTextQuestionStyleTextQuestionStyleParserRuleCall_3_0(), semanticObject.getTextQuestionStyle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID color=ColorEnum borderType=BorderTypeEnum)
	 */
	protected void sequence_TextQuestionStyle(EObject context, TextQuestionStyle semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__NAME));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__COLOR));
			if(transientValues.isValueTransient(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__BORDER_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CSSPackage.Literals.TEXT_QUESTION_STYLE__BORDER_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextQuestionStyleAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextQuestionStyleAccess().getColorColorEnumEnumRuleCall_5_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getTextQuestionStyleAccess().getBorderTypeBorderTypeEnumEnumRuleCall_8_0(), semanticObject.getBorderType());
		feeder.finish();
	}
}
