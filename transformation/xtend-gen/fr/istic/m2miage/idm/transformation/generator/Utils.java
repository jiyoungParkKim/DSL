package fr.istic.m2miage.idm.transformation.generator;

import fr.istic.m2miage.idm.CSSStandaloneSetupGenerated;
import fr.istic.m2miage.idm.PollSystemStandaloneSetupGenerated;
import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.pollSystem.PollSystem;
import fr.istic.m2miage.idm.uimm.BorderStyle;
import fr.istic.m2miage.idm.uimm.Color;
import fr.istic.m2miage.idm.uimm.Component;
import fr.istic.m2miage.idm.uimm.Element;
import fr.istic.m2miage.idm.uimm.ListComponent;
import fr.istic.m2miage.idm.uimm.Option;
import fr.istic.m2miage.idm.uimm.OptionType;
import fr.istic.m2miage.idm.uimm.Page;
import fr.istic.m2miage.idm.uimm.UimmPackage;
import java.io.File;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Utils {
  public static PollSystem loadPollSystem(final URI uri) {
    PollSystem _xblockexpression = null;
    {
      PollSystemStandaloneSetupGenerated _pollSystemStandaloneSetupGenerated = new PollSystemStandaloneSetupGenerated();
      _pollSystemStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource pollSystem = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = pollSystem.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((PollSystem) _get);
    }
    return _xblockexpression;
  }
  
  public static Style loadStyle(final URI uri) {
    Style _xblockexpression = null;
    {
      CSSStandaloneSetupGenerated _cSSStandaloneSetupGenerated = new CSSStandaloneSetupGenerated();
      _cSSStandaloneSetupGenerated.createInjectorAndDoEMFRegistration();
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      Resource css = _resourceSetImpl.getResource(uri, true);
      EList<EObject> _contents = css.getContents();
      EObject _get = _contents.get(0);
      _xblockexpression = ((Style) _get);
    }
    return _xblockexpression;
  }
  
  public static void saveUiModel(final URI uri, final Page poll) {
    try {
      Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
      Map<String, Object> m = reg.getExtensionToFactoryMap();
      XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
      m.put("xmi", _xMIResourceFactoryImpl);
      ResourceSet resSet = new ResourceSetImpl();
      Resource rs = resSet.createResource(uri);
      EList<EObject> _contents = rs.getContents();
      _contents.add(poll);
      rs.save(Collections.EMPTY_MAP);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static Page loadUiModel(final URI uri) {
    UimmPackage.eINSTANCE.eClass();
    Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
    Map<String, Object> m = reg.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    m.put("xmi", _xMIResourceFactoryImpl);
    ResourceSet resSet = new ResourceSetImpl();
    Resource resource = resSet.getResource(uri, true);
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    Page page = ((Page) _get);
    return page;
  }
  
  public static void saveAsFile(final CharSequence content, final URI uri) {
    try {
      File _file = new File("");
      String _absolutePath = _file.getAbsolutePath();
      String _plus = (_absolutePath + "/");
      String _devicePath = uri.devicePath();
      String filePath = (_plus + _devicePath);
      PrintWriter out = new PrintWriter(filePath);
      out.println(content);
      out.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void print(final Page page) {
    String _title = page.getTitle();
    InputOutput.<String>println(_title);
    EList<Component> _components = page.getComponents();
    final Consumer<Component> _function = new Consumer<Component>() {
      public void accept(final Component poll) {
        InputOutput.<String>print("\t");
        String _name = poll.getName();
        String _plus = ("Poll name = " + _name);
        InputOutput.<String>print(_plus);
        String _description = poll.getDescription();
        String _plus_1 = (", description = " + _description);
        InputOutput.<String>print(_plus_1);
        BorderStyle _borderStyle = poll.getBorderStyle();
        String _plus_2 = (", borderType = " + _borderStyle);
        InputOutput.<String>print(_plus_2);
        Color _bgColor = poll.getBgColor();
        String _plus_3 = (", bgColor = " + _bgColor);
        InputOutput.<String>print(_plus_3);
        EList<Component> _components = poll.getComponents();
        int _size = _components.size();
        String _plus_4 = (", question count = " + Integer.valueOf(_size));
        InputOutput.<String>print(_plus_4);
        EList<Component> _components_1 = poll.getComponents();
        final Consumer<Component> _function = new Consumer<Component>() {
          public void accept(final Component question) {
            InputOutput.<String>print("\n\t\t");
            String _name = question.getName();
            String _plus = ("Question name = " + _name);
            InputOutput.<String>print(_plus);
            BorderStyle _borderStyle = question.getBorderStyle();
            String _plus_1 = (", borderType = " + _borderStyle);
            InputOutput.<String>print(_plus_1);
            Color _bgColor = question.getBgColor();
            String _plus_2 = (", bgColor = " + _bgColor);
            InputOutput.<String>print(_plus_2);
            if ((question instanceof ListComponent)) {
              EList<Element> _elements = ((ListComponent) question).getElements();
              int _size = _elements.size();
              String _plus_3 = (", option count = " + Integer.valueOf(_size));
              InputOutput.<String>print(_plus_3);
              EList<Element> _elements_1 = ((ListComponent) question).getElements();
              final Consumer<Element> _function = new Consumer<Element>() {
                public void accept(final Element option) {
                  InputOutput.<String>print("\n\t\t\t");
                  String _name = option.getName();
                  String _plus = ("Option name = " + _name);
                  InputOutput.<String>print(_plus);
                  String _text = option.getText();
                  String _plus_1 = (", Option value = " + _text);
                  InputOutput.<String>print(_plus_1);
                  OptionType _type = ((Option) option).getType();
                  String _plus_2 = (", Option name = " + _type);
                  InputOutput.<String>print(_plus_2);
                }
              };
              _elements_1.forEach(_function);
            }
          }
        };
        _components_1.forEach(_function);
        InputOutput.<String>print("\n\n");
      }
    };
    _components.forEach(_function);
    InputOutput.<String>println("============================================================================================");
  }
}
