package com.wavemaker.figmaapp.LoanCorpAPI.service;


import com.wavemaker.figmaapp.LoanCorpAPI.model.*;
import com.wavemaker.figmaapp.LoanCorpAPI.model.IntegerWrapper;
import com.wavemaker.figmaapp.LoanCorpAPI.model.MarkOverdueEmisRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.Object;
import org.springframework.util.MultiValueMap;
import feign.*;

public interface QueryExecutionControllerService {

  /**
   * 
   * markOverdueEmis
    * @param body  (required)
   * @return IntegerWrapper
   */
  @RequestLine("PUT /loancorp/queryExecutor/queries/markOverdueEmis")
  @Headers({
    "Content-Type: */*",
    "Accept: */*",  })
  IntegerWrapper queryExecutionControllerExecuteMarkOverdueEmis(MarkOverdueEmisRequest body);

}
