package test;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by admin on 2017/2/16.
 */

public class TestServlet extends HttpServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setCharacterEncoding("utf-8");
        res.setContentType("text/html;utf-8");
        PrintWriter out = res.getWriter();
        out.print("hello world lzt1101!");
    }
}
