package cn.javadog.diy.spring.ioc.beandefinitionreader;

import cn.javadog.diy.spring.ioc.resource.Resource;
import org.w3c.dom.Document;

/**
 * 定义从资源文件加载到转换为Document的功能
 * @author Sprite
 * @date 2019年11月07日 13:58:00
 */
public interface DocumentLoader {

	Document loadDocument(Resource resource);

}
