package com.example.hellothymeleaf.web.controller;

import com.example.hellothymeleaf.business.entities.Feature;
import com.example.hellothymeleaf.business.entities.SeedStarter;
import com.example.hellothymeleaf.business.entities.Type;
import com.example.hellothymeleaf.business.entities.Variety;
import com.example.hellothymeleaf.business.services.SeedStarterService;
import com.example.hellothymeleaf.business.services.VarietyService;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

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

  @ModelAttribute("allTypes")
  public List<Type> populateTypes() {
    return Arrays.asList(Type.ALL);
  }

  @ModelAttribute("allFeatures")
  public List<Feature> populateFeatures() {
    return Arrays.asList(Feature.ALL);
  }

  @ModelAttribute("allVarieties")
  public List<Variety> populateVarieties() {
    return this.varietyService.findAll();
  }

  @ModelAttribute("allSeedStarters")
  public List<SeedStarter> populateSeedStarters() {
    return this.seedStarterService.findAll();
  }
}
