package io.github.futurewl.sbs.v26x.service;

import io.github.futurewl.sbs.v26x.common.ResponseResult;
import io.github.futurewl.sbs.v26x.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
