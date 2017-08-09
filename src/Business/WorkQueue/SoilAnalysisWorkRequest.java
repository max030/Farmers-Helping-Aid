/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Ishita
 */
public class SoilAnalysisWorkRequest extends WorkRequest{
    
    private String cropAnalysisResult;

    public String getCropAnalysisResult() {
        return cropAnalysisResult;
    }

    public void setCropAnalysisResult(String cropAnalysisResult) {
        this.cropAnalysisResult = cropAnalysisResult;
    }

   private String analysisResult;

    public String getAnalysisResult() {
        return analysisResult;
    }

    public void setAnalysisResult(String analysisResult) {
        this.analysisResult = analysisResult;
    }

    @Override
    public String toString() {
        return this.analysisResult;
    }
    
    
    
    
}
