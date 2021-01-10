package com.guli.teacher.client;

import com.guli.common.result.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "GULI-VID")
@Component
public interface vidClient {

    @ApiOperation(value = "根据视频id删除视频")
    @DeleteMapping("deleteVideoById/{id}")
    public Result deleteVideoById(@PathVariable("id") String id);
}
