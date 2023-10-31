package io.github.futurewl.sbs.v30x.service;

import io.github.futurewl.sbs.v30x.common.ResponseResult;
import io.github.futurewl.sbs.v30x.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
