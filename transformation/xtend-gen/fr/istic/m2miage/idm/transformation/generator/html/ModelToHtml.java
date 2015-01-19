package fr.istic.m2miage.idm.transformation.generator.html;

import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.transformation.generator.html.ModelToCss;
import fr.istic.m2miage.idm.uimm.Component;
import fr.istic.m2miage.idm.uimm.Element;
import fr.istic.m2miage.idm.uimm.ImageComponent;
import fr.istic.m2miage.idm.uimm.ListComponent;
import fr.istic.m2miage.idm.uimm.Option;
import fr.istic.m2miage.idm.uimm.OptionType;
import fr.istic.m2miage.idm.uimm.Page;
import fr.istic.m2miage.idm.uimm.TextComponent;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelToHtml {
  private Page p;
  
  private Style s;
  
  public ModelToHtml(final Page page, final Style style) {
    this.p = page;
    this.s = style;
  }
  
  public CharSequence toHtml() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<html>");
    _builder.newLine();
    CharSequence _header = this.header();
    _builder.append(_header, "");
    _builder.newLineIfNotEmpty();
    CharSequence _body = this.body();
    _builder.append(_body, "");
    _builder.newLineIfNotEmpty();
    CharSequence _footer = this.footer();
    _builder.append(_footer, "");
    _builder.newLineIfNotEmpty();
    _builder.append("</html>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence body() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<body>");
    _builder.newLine();
    {
      EList<Component> _components = this.p.getComponents();
      for(final Component poll : _components) {
        CharSequence _printPoll = this.printPoll(poll);
        _builder.append(_printPoll, "");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</body>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printPoll(final Component poll) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div style=\"");
    String _style = ModelToCss.getStyle(poll);
    _builder.append(_style, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<p id=\"");
    String _name = poll.getName();
    _builder.append(_name, "    ");
    _builder.append("\">");
    String _description = poll.getDescription();
    _builder.append(_description, "    ");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      EList<Component> _components = poll.getComponents();
      for(final Component question : _components) {
        _builder.append("  ");
        CharSequence _printQuestion = this.printQuestion(question);
        _builder.append(_printQuestion, "  ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printQuestion(final Component q) {
    CharSequence _xifexpression = null;
    if ((q instanceof ImageComponent)) {
      _xifexpression = this.printImageComponent(((ImageComponent)q));
    } else {
      CharSequence _xifexpression_1 = null;
      if ((q instanceof ListComponent)) {
        _xifexpression_1 = this.printListComponent(((ListComponent)q));
      } else {
        CharSequence _xifexpression_2 = null;
        if ((q instanceof TextComponent)) {
          _xifexpression_2 = this.printTextComponent(((TextComponent)q));
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public CharSequence printListComponent(final ListComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div style=\"");
    String _style = ModelToCss.getStyle(q);
    _builder.append(_style, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _text = q.getText();
    _builder.append(_text, "    ");
    _builder.append("<br>");
    _builder.newLineIfNotEmpty();
    {
      EList<Element> _elements = q.getElements();
      for(final Element option : _elements) {
        Option o = ((Option) option);
        _builder.newLineIfNotEmpty();
        _builder.append("    ");
        _builder.append("<input type=\"");
        OptionType _type = o.getType();
        _builder.append(_type, "    ");
        _builder.append("\" value=\"");
        String _value = o.getValue();
        _builder.append(_value, "    ");
        _builder.append("\" name=\"");
        String _name = q.getName();
        _builder.append(_name, "    ");
        _builder.append("\">");
        String _text_1 = o.getText();
        _builder.append(_text_1, "    ");
        _builder.append("</input><br>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printImageComponent(final ImageComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div style=\"");
    String _style = ModelToCss.getStyle(q);
    _builder.append(_style, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _text = q.getText();
    _builder.append(_text, "    ");
    _builder.append("<br>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<img src=\"");
    String _src = q.getSrc();
    _builder.append(_src, "    ");
    _builder.append(".png\"></img><br>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<input type=\"text\" id=\"");
    String _name = q.getName();
    _builder.append(_name, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printTextComponent(final TextComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div style=\"");
    String _style = ModelToCss.getStyle(q);
    _builder.append(_style, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    String _text = q.getText();
    _builder.append(_text, "    ");
    _builder.append("<br>");
    _builder.newLineIfNotEmpty();
    _builder.append("    ");
    _builder.append("<input type=\"text\" id=\"");
    String _name = q.getName();
    _builder.append(_name, "    ");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence footer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<footer>footer</footer>");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence header() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<header>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("div {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("margin: 5px;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("padding: 5px;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</style>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<title>");
    String _title = this.p.getTitle();
    _builder.append(_title, "    ");
    _builder.append("</title>");
    _builder.newLineIfNotEmpty();
    _builder.append("</header>");
    _builder.newLine();
    return _builder;
  }
}
