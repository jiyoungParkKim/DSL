package fr.istic.m2miage.idm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.istic.m2miage.idm.pollSystem.ImageQuestion;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.Poll;
import fr.istic.m2miage.idm.pollSystem.PollSystem;
import fr.istic.m2miage.idm.pollSystem.PollSystemPackage;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.TextQuestion;
import fr.istic.m2miage.idm.services.PollSystemGrammarAccess;
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
public class PollSystemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PollSystemGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PollSystemPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PollSystemPackage.IMAGE_QUESTION:
				if(context == grammarAccess.getImageQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_ImageQuestion(context, (ImageQuestion) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.MULTIPLE_CHOICE_OPTION:
				if(context == grammarAccess.getMultipleChoiceOptionRule() ||
				   context == grammarAccess.getQuestionOptionRule()) {
					sequence_MultipleChoiceOption(context, (MultipleChoiceOption) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.MULTIPLE_CHOICE_QUESTION:
				if(context == grammarAccess.getMultipleChoiceQuestionRule() ||
				   context == grammarAccess.getQuestionRule()) {
					sequence_MultipleChoiceQuestion(context, (MultipleChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.POLL:
				if(context == grammarAccess.getPollRule()) {
					sequence_Poll(context, (Poll) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.POLL_SYSTEM:
				if(context == grammarAccess.getPollSystemRule()) {
					sequence_PollSystem(context, (PollSystem) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.SINGLE_CHOICE_OPTION:
				if(context == grammarAccess.getQuestionOptionRule() ||
				   context == grammarAccess.getSingleChoiceOptionRule()) {
					sequence_SingleChoiceOption(context, (SingleChoiceOption) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.SINGLE_CHOICE_QUESTION:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getSingleChoiceQuestionRule()) {
					sequence_SingleChoiceQuestion(context, (SingleChoiceQuestion) semanticObject); 
					return; 
				}
				else break;
			case PollSystemPackage.TEXT_QUESTION:
				if(context == grammarAccess.getQuestionRule() ||
				   context == grammarAccess.getTextQuestionRule()) {
					sequence_TextQuestion(context, (TextQuestion) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING imagePath=STRING)
	 */
	protected void sequence_ImageQuestion(EObject context, ImageQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION__TEXT));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.IMAGE_QUESTION__IMAGE_PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.IMAGE_QUESTION__IMAGE_PATH));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getImageQuestionAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.accept(grammarAccess.getImageQuestionAccess().getImagePathSTRINGTerminalRuleCall_7_0(), semanticObject.getImagePath());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID option=STRING value=STRING)
	 */
	protected void sequence_MultipleChoiceOption(EObject context, MultipleChoiceOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__OPTION));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultipleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMultipleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0(), semanticObject.getOption());
		feeder.accept(grammarAccess.getMultipleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING options+=MultipleChoiceOption+)
	 */
	protected void sequence_MultipleChoiceQuestion(EObject context, MultipleChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID polls+=Poll+)
	 */
	protected void sequence_PollSystem(EObject context, PollSystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID description=STRING? questions+=Question+)
	 */
	protected void sequence_Poll(EObject context, Poll semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID option=STRING value=STRING)
	 */
	protected void sequence_SingleChoiceOption(EObject context, SingleChoiceOption semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__OPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__OPTION));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION_OPTION__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSingleChoiceOptionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSingleChoiceOptionAccess().getOptionSTRINGTerminalRuleCall_4_0(), semanticObject.getOption());
		feeder.accept(grammarAccess.getSingleChoiceOptionAccess().getValueSTRINGTerminalRuleCall_7_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING options+=SingleChoiceOption+)
	 */
	protected void sequence_SingleChoiceQuestion(EObject context, SingleChoiceQuestion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID text=STRING)
	 */
	protected void sequence_TextQuestion(EObject context, TextQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION__NAME));
			if(transientValues.isValueTransient(semanticObject, PollSystemPackage.Literals.QUESTION__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PollSystemPackage.Literals.QUESTION__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextQuestionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getTextQuestionAccess().getTextSTRINGTerminalRuleCall_4_0(), semanticObject.getText());
		feeder.finish();
	}
}
