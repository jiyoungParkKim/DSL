package fr.istic.m2miage.idm.transformation.generator.html;

import fr.istic.m2miage.idm.cSS.Style;
import fr.istic.m2miage.idm.uimm.BorderStyle;
import fr.istic.m2miage.idm.uimm.Color;
import fr.istic.m2miage.idm.uimm.Component;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ModelToCss {
  public static CharSequence generate(final Style s) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<style type=\"text/css\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("div {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("margin: 5px;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("padding: 5px;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("</style>");
    _builder.newLine();
    return _builder;
  }
  
  public static String getStyle(final Component c) {
    Color _bgColor = c.getBgColor();
    String _plus = ("background-color:" + _bgColor);
    String color = (_plus + ";");
    BorderStyle _borderStyle = c.getBorderStyle();
    String _borderType = ModelToCss.getBorderType(_borderStyle);
    String border = _borderType.toString();
    return (color + border);
  }
  
  public static String getBorderType(final BorderStyle style) {
    if (style != null) {
      switch (style) {
        case BOX:
          return "border:solid gray 1px;";
        case DOTTE:
          return "border:dotted gray 1px;";
        case ROUNDED_BOX:
          return "border:solid gray 1px;border-radius:15px;";
        case NONE:
          return "";
        default:
          break;
      }
    }
    return null;
  }
}
