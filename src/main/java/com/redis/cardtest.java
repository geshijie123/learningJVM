package com.redis;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class cardtest {

    public static void main(String[] args) {


        CardsTong cardsTong=new CardsTong();
        cardsTong.setCardtnumber("70600244630");//通兑
        cardsTong.setCardtkind(10730);

        String startCardNumber = cardsTong.getCardtnumber().substring(0, 1);
        if (!startCardNumber.equalsIgnoreCase("5") && !startCardNumber.equalsIgnoreCase("7")
                && !startCardNumber.equalsIgnoreCase("8") || cardsTong.getCardtnumber().substring(0, 2).equals("86")) {
            if (cardsTong.getCardTKind() == 100 || cardsTong.getCardTKind() == 5100
                    || cardsTong.getCardTKind() == 3001) {
//                pricemap = cardsTongMapper.selectByCardprice(array[0], "3001");
                System.out.println(3001);
            } else {
//                pricemap = cardsTongMapper.selectByCardprice(array[0], cardsTong.getCardTKind() + "");
                System.out.println(cardsTong.getCardTKind());
            }
        } else {
//            pricemap = cardsTongMapper.selectByCardprice(array[0], "200");
            System.out.println(200);
        }

    }
}

 class  CardsTong   {


    private String cardtnumber;

    private String cardtid;

    private String cardtcode;

    private Integer cardtstatus;

    private Date cardtdateend;

    private BigDecimal ticketremaincount;

    private Integer cardtkind;

     public String getCardtnumber() {
         return cardtnumber;
     }

     public void setCardtnumber(String cardtnumber) {
         this.cardtnumber = cardtnumber;
     }

     public String getCardtid() {
         return cardtid;
     }

     public void setCardtid(String cardtid) {
         this.cardtid = cardtid;
     }

     public String getCardtcode() {
         return cardtcode;
     }

     public void setCardtcode(String cardtcode) {
         this.cardtcode = cardtcode;
     }

     public Integer getCardtstatus() {
         return cardtstatus;
     }

     public void setCardtstatus(Integer cardtstatus) {
         this.cardtstatus = cardtstatus;
     }

     public Date getCardtdateend() {
         return cardtdateend;
     }

     public void setCardtdateend(Date cardtdateend) {
         this.cardtdateend = cardtdateend;
     }

     public BigDecimal getTicketremaincount() {
         return ticketremaincount;
     }

     public void setTicketremaincount(BigDecimal ticketremaincount) {
         this.ticketremaincount = ticketremaincount;
     }

     public Integer getCardTKind() {
         return cardtkind;
     }

     public void setCardtkind(Integer cardtkind) {
         this.cardtkind = cardtkind;
     }
 }
