package fr.istic.m2miage.idm.transformation.generator

import fr.istic.m2miage.idm.cSS.Style
import fr.istic.m2miage.idm.pollSystem.ImageQuestion
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion
import fr.istic.m2miage.idm.pollSystem.Poll
import fr.istic.m2miage.idm.pollSystem.PollSystem
import fr.istic.m2miage.idm.pollSystem.Question
import fr.istic.m2miage.idm.pollSystem.QuestionOption
import fr.istic.m2miage.idm.pollSystem.SingleChoiceOption
import fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion
import fr.istic.m2miage.idm.pollSystem.TextQuestion
import fr.istic.m2miage.idm.uimm.BorderStyle
import fr.istic.m2miage.idm.uimm.Color
import fr.istic.m2miage.idm.uimm.Component
import fr.istic.m2miage.idm.uimm.ImageComponent
import fr.istic.m2miage.idm.uimm.ListComponent
import fr.istic.m2miage.idm.uimm.Option
import fr.istic.m2miage.idm.uimm.OptionType
import fr.istic.m2miage.idm.uimm.Page
import fr.istic.m2miage.idm.uimm.TextComponent
import fr.istic.m2miage.idm.uimm.UimmFactory

class ModelToModel {
	var PollSystem pollSystem;
	var Style pollSystemStyle;
	var Page page;
	var UimmFactory factory = UimmFactory.eINSTANCE;
	
	new(PollSystem system, Style style) {
		this.pollSystem = system;
		this.pollSystemStyle = style;
		this.page = factory.createPage;
	}
	
	def Page generatePage() {
		page.title = pollSystem.name;
		pollSystem.polls.forEach[ poll | {
			page.components.add(pollToComponent(poll))
		}]
		return page
	}
	
	def Component pollToComponent(Poll poll) {
		var Component component = factory.createComponent
		
		component.name = poll.name
		component.description = poll.description
		
		component.bgColor = Color.get(pollSystemStyle.pollStyle.color.literal)
		component.borderStyle = BorderStyle.get(pollSystemStyle.pollStyle.borderType.literal)
		component.initComponents
		for(Question question : poll.questions){
			component.components.add(questionToComponent(question))
		}
		return component;
	}
	
	def Component questionToComponent(Question q) {
		if(q instanceof TextQuestion){
			return textQuestionToComponent(q)
		} else if(q instanceof SingleChoiceQuestion){
			return singleChoiceQuestionToComponent(q)
		} else if(q instanceof MultipleChoiceQuestion){
			return multipleChoiceQuestionToComponent(q)
		} else if(q instanceof ImageQuestion){
			return imageQuestionToComponent(q)
		} 
		return null;
	}
	
	def Component textQuestionToComponent(TextQuestion q){
		var TextComponent component = factory.createTextComponent
		component.name = q.name
		component.text = q.text
		component.bgColor = Color.get(pollSystemStyle.textQuestionStyle.color.literal)
		component.borderStyle = BorderStyle.get(pollSystemStyle.singleQuestionStyle.borderType.literal)
		return component
	}
	
	def Component imageQuestionToComponent(ImageQuestion q){
		var ImageComponent component = factory.createImageComponent
		component.name = q.name
		component.text = q.text
		component.src = q.imagePath
		component.bgColor = Color.get(pollSystemStyle.textQuestionStyle.color.literal)
		component.borderStyle = BorderStyle.get(pollSystemStyle.singleQuestionStyle.borderType.literal)
		return component
	}
	
	def Component singleChoiceQuestionToComponent(SingleChoiceQuestion q){
		var ListComponent component = factory.createListComponent
		component.name = q.name
		component.text = q.text
		component.bgColor = Color.get(pollSystemStyle.singleQuestionStyle.color.literal)
		component.borderStyle = BorderStyle.get(pollSystemStyle.singleQuestionStyle.borderType.literal)
		for(SingleChoiceOption o : q.options){
			var Option e = optionToElement(o)
			e.type = OptionType.RADIO
			component.elements.add(e)
		}
		return component
	}
	
	def Component multipleChoiceQuestionToComponent(MultipleChoiceQuestion q){
		var ListComponent component = factory.createListComponent
		component.name = q.name
		component.text = q.text
		component.bgColor = Color.get(pollSystemStyle.multipleQuestionStyle.color.literal)
		component.borderStyle = BorderStyle.get(pollSystemStyle.multipleQuestionStyle.borderType.literal)
		for(MultipleChoiceOption o : q.options){
			var Option e = optionToElement(o)
			e.type = OptionType.CHECK_BOX
			component.elements.add(e)
		}
		return component
	}
	
	def Option optionToElement(QuestionOption option) {
		var Option e = factory.createOption;
		e.name = option.name
		e.value = option.value
		e.text = option.option
		return e;
	}
	
}