/*
 * generated by Xtext
 */
package fr.istic.m2miage.idm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCSSValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.istic.m2miage.idm.cSS.CSSPackage.eINSTANCE);
		return result;
	}
}
