package fr.istic.m2miage.idm.transformation

import fr.istic.m2miage.idm.cSS.Style
import fr.istic.m2miage.idm.pollSystem.PollSystem
import fr.istic.m2miage.idm.transformation.generator.ModelToModel
import fr.istic.m2miage.idm.transformation.generator.Utils
import fr.istic.m2miage.idm.transformation.generator.android.ModelToAndroid
import fr.istic.m2miage.idm.transformation.generator.android.UtilityClassGenerator
import fr.istic.m2miage.idm.transformation.generator.html.ModelToHtml
import fr.istic.m2miage.idm.uimm.Page
import org.eclipse.emf.common.util.URI
import org.junit.Test

class TransformaterTest {
	
	private URI model = URI.createURI("resources/PollSystem.ps");
	private URI style = URI.createURI("resources/Style.css");
	private URI xmi = URI.createURI("output/xmi/PollSystem.xmi");

	
	@Test
	def generateAll(){
		// Generate XMI Model
		generateXmiModel
		
		// Generate Html 
		generateHtmlFile
		
		// Generate Android java classes
		generateAndroidClasses
	}
	
	@Test
	def generateXmiModel(){
		var PollSystem pollsystem = Utils.loadPollSystem(model)
		var Style style = Utils.loadStyle(style)
		var ModelToModel generator = new ModelToModel(pollsystem, style)
		
		// Generate XMI file
		Utils.saveUiModel(xmi, generator.generatePage())
	}
	
	@Test
	def generateHtmlFile(){
		var Page p = Utils.loadUiModel(xmi)
		var Style s = Utils.loadStyle(style);
		var ModelToHtml modelToHtml = new ModelToHtml(p, s);
		var CharSequence html = modelToHtml.toHtml
		Utils.saveAsFile(html,  URI.createURI("output/html/"+p.title+".html"));
	}
	
	@Test
	def generateAndroidClasses(){
		var Page p = Utils.loadUiModel(xmi)
		var ModelToAndroid classGenerator = new ModelToAndroid(p);
		
		var CharSequence java = classGenerator.createJavaClass("com.example.fr.istic.m2miage.idm.pollsystemandroid")
		Utils.saveAsFile(java,  URI.createURI("output/android/"+ p.title +".java"));
		
		var CharSequence utilclass = UtilityClassGenerator.createUtilityClass;
		Utils.saveAsFile(utilclass,  URI.createURI("output/android/PollSystemUtils.java"));
	}
	
}