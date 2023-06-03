import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội", "hoan.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang", "nam.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hoà","1983-08-22","Nam Định", "hoa.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây", "khoa.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội", "thi.jpg"));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         request.setAttribute("customerList", customerList);
         request.getRequestDispatcher("/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
