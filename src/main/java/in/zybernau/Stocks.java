package in.zybernau;


import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;


@Entity
@Cacheable
public class Stocks extends PanacheEntityBase {

  @Id
  @SequenceGenerator(
          name = "stockSequence",
          sequenceName = "stock_id_seq",
          allocationSize = 1,
          initialValue = 4)

  @Column(length = 40)
  private String stockname;
  @Column
  private Double fthigh;
  @Column
  private Double ftlow;
  @Column
  private Double buyprice;
  @Column
  private Double sellprice;
  @Column
  private Double margin;
  @Column
  private Double profitpercent;

  public Stocks() {

  }

  public Stocks(String stockname, Double ftHigh, Double ftLow, Double buyPrice, Double sellPrice, Double margin, Double profitPercent) {
    this.stockname = stockname;
    this.fthigh = ftHigh;
    this.ftlow = ftLow;
    this.buyprice = buyPrice;
    this.sellprice = sellPrice;
    this.margin = margin;
    this.profitpercent = profitPercent;
  }

  public String toString() {
    return this.stockname;
  }


  public String getStockname() {
    return this.stockname;
  }

  public void setStockname(String stockname) {
    this.stockname = stockname;
  }

  public Double getFthigh() {
    return this.fthigh;
  }

  public void setFthigh(Double fthigh) {
    this.fthigh = fthigh;
  }

  public Double getFtlow() {
    return this.ftlow;
  }

  public void setFtlow(Double ftlow) {
    this.ftlow = ftlow;
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
