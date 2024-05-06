package camellia.hibernatedemo.controller;

import camellia.hibernatedemo.common.BaseResponse;
import camellia.hibernatedemo.common.ResponseCode;
import camellia.hibernatedemo.domain.entity.User;
import camellia.hibernatedemo.service.UserService;
import cn.hutool.core.util.ObjectUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.constraints.NotBlank;

/**
 * @author anthea
 * @date 2023/9/3 20:05
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserService userService;

    @PostMapping("/save")
    public BaseResponse<Object> save(@RequestBody User user) {
        if (ObjectUtil.isEmpty(user)) {
            return BaseResponse.fail(ResponseCode.PARAMS_ERROR, "用户信息不能为空");
        }
        return userService.save(user);
    }

    @GetMapping("/list")
    public BaseResponse<Object> list() {
        return userService.list();
    }

    @GetMapping("/getByName")
    public BaseResponse<Object> getByName(@NotBlank String name) {
        return userService.getByName(name);
    }

    @PostMapping("/update")
    public BaseResponse<Object> update(@RequestBody User user) {
        return userService.update(user);
    }
}
