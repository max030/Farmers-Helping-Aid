/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Shabbir Hussain
 */
public class BankEmployeeWorkRequest extends WorkRequest {
    private String loanAmount;
    private String duration;
    private String loanResult;

    public String getLoanResult() {
        return loanResult;
    }

    public void setLoanResult(String loanResult) {
        this.loanResult = loanResult;
    }
    
    public String getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
    
    
    
}
