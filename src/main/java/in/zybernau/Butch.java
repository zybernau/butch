package in.zybernau;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import java.util.List;

@Path("/batch")
public class Butch {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Transactional
    public String startBatch() {
        runQueries();
        return "Started Batch !!";
    }

    private void runQueries() {
        List<Stocks> stockL = Stocks.listAll();

        // MyStock.deleteAll();
        Stocks currentStock;
        MyStock mystock;
        System.out.println(stockL);

        for (int i = 0; i < stockL.size(); i++) {
            currentStock = stockL.get(i);
            // Print all elements of List
            System.out.println(currentStock.toString());

            mystock = new MyStock(currentStock.getStockname(), currentStock.getBuyprice(), currentStock.getSellprice(), currentStock.getMargin(), currentStock.getProfitpercent());
            mystock.persist();
            System.out.println("inserted stock into mystock table => " + mystock);
        }
    }

}