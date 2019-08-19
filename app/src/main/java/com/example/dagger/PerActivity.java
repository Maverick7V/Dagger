package com.example.dagger;


import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {

}
