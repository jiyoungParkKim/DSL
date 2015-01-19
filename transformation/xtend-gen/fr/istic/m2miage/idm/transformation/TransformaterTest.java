package fr.istic.m2miage.idm.transformation;

import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.pollSystem.PollSystem;
import fr.istic.m2miage.idm.transformation.generator.ModelToModel;
import fr.istic.m2miage.idm.transformation.generator.Utils;
import fr.istic.m2miage.idm.transformation.generator.android.ModelToAndroid;
import fr.istic.m2miage.idm.transformation.generator.android.UtilityClassGenerator;
import fr.istic.m2miage.idm.transformation.generator.html.ModelToHtml;
import fr.istic.m2miage.idm.uimm.Page;
import org.eclipse.emf.common.util.URI;
import org.junit.Test;

@SuppressWarnings("all")
public class TransformaterTest {
  private URI model = URI.createURI("resources/PollSystem.ps");
  
  private URI style = URI.createURI("resources/Style.css");
  
  private URI xmi = URI.createURI("output/xmi/PollSystem.xmi");
  
  @Test
  public void generateAll() {
    this.generateXmiModel();
    this.generateHtmlFile();
    this.generateAndroidClasses();
  }
  
  @Test
  public void generateXmiModel() {
    PollSystem pollsystem = Utils.loadPollSystem(this.model);
    Style style = Utils.loadStyle(this.style);
    ModelToModel generator = new ModelToModel(pollsystem, style);
    Page _generatePage = generator.generatePage();
    Utils.saveUiModel(this.xmi, _generatePage);
  }
  
  @Test
  public void generateHtmlFile() {
    Page p = Utils.loadUiModel(this.xmi);
    Style s = Utils.loadStyle(this.style);
    ModelToHtml modelToHtml = new ModelToHtml(p, s);
    CharSequence html = modelToHtml.toHtml();
    String _title = p.getTitle();
    String _plus = ("output/html/" + _title);
    String _plus_1 = (_plus + ".html");
    URI _createURI = URI.createURI(_plus_1);
    Utils.saveAsFile(html, _createURI);
  }
  
  @Test
  public void generateAndroidClasses() {
    Page p = Utils.loadUiModel(this.xmi);
    ModelToAndroid classGenerator = new ModelToAndroid(p);
    CharSequence java = classGenerator.createJavaClass("com.example.fr.istic.m2miage.idm.pollsystemandroid");
    String _title = p.getTitle();
    String _plus = ("output/android/" + _title);
    String _plus_1 = (_plus + ".java");
    URI _createURI = URI.createURI(_plus_1);
    Utils.saveAsFile(java, _createURI);
    CharSequence utilclass = UtilityClassGenerator.createUtilityClass();
    URI _createURI_1 = URI.createURI("output/android/PollSystemUtils.java");
    Utils.saveAsFile(utilclass, _createURI_1);
  }
}
