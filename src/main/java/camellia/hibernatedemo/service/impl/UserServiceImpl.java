package camellia.hibernatedemo.service.impl;

import camellia.hibernatedemo.common.BaseResponse;
import camellia.hibernatedemo.common.ResponseCode;
import camellia.hibernatedemo.dao.UserMapper;
import camellia.hibernatedemo.domain.entity.User;
import camellia.hibernatedemo.service.UserService;
import cn.hutool.core.util.ObjectUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author anthea
 * @date 2023/9/3 19:59
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public BaseResponse<Object> save(User user) {
        userMapper.save(user);
        return BaseResponse.success("添加成功");
    }

    @Override
    public BaseResponse<Object> list() {
        List<User> userList = userMapper.findAll();
        if (ObjectUtil.isEmpty(userList)) {
            return BaseResponse.fail(ResponseCode.QUERY_NULL_ERROR);
        }
        return BaseResponse.success(userList, "获取成功");
    }

    @Override
    public BaseResponse<Object> getByName(String name) {
        List<User> userList = userMapper.getByName(name);
        return BaseResponse.success(userList, "获取成功");
    }

    @Override
    public BaseResponse<Object> update(User user) {
        userMapper.save(user);
        return BaseResponse.success("修改成功");
    }
}
