/*
 * Copyright 2008-2009 the original ������(zyc@hasor.net).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hasor.core;
import org.more.UndefinedException;
import com.google.inject.Injector;
import com.google.inject.Provider;
/**
 * Ӧ�ó���������
 * @version : 2013-3-26
 * @author ������ (zyc@hasor.net)
 */
public interface AppContext {
    /**ͨ������ȡBean�����͡�*/
    public <T> Class<T> getBeanType(String name);
    /**�������Ŀ�����͵�Bean�򷵻�Bean�����ơ�*/
    public String getBeanName(Class<?> targetClass);
    /**��ȡ�Ѿ�ע���Bean���ơ�*/
    public String[] getBeanNames();
    /**ͨ�����ƴ���beanʵ����ʹ��guice�������ȡ��bean�������������{@link UndefinedException}�����쳣��*/
    public <T> T getBean(String name);
    /**ͨ�����ʹ�������ʵ����ʹ��guice*/
    public <T> T getInstance(Class<T> beanType);
    /**���Guice������*/
    public Injector getGuice();
    /**ͨ��һ�����ͻ�ȡ���а󶨵������͵��ϵĶ���ʵ����*/
    public <T> Object[] getInstanceByBindingType(Class<T> bindingType);
    /**ͨ��һ�����ͻ�ȡ���а󶨵������͵��ϵĶ���ʵ����*/
    public <T> Provider<T>[] getProviderByBindingType(Class<T> bindingType);
    //
    /**��ȡ������*/
    public Object getContext();
    /**��ȡϵͳ����ʱ��*/
    public long getStartTime();
    /**��ʾAppContext�Ƿ�׼���á�*/
    public boolean isReady();
    /**��ȡӦ�ó������á�*/
    public Settings getSettings();
    /**��ȡ�����ӿڡ�*/
    public Environment getEnvironment();
    /**�������ģ��*/
    public ModuleInfo[] getModules();
}