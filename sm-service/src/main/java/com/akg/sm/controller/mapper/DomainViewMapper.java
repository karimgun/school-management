package com.akg.sm.controller.mapper;

import com.akg.sm.domain.Student;
import com.akg.sm.domain.system.User;
import com.akg.sm.view.bean.StudentView;
import com.akg.sm.view.bean.UserView;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import org.springframework.stereotype.Component;

@Component(value = "domainViewMapper")
public class DomainViewMapper extends ConfigurableMapper {

    @Override
    protected void configureFactoryBuilder(DefaultMapperFactory.Builder factoryBuilder) {
        factoryBuilder.mapNulls(false);
    }

    @Override
    protected void configure(MapperFactory factory) {
        registerStudentToView(factory);
    }

    private void registerStudentToView(MapperFactory mapperFactory) {
        mapperFactory.classMap(Student.class, StudentView.class)
                .byDefault()
                .register();
    }


    private void registerUserToView(MapperFactory mapperFactory) {
        mapperFactory.classMap(User.class, UserView.class)
                .byDefault()
                .register();
    }
}
