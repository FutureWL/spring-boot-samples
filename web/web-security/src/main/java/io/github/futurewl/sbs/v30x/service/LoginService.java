package io.github.futurewl.sbs.v31x.service;

import io.github.futurewl.sbs.v31x.common.ResponseResult;
import io.github.futurewl.sbs.v31x.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
