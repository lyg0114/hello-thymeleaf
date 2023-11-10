package com.example.hellothymeleaf.web.controller;

import com.example.hellothymeleaf.business.services.SeedStarterService;
import com.example.hellothymeleaf.business.services.VarietyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

/**
 * @author : iyeong-gyo
 * @package : com.example.hellothymeleaf.web.controller
 * @since : 10.11.23
 */
@RequiredArgsConstructor
@Controller
public class SeedStarterMngController {
  private final VarietyService varietyService;
  private final SeedStarterService seedStarterService;
}
