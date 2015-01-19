package fr.istic.m2miage.idm.transformation.generator;

import fr.istic.m2miage.idm.cSS.BorderTypeEnum;
import fr.istic.m2miage.idm.cSS.ColorEnum;
import fr.istic.m2miage.idm.cSS.MultipleQuestionStyle;
import fr.istic.m2miage.idm.cSS.PollStyle;
import fr.istic.m2miage.idm.cSS.SingleQuestionStyle;
import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.cSS.TextQuestionStyle;
import fr.istic.m2miage.idm.pollSystem.ImageQuestion;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.MultipleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.Poll;
import fr.istic.m2miage.idm.pollSystem.PollSystem;
import fr.istic.m2miage.idm.pollSystem.Question;
import fr.istic.m2miage.idm.pollSystem.QuestionOption;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceOption;
import fr.istic.m2miage.idm.pollSystem.SingleChoiceQuestion;
import fr.istic.m2miage.idm.pollSystem.TextQuestion;
import fr.istic.m2miage.idm.uimm.BorderStyle;
import fr.istic.m2miage.idm.uimm.Color;
import fr.istic.m2miage.idm.uimm.Component;
import fr.istic.m2miage.idm.uimm.Element;
import fr.istic.m2miage.idm.uimm.ImageComponent;
import fr.istic.m2miage.idm.uimm.ListComponent;
import fr.istic.m2miage.idm.uimm.Option;
import fr.istic.m2miage.idm.uimm.OptionType;
import fr.istic.m2miage.idm.uimm.Page;
import fr.istic.m2miage.idm.uimm.TextComponent;
import fr.istic.m2miage.idm.uimm.UimmFactory;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;

@SuppressWarnings("all")
public class ModelToModel {
  private PollSystem pollSystem;
  
  private Style pollSystemStyle;
  
  private Page page;
  
  private UimmFactory factory = UimmFactory.eINSTANCE;
  
  public ModelToModel(final PollSystem system, final Style style) {
    this.pollSystem = system;
    this.pollSystemStyle = style;
    Page _createPage = this.factory.createPage();
    this.page = _createPage;
  }
  
  public Page generatePage() {
    String _name = this.pollSystem.getName();
    this.page.setTitle(_name);
    EList<Poll> _polls = this.pollSystem.getPolls();
    final Consumer<Poll> _function = new Consumer<Poll>() {
      public void accept(final Poll poll) {
        EList<Component> _components = ModelToModel.this.page.getComponents();
        Component _pollToComponent = ModelToModel.this.pollToComponent(poll);
        _components.add(_pollToComponent);
      }
    };
    _polls.forEach(_function);
    return this.page;
  }
  
  public Component pollToComponent(final Poll poll) {
    Component component = this.factory.createComponent();
    String _name = poll.getName();
    component.setName(_name);
    String _description = poll.getDescription();
    component.setDescription(_description);
    PollStyle _pollStyle = this.pollSystemStyle.getPollStyle();
    ColorEnum _color = _pollStyle.getColor();
    String _literal = _color.getLiteral();
    Color _get = Color.get(_literal);
    component.setBgColor(_get);
    PollStyle _pollStyle_1 = this.pollSystemStyle.getPollStyle();
    BorderTypeEnum _borderType = _pollStyle_1.getBorderType();
    String _literal_1 = _borderType.getLiteral();
    BorderStyle _get_1 = BorderStyle.get(_literal_1);
    component.setBorderStyle(_get_1);
    component.initComponents();
    EList<Question> _questions = poll.getQuestions();
    for (final Question question : _questions) {
      EList<Component> _components = component.getComponents();
      Component _questionToComponent = this.questionToComponent(question);
      _components.add(_questionToComponent);
    }
    return component;
  }
  
  public Component questionToComponent(final Question q) {
    if ((q instanceof TextQuestion)) {
      return this.textQuestionToComponent(((TextQuestion)q));
    } else {
      if ((q instanceof SingleChoiceQuestion)) {
        return this.singleChoiceQuestionToComponent(((SingleChoiceQuestion)q));
      } else {
        if ((q instanceof MultipleChoiceQuestion)) {
          return this.multipleChoiceQuestionToComponent(((MultipleChoiceQuestion)q));
        } else {
          if ((q instanceof ImageQuestion)) {
            return this.imageQuestionToComponent(((ImageQuestion)q));
          }
        }
      }
    }
    return null;
  }
  
