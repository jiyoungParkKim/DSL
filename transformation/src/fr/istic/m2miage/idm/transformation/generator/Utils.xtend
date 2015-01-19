package fr.istic.m2miage.idm.transformation.generator

import fr.istic.m2miage.idm.CSSStandaloneSetupGenerated
import fr.istic.m2miage.idm.PollSystemStandaloneSetupGenerated
import fr.istic.m2miage.idm.cSS.Style
import fr.istic.m2miage.idm.pollSystem.PollSystem
import fr.istic.m2miage.idm.uimm.ListComponent
import fr.istic.m2miage.idm.uimm.Option
import fr.istic.m2miage.idm.uimm.Page
import fr.istic.m2miage.idm.uimm.UimmPackage
import java.io.File
import java.io.PrintWriter
import java.util.Collections
import java.util.Map
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

class Utils {
	def static loadPollSystem (URI uri){
		new PollSystemStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var pollSystem = new ResourceSetImpl().getResource(uri, true)
		pollSystem.contents.get(0) as PollSystem
	}
	
	def static loadStyle(URI uri) {
		new CSSStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var css = new ResourceSetImpl().getResource(uri, true)
		css.contents.get(0) as Style
	}
	
	def static saveUiModel(URI uri, Page poll){
		// Register the XMI resource factory
		var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    var Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
	    var ResourceSet resSet = new ResourceSetImpl();
	    // create a resource
		var Resource rs = resSet.createResource(uri);
		// Get the first model element and cast it to the right type
		rs.getContents.add(poll);
		rs.save(Collections.EMPTY_MAP);
	}
	
	def static loadUiModel(URI uri){
		// Initialize the model
		UimmPackage.eINSTANCE.eClass();
		// Register the XMI resource factory
		var Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
	    var Map<String, Object> m = reg.getExtensionToFactoryMap();
	    m.put("xmi", new XMIResourceFactoryImpl());
	    // Obtain a new resource set
		var  ResourceSet resSet = new ResourceSetImpl();
		// Get the resource
		var Resource resource = resSet.getResource(uri, true);
		// Get the first model element and cast it to the right type
		var Page page = resource.contents.get(0) as Page;
		return page
	}
	
	def static saveAsFile(CharSequence content, URI uri){
		var String filePath = new File("").getAbsolutePath() + "/" + uri.devicePath
		var PrintWriter out = new PrintWriter(filePath);
		out.println(content);
		out.close
	}
	
	def static void print(Page page) {
		println(page.title)
		page.components.forEach[poll | {
			print("\t")
			print("Poll name = " + poll.name)
			print(", description = " + poll.description)
			print(", borderType = " + poll.borderStyle)
			print(", bgColor = " + poll.bgColor)
			print(", question count = " + poll.components.size)
			
			poll.components.forEach[ question | {
				print("\n\t\t")
				print("Question name = " + question.name)
				print(", borderType = " + question.borderStyle)
				print(", bgColor = " + question.bgColor)
				
				if(question instanceof ListComponent){
					print(", option count = " + (question as ListComponent).elements.size)
						(question as ListComponent).elements.forEach[ option | {				
						print("\n\t\t\t")
						print("Option name = " + option.name)
						print(", Option value = " + option.text)
						print(", Option name = " + (option as Option).type)
					}]
				}
			}]
			print("\n\n")
		}]
		println("============================================================================================")
	}

}