package cn.kj120.demoknife4j;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoControler {

    @PostMapping("/demo")
    @ApiOperation("这是演示接口1")
    public UserVO demo(@RequestBody Demo demo) {
        return null;
    }

    @PostMapping("/demo2")
    @ApiOperation("这是演示接口2")
    public UserVO demo2(Demo demo) {
        return new UserVO(1, "potato");
    }
}
