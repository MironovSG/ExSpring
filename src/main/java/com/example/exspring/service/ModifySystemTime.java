package com.example.exspring.service;

import com.example.exspring.model.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {
    @Override
    public Response modify(Response response){
        response.setSystemTime ("Data");
        return response;
    }
}
