package xin.jiangqiang.interceptor;

import xin.jiangqiang.entity.request.RequestEntity;
import xin.jiangqiang.entity.response.ResponseEntity;

/**
 * @author jiangqiang
 * @date 2021/1/3 15:19
 */
public abstract class AbstractInterceptor implements Interceptor {

    @Override
    public void beforeRequest(RequestEntity requestEntity) {

    }

    @Override
    public void afterRequest(ResponseEntity responseEntity) {

    }
}
