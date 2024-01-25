package function002;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.BaseContoller;


@WebServlet("/function002/*")
public class ServletTest001 extends BaseContoller {

    public void login(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        String username = httpServletRequest.getParameter("username");
        System.out.println("username = " + username);
        String userPwd = httpServletRequest.getParameter("userPwd");
        System.out.println("userPwd = " + userPwd);
    }


}