  public Component textQuestionToComponent(final TextQuestion q) {
    TextComponent component = this.factory.createTextComponent();
    String _name = q.getName();
    component.setName(_name);
    String _text = q.getText();
    component.setText(_text);
    TextQuestionStyle _textQuestionStyle = this.pollSystemStyle.getTextQuestionStyle();
    ColorEnum _color = _textQuestionStyle.getColor();
    String _literal = _color.getLiteral();
    Color _get = Color.get(_literal);
    component.setBgColor(_get);
    SingleQuestionStyle _singleQuestionStyle = this.pollSystemStyle.getSingleQuestionStyle();
    BorderTypeEnum _borderType = _singleQuestionStyle.getBorderType();
    String _literal_1 = _borderType.getLiteral();
    BorderStyle _get_1 = BorderStyle.get(_literal_1);
    component.setBorderStyle(_get_1);
    return component;
  }
  
  public Component imageQuestionToComponent(final ImageQuestion q) {
    ImageComponent component = this.factory.createImageComponent();
    String _name = q.getName();
    component.setName(_name);
    String _text = q.getText();
    component.setText(_text);
    String _imagePath = q.getImagePath();
    component.setSrc(_imagePath);
    TextQuestionStyle _textQuestionStyle = this.pollSystemStyle.getTextQuestionStyle();
    ColorEnum _color = _textQuestionStyle.getColor();
    String _literal = _color.getLiteral();
    Color _get = Color.get(_literal);
    component.setBgColor(_get);
    SingleQuestionStyle _singleQuestionStyle = this.pollSystemStyle.getSingleQuestionStyle();
    BorderTypeEnum _borderType = _singleQuestionStyle.getBorderType();
    String _literal_1 = _borderType.getLiteral();
    BorderStyle _get_1 = BorderStyle.get(_literal_1);
    component.setBorderStyle(_get_1);
    return component;
  }
  
  public Component singleChoiceQuestionToComponent(final SingleChoiceQuestion q) {
    ListComponent component = this.factory.createListComponent();
    String _name = q.getName();
    component.setName(_name);
    String _text = q.getText();
    component.setText(_text);
    SingleQuestionStyle _singleQuestionStyle = this.pollSystemStyle.getSingleQuestionStyle();
    ColorEnum _color = _singleQuestionStyle.getColor();
    String _literal = _color.getLiteral();
    Color _get = Color.get(_literal);
    component.setBgColor(_get);
    SingleQuestionStyle _singleQuestionStyle_1 = this.pollSystemStyle.getSingleQuestionStyle();
    BorderTypeEnum _borderType = _singleQuestionStyle_1.getBorderType();
    String _literal_1 = _borderType.getLiteral();
    BorderStyle _get_1 = BorderStyle.get(_literal_1);
    component.setBorderStyle(_get_1);
    EList<SingleChoiceOption> _options = q.getOptions();
    for (final SingleChoiceOption o : _options) {
      {
        Option e = this.optionToElement(o);
        e.setType(OptionType.RADIO);
        EList<Element> _elements = component.getElements();
        _elements.add(e);
      }
    }
    return component;
  }
  
  public Component multipleChoiceQuestionToComponent(final MultipleChoiceQuestion q) {
    ListComponent component = this.factory.createListComponent();
    String _name = q.getName();
    component.setName(_name);
    String _text = q.getText();
    component.setText(_text);
    MultipleQuestionStyle _multipleQuestionStyle = this.pollSystemStyle.getMultipleQuestionStyle();
    ColorEnum _color = _multipleQuestionStyle.getColor();
    String _literal = _color.getLiteral();
    Color _get = Color.get(_literal);
    component.setBgColor(_get);
    MultipleQuestionStyle _multipleQuestionStyle_1 = this.pollSystemStyle.getMultipleQuestionStyle();
    BorderTypeEnum _borderType = _multipleQuestionStyle_1.getBorderType();
    String _literal_1 = _borderType.getLiteral();
    BorderStyle _get_1 = BorderStyle.get(_literal_1);
    component.setBorderStyle(_get_1);
    EList<MultipleChoiceOption> _options = q.getOptions();
    for (final MultipleChoiceOption o : _options) {
      {
        Option e = this.optionToElement(o);
        e.setType(OptionType.CHECK_BOX);
        EList<Element> _elements = component.getElements();
        _elements.add(e);
      }
    }
    return component;
  }
  
  public Option optionToElement(final QuestionOption option) {
    Option e = this.factory.createOption();
    String _name = option.getName();
    e.setName(_name);
    String _value = option.getValue();
    e.setValue(_value);
    String _option = option.getOption();
    e.setText(_option);
    return e;
  }
}
