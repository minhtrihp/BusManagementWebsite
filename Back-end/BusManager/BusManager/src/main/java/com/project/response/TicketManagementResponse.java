/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class TicketManagementResponse {
    private String ticketId;
    private String seatId;
    private int status;
    private int payment;
    private Date paymentDate;
    private Date bookingDate;
    private String note;
    private String tripId;
    private String cusId;
    
    public TicketManagementResponse(){
    }
    
    public TicketManagementResponse(String ticketId, String seatId,
            int status, int payment, Date paymentDate, Date bookingDate,
            String note, String tripId, String cusId){
        this.ticketId = ticketId;
        this.seatId = seatId;
        this.status = status;
        this.payment = payment;
        this.paymentDate = paymentDate;
        this.bookingDate = bookingDate;
        this.note = note;
        this.tripId = tripId;
        this.cusId = cusId;
    }

    /**
     * @return the seatId
     */
    public String getSeatId() {
        return seatId;
    }

    /**
     * @param seatId the seatId to set
     */
    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the payment
     */
    public int getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }

    /**
     * @return the paymentDate
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * @param paymentDate the paymentDate to set
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * @return the bookingDate
     */
    public Date getBookingDate() {
        return bookingDate;
    }

    /**
     * @param bookingDate the bookingDate to set
     */
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    /**
     * @return the ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * @param ticketId the ticketId to set
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * @return the tripId
     */
    public String getTripId() {
        return tripId;
    }

    /**
     * @param tripId the tripId to set
     */
    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    /**
     * @return the cusId
     */
    public String getCusId() {
        return cusId;
    }

    /**
     * @param cusId the cusId to set
     */
    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    /**
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * @param note the note to set
     */
    public void setNote(String note) {
        this.note = note;
    }
}
