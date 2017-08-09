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
public class WeatherAnalysisWorkRequest extends WorkRequest {
    
     private String weatherAnalysisResult;

    public String getWeatherAnalysisResult() {
        return weatherAnalysisResult;
    }

    public void setWeatherAnalysisResult(String weatherAnalysisResult) {
        this.weatherAnalysisResult = weatherAnalysisResult;
    }

    @Override
    public String toString() {
        return this.weatherAnalysisResult;
    }
  
    

    
}
