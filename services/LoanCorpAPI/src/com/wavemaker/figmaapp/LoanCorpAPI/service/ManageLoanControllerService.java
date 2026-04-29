package com.wavemaker.figmaapp.LoanCorpAPI.service;


import com.wavemaker.figmaapp.LoanCorpAPI.model.*;
import com.wavemaker.figmaapp.LoanCorpAPI.model.Loan;
import com.wavemaker.figmaapp.LoanCorpAPI.model.LoanDTO;
import com.wavemaker.figmaapp.LoanCorpAPI.model.LoanSummaryDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface ManageLoanControllerService {

  /**
   * 
   * 
    * @param body  (required)
   * @return Loan
   */
  @RequestLine("POST /manageLoan/loan")
  @Headers({
    "Content-Type: */*",
    "Accept: */*",  })
  Loan manageLoanControllerCreateLoan(LoanDTO body);

  /**
   * 
   * 
    * @param userEmail  (optional)
   * @return LoanSummaryDTO
   */
  @RequestLine("GET /manageLoan/loanSummary?userEmail={userEmail}")
  @Headers({
    "Accept: */*",  })
  LoanSummaryDTO manageLoanControllerGetLoanSummary(@Param("userEmail") String userEmail);


    /**
     * 
     * 
     * Note, this is equivalent to the other <code>manageLoanControllerGetLoanSummary</code> method,
     * but with the query parameters collected into a single Map parameter. This
     * is convenient for services with optional query parameters, especially when
     * used with the {@link ManageLoanControllerGetLoanSummaryQueryParams} class that allows for
     * building up this map in a fluent style.
     * @param queryParams Map of query parameters as name-value pairs
     *   <p>The following elements may be specified in the query map:</p>
     *   <ul>
     *   <li>userEmail -  (optional)</li>
     *   </ul>
     * @return LoanSummaryDTO
     */
    @RequestLine("GET /manageLoan/loanSummary?userEmail={userEmail}")
    @Headers({
    "Accept: */*",    })
    LoanSummaryDTO manageLoanControllerGetLoanSummary
    (@QueryMap(encoded=true)
    MultiValueMap<String, String> queryParams);

}
