package com.woniu;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class Fileuse extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Goods goods = new Goods();
		goods.setGid(0);		
		//设置磁盘文件信息
				DiskFileItemFactory factory = new DiskFileItemFactory();
				//上传对象生成
				ServletFileUpload upload = new ServletFileUpload(factory);
				//解析请求对象中表单信息
				try {
					List<FileItem> items = upload.parseRequest(req);
					//得到存入的文件夹名字(这个是得到项目下的文件名)
					String dirStr = req.getServletContext().getRealPath("/upload");
					for(FileItem item:items){
						//判断是普通表单元素还是上传元素
						if(item.isFormField()){
							String fieldName = item.getFieldName();
							if(fieldName.equals("gname")){
								String fName = item.getName();
								goods.setGname(item.getString());
								System.out.println(goods.getGname()+"22222222");
							}else if(fieldName.equals("gprice")){
								goods.setGprice(Double.parseDouble(item.getString()));
							}
						}else{
							String fName = item.getName();
							fName = UUID.randomUUID()+fName.substring(fName.lastIndexOf("."));
							File file = new File(dirStr,fName);
							item.write(file);
							goods.setGphoto("/upload/"+fName);
						}
						
					}
				} catch (FileUploadException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}

}
