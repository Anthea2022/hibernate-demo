package camellia.hibernatedemo.service;

import camellia.hibernatedemo.common.BaseResponse;
import camellia.hibernatedemo.domain.entity.User;

/**
 * @author anthea
 * @date 2023/9/3 19:58
 */
public interface UserService {
    BaseResponse<Object> save(User user);

    BaseResponse<Object> list();

    BaseResponse<Object> getByName(String name);

    BaseResponse<Object> update(User user);
}
