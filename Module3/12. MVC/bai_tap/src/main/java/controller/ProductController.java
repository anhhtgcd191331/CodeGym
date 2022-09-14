package controller;

import bean.Product;
import service.ProductService;
import service.ProductServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ProductController")
public class ProductController extends HttpServlet {
    private ProductService service = new ProductServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().equals("")) {
            doGet(request, response);
            return;
        }
        switch (action) {
            case "create":
                break;
            case "update":
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null||action.trim().equals("")){
            action = "list";
        }
        switch (action){
            case "create":
            case "update":
            case "delete":
            case "detail":
            case "list":
            default:
                showListProduct(request,response);

        }
    }
    protected void showListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = service.findAll();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/WEB-INFO/views/product/list.jsp").forward(request,response);
    }
    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String dateAsString = request.getParameter("dateRelease");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date dateRelease = null;
        String error = null;
        try {
            dateRelease = format.parse(dateAsString);
        } catch (ParseException e) {
            error = "Date Release sai format";
        }

        if (error == null) {
            try {
                service.create(new Product(id, name, price, dateRelease, quantity,));
            } catch (Exception e) {
                error = e.getMessage();
            }
        }

        if (error == null) {
            response.sendRedirect("/product");
        } else {
            request.setAttribute("error", error);
            request.getRequestDispatcher("/WEB-INF/views/product/create.jsp").forward(request, response);
        }

    }
}
