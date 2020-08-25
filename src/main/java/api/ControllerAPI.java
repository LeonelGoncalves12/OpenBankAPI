package api;

import com.fasterxml.jackson.databind.ObjectMapper;
import models.Root;
import models.Transaction;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class ControllerAPI {

    //get all transactions
    @RequestMapping(value = "transactions")
    public List<Transaction> getTransactions() {
           Root root = getDataFromFile();
           return root != null ? root.getTransactions() : null;
    }

    //get transactions by type
    @RequestMapping(value = "transactions/{type}")
    public List<Transaction> getTransactionsByType(@PathVariable String type) {
        Root root = getDataFromFile();

        List <Transaction> list = new ArrayList<Transaction>();

        if(root != null){
            for( int i = 0 ; i < root.getTransactions().size(); i++ ){
                if(root.getTransactions().get(i).getDetails().getType().equals(type)){
                    list.add(root.getTransactions().get(i));
                }
            }
        }
        return list;
    }

    //get amount of transactions by type
    @RequestMapping(value = "transactions/amount/{type}")
    public float getTransactionsAmountByType(@PathVariable String type) {
        Root root = getDataFromFile();

        float amount = 0;

        if(root != null){
            for( int i = 0 ; i < root.getTransactions().size(); i++ ){
                if(root.getTransactions().get(i).getDetails().getType().equals(type)){
                    amount = amount + Float.valueOf(  root.getTransactions().get(i).getDetails().getValue().getAmount());
                }
            }
        }
        return amount;
    }


    private Root getDataFromFile(){
        Root root = new Root();
        try {
            ObjectMapper om = new ObjectMapper();
            root = om.readValue(new File("data.json"), Root.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return root;
    }
}