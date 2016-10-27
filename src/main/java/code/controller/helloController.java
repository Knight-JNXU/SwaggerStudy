package code.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Knight_JXNU on 2016/10/21.
 */
@Controller
@RequestMapping(value = "/helloController")
@Api(value = "helloControllerApi")
public class helloController {

    @RequestMapping(value = "/sayHello")
    @ResponseBody
    @ApiOperation(value = "say hello", notes="return hello")
    public String sayHello(){
        return "say hello!";
    }

}
