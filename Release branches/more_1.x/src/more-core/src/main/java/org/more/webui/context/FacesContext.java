/*
 * Copyright 2008-2009 the original author or authors.
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
package org.more.webui.context;
import java.util.Map;
import org.more.webui.render.RenderKit;
import freemarker.template.Configuration;
/**
 * ����������֧��webui�Ļ��������л���
 * @version : 2012-4-25
 * @author ������ (zyc@byshell.org)
 */
public abstract class FacesContext {
    private FacesConfig facesConfig = null;
    private RenderKit   renderKit   = new RenderKit();
    //
    public FacesContext(FacesConfig facesConfig) {
        this.facesConfig = facesConfig;
    };
    /**��ȡ���ö���*/
    public FacesConfig getFacesConfig() {
        return this.facesConfig;
    };
    /**��ȡҳ��ʹ�õ��ַ�����*/
    public String getEncoding() {
        return this.facesConfig.getEncoding();
    };
    /**��ȡfreemarker�����ö���
     * XXX FIXME*/
    public Configuration getFreemarker() {
        return ((TplTemplate) this.facesConfig.getServletContext().getAttribute(WebAppGlobal.FREEMARKER.WEB_TEMPLATE)).getCfg();
    };
    /**��ȡ���Լ���*/
    public Map<String, Object> getAttribute() {
        return FtlHelp.getCtxMap();
    }
    public RenderKit getRenderKit() {
        return this.renderKit;
    };
}