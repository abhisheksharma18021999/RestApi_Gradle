package nearpe.controller;

import nearpe.model.AreaInfo;
import nearpe.service.AreaInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/geo")
public class MainController {

    @Autowired
     AreaInfoService areaInfoService;

    /* to create an district*/
    @RequestMapping(value = "/creating", method = RequestMethod.POST)
    @ResponseBody
    public AreaInfo saveIt(@RequestBody AreaInfo areaInfo) {
             areaInfoService.saveRecord(areaInfo);
             return areaInfo;
    }

    // update
    /* to create an district*/
    @RequestMapping(value = "/updating", method = RequestMethod.POST)
    @ResponseBody
    public AreaInfo updateIt(@RequestBody AreaInfo areaInfo) {
        areaInfoService.updateRecord(areaInfo);
        return areaInfo;
    }





    /*get all districts*/
    @GetMapping("/getall")
    public List<AreaInfo> getAll(){
        return areaInfoService.findAll();
    }

    /*get by zipcode*/
    @GetMapping("/getting/{zipcode}")
    public List<AreaInfo> getZip(@PathVariable Integer zipcode){

        return areaInfoService.findByZipy(zipcode);
    }


    // delete by zipcode
@RequestMapping(value = "/del/{zipcode}", method = RequestMethod.GET)
    void deleteRow(@PathVariable Integer zipcode) {
        areaInfoService.deleteByZip(zipcode);
    }


    //delete by id
    @RequestMapping(value = "/dely/{id}", method = RequestMethod.GET)
    void deleteRowy(@PathVariable long id) {
        areaInfoService.deleteById(id);
    }

}
