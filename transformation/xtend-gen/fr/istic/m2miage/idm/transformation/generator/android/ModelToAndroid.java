package fr.istic.m2miage.idm.transformation.generator.android;

import com.google.common.base.Objects;
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
public class ModelToAndroid {
  private Page p;
  
  public ModelToAndroid(final Page page) {
    this.p = page;
  }
  
  public CharSequence createJavaClass(final String packageName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    _builder.append(packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import android.content.Context;");
    _builder.newLine();
    _builder.append("import android.widget.Button;");
    _builder.newLine();
    _builder.append("import android.widget.CheckBox;");
    _builder.newLine();
    _builder.append("import android.widget.EditText;");
    _builder.newLine();
    _builder.append("import android.widget.ImageView;");
    _builder.newLine();
    _builder.append("import android.widget.RadioGroup;");
    _builder.newLine();
    _builder.append("import android.widget.ScrollView;");
    _builder.newLine();
    _builder.append("import android.widget.TableLayout;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Generated by ModelToAndroid generator");
    _builder.newLine();
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class ");
    String _title = this.p.getTitle();
    _builder.append(_title, "");
    _builder.append(" extends ScrollView{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Context ctx;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private TableLayout tableLayout;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _title_1 = this.p.getTitle();
    _builder.append(_title_1, "\t");
    _builder.append("(Context context) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(context);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.ctx = context;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("tableLayout = new TableLayout(ctx);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("addView(tableLayout);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("// Poll System Title");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("PollSystemUtils.addTextView(ctx, tableLayout, \"");
    String _title_2 = this.p.getTitle();
    _builder.append(_title_2, "\t\t");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<Component> _components = this.p.getComponents();
      for(final Component poll : _components) {
        _builder.append("\t\t");
        CharSequence _printPoll = this.printPoll(poll);
        _builder.append(_printPoll, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Button btn = PollSystemUtils.addButton(ctx, tableLayout, \"Save\");");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence printPoll(final Component poll) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("// Poll title");
    _builder.newLine();
    _builder.append("PollSystemUtils.addTextView(ctx, tableLayout, \"");
    String _description = poll.getDescription();
    _builder.append(_description, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    {
      EList<Component> _components = poll.getComponents();
      for(final Component question : _components) {
        CharSequence _printQuestion = this.printQuestion(question);
        _builder.append(_printQuestion, "");
        _builder.newLineIfNotEmpty();
      }
    }
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
  
  public CharSequence printTextComponent(final TextComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("// Text question");
    _builder.newLine();
    _builder.append("PollSystemUtils.addTextView(ctx, tableLayout, \"");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("EditText ");
    String _name = q.getName();
    _builder.append(_name, "");
    _builder.append(" = PollSystemUtils.addTextField(ctx, tableLayout);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printImageComponent(final ImageComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("// Image question");
    _builder.newLine();
    _builder.append("PollSystemUtils.addTextView(ctx, tableLayout, \"");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    _builder.append("ImageView iv");
    String _name = q.getName();
    _builder.append(_name, "");
    _builder.append(" = PollSystemUtils.addImageView(ctx, tableLayout, R.drawable.");
    String _src = q.getSrc();
    _builder.append(_src, "");
    _builder.append(");// TODO");
    _builder.newLineIfNotEmpty();
    _builder.append("EditText ");
    String _name_1 = q.getName();
    _builder.append(_name_1, "");
    _builder.append(" = PollSystemUtils.addTextField(ctx, tableLayout);");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printListComponent(final ListComponent q) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("// List question");
    _builder.newLine();
    _builder.append("PollSystemUtils.addTextView(ctx, tableLayout, \"");
    String _text = q.getText();
    _builder.append(_text, "");
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    EList<Element> _elements = q.getElements();
    CharSequence _printOption = this.printOption(_elements);
    _builder.append(_printOption, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printOption(final EList<Element> list) {
    boolean _notEquals = (!Objects.equal(list, null));
    if (_notEquals) {
      Element _get = list.get(0);
      Option o = ((Option) _get);
      OptionType _type = o.getType();
      boolean _equals = Objects.equal(_type, OptionType.CHECK_BOX);
      if (_equals) {
        return this.printCheckBox(list);
      } else {
        return this.printRadioButton(list);
      }
    }
    return null;
  }
  
  public CharSequence printRadioButton(final EList<Element> list) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("RadioGroup rg1 = PollSystemUtils.addRadioGroup(ctx, tableLayout");
    String _printOptionParams = this.printOptionParams(list);
    _builder.append(_printOptionParams, "");
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence printCheckBox(final EList<Element> list) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CheckBox[] cb = PollSystemUtils.addCheckBox(ctx, tableLayout");
    String _printOptionParams = this.printOptionParams(list);
    _builder.append(_printOptionParams, "");
    _builder.append(");\t");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String printOptionParams(final EList<Element> list) {
    String option = "";
    for (final Element o : list) {
      String _option = option;
      String _text = ((Option) o).getText();
      String _plus = (", \"" + _text);
      String _plus_1 = (_plus + "\"");
      option = (_option + _plus_1);
    }
    return option;
  }
}