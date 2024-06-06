package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.model.Transaction;
import springmvc.services.TransactionServices;

@Controller
public class MainController {



//    private TransactionServices transactionServices;

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

//    @PostMapping("/addTransaction")
//    public String addTransaction(Transaction transaction) {
//        transactionServices.addTransaction(transaction);
//        return "redirect:/";
//    }
}
