/**
 *
 * $Id$
 */
package fr.istic.m2miage.idm.uimm.validation;

import fr.istic.m2miage.idm.uimm.BorderStyle;
import fr.istic.m2miage.idm.uimm.Color;
import fr.istic.m2miage.idm.uimm.Component;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link fr.istic.m2miage.idm.uimm.Component}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ComponentValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateDescription(String value);
	boolean validateBorderStyle(BorderStyle value);
	boolean validateBgColor(Color value);
	boolean validateComponents(EList<Component> value);
}
