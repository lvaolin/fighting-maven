package com.dhy.maven.plugins.myplugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @Title MyPlugin
 * @Description
 * @Author lvaolin
 * @Date 2022/1/24 11:34
 **/
@Mojo(name = "myplugin1",defaultPhase = LifecyclePhase.INSTALL)
public class MyPlugin1 extends AbstractMojo {
    @Parameter(property = "application")
    private String application;
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("自定义插件1执行-----------"+application);
    }
}
