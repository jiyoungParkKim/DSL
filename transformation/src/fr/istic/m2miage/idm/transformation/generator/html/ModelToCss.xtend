package fr.istic.m2miage.idm.transformation.generator.html

import fr.istic.m2miage.idm.cSS.Style
import fr.istic.m2miage.idm.uimm.BorderStyle
import fr.istic.m2miage.idm.uimm.Component

class ModelToCss {
	def static generate(Style s) '''
	<style type="text/css">
		div {
			margin: 5px;
			padding: 5px;
		}
	</style>
	'''
	def static getStyle(Component c){
		var String color = "background-color:" + c.bgColor + ";";
		var String border = getBorderType(c.borderStyle).toString;
		return color + border
	}
	
	def static getBorderType(BorderStyle style) {
		switch style {
			case BOX : 
				return "border:solid gray 1px;"
			case DOTTE : 
				return "border:dotted gray 1px;"
			case ROUNDED_BOX : 
				return "border:solid gray 1px;border-radius:15px;"
			case NONE :
				return ""
		}
	}
	
}