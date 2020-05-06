package miu.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "Visit")
public class Visit implements Filter {
    private int count;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        count++;

        System.out.println("Total Hit Count for the entire WebApp: " + count);

        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        count = 0;
    }
}
