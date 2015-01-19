package fr.istic.m2miage.idm.transformation.generator.html

import fr.istic.m2miage.idm.cSS.Style
import fr.istic.m2miage.idm.uimm.Component
import fr.istic.m2miage.idm.uimm.ImageComponent
import fr.istic.m2miage.idm.uimm.ListComponent
import fr.istic.m2miage.idm.uimm.Option
import fr.istic.m2miage.idm.uimm.Page
import fr.istic.m2miage.idm.uimm.TextComponent

class ModelToHtml {
	var Page p;
	var Style s;
	new(Page page, Style style){
		this.p = page;
		this.s = style;
	}
	
	def toHtml() '''
		<html>
		«header»
		«body»
		«footer»
		</html>
	'''
	
	def body() '''
		<body>
		«FOR poll : p.components»
		    «printPoll(poll)»
		«ENDFOR»
		</body>
	'''
	
	def printPoll(Component poll) '''
		<div style="«ModelToCss.getStyle(poll)»">
		    <p id="«poll.name»">«poll.description»</p>
		  «FOR question : poll.components»
		    «printQuestion(question)»
		  «ENDFOR»
		</div>
	'''
	
	def printQuestion(Component q) {
		if(q instanceof ImageComponent){
			printImageComponent(q)
		} else if(q instanceof ListComponent){
			printListComponent(q)
		} else if(q instanceof TextComponent){
			printTextComponent(q)
		}
	}
	
	def printListComponent(ListComponent q) '''
		<div style="«ModelToCss.getStyle(q)»">
		    «q.text»<br>
		«FOR option: q.elements»
		«var Option o = option as Option»
		    <input type="«o.type»" value="«o.value»" name="«q.name»">«o.text»</input><br>
		«ENDFOR»
		</div>
	'''
	
	def printImageComponent(ImageComponent q) '''
		<div style="«ModelToCss.getStyle(q)»">
		    «q.text»<br>
		    <img src="«q.src».png"></img><br>
		    <input type="text" id="«q.name»">
		</div>
	'''
	
	def printTextComponent(TextComponent q) '''
		<div style="«ModelToCss.getStyle(q)»">
		    «q.text»<br>
		    <input type="text" id="«q.name»">
		</div>
	'''
	
	def footer() '''
		<footer>footer</footer>
	'''

	def header() '''
	<header>
	    <style type="text/css">
	    div {
	        margin: 5px;
	        padding: 5px;
	    }
	    </style>
	    <title>«p.title»</title>
	</header>
	'''

}