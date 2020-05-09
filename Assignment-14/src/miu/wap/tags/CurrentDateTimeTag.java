package miu.wap.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeTag extends SimpleTagSupport {
    private String color = null;
    private String size = null;

    @Override
    public void doTag() throws JspException, IOException {
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy"));

        System.out.println("Current Date: " + currentDate);
        StringBuilder sb = new StringBuilder("<span style=\"");
        if (color != null) {
            sb.append(String.format("color: %s;", color));
        }
        if (size != null) {
            sb.append(String.format("font-size: %s;", size));
        }
        sb.append("\">" + currentDate + "</span>");

        getJspContext().getOut().write(sb.toString());
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
