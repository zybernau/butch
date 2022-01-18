package in.zybernau;


import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Cacheable
public class MyStock extends PanacheEntityBase {

  @Id
  @SequenceGenerator(
          name = "stockSequence",
          sequenceName = "stock_id_seq",
          allocationSize = 1,
          initialValue = 4)
  @Column(length = 40)
  private String stockname;

  @Column
  private Double buyprice;
  @Column
  private Double sellprice;
  @Column
  private Double margin;
  @Column
  private Double profitpercent;

  public MyStock() {
  }

  public MyStock(String stockname, Double buyprice, Double sellprice, Double margin, Double profitpercent) {
    this.stockname = stockname;
    this.buyprice = buyprice;
    this.sellprice = sellprice;
    this.margin = margin;
    this.profitpercent = profitpercent;
  }

  public static Long dall() {
    return deleteAll();
  }


  public String getStockname() {
    return this.stockname;
  }

  public void setStockname(String stockname) {
    this.stockname = stockname;
  }

  public Double getBuyprice() {
    return this.buyprice;
  }

  public void setBuyprice(Double buyprice) {
    this.buyprice = buyprice;
  }

  public Double getSellprice() {
    return this.sellprice;
  }

  public void setSellprice(Double sellprice) {
    this.sellprice = sellprice;
  }

  public Double getMargin() {
    return this.margin;
  }

  public void setMargin(Double margin) {
    this.margin = margin;
  }

  public Double getProfitpercent() {
    return this.profitpercent;
  }

  public void setProfitpercent(Double profitpercent) {
    this.profitpercent = profitpercent;
  }

}
