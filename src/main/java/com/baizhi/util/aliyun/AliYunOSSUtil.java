package com.baizhi.util.aliyun;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import com.baizhi.exception.MessageException;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.UUID;

/*
        本次工具类需要实现的方法：
        头像上传（图片上传）
        视频上传
        视频截帧并保存为图片再次上传阿里云

        以上三种方法本质上都要用到流式上传
     */

public class AliYunOSSUtil implements AK{
    //封装常量
    private static final String SCHEMA = "https://";
    private static final String END_POINT="oss-cn-hangzhou.aliyuncs.com";
    private static final String BUCKET_NAME="yingx-lijin";

    //获取客户端对象
    private final OSS ossClient;
    //利用构造方法初始化
    public AliYunOSSUtil(){
        ossClient=new OSSClientBuilder().build(END_POINT,ACCESS_KEY_ID,ACCESS_KEY_SECRET);
    }

    //定义流式上传
    private String InputStreamUploader(String objectName, InputStream is){
        ossClient.putObject(BUCKET_NAME,objectName,is);
        //外网访问格式：<Schema>://<Bucket>.<外网Endpoint>/<Object>
        return SCHEMA+BUCKET_NAME+"."+END_POINT+"/"+objectName;
    }

    //防止文件名重复-UUID
    private String generateObjectName(String path, MultipartFile file){
        //用户手动上传的实体文件必定存在后缀，获取后缀，调用重载方法
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        return generateObjectName(path,extension);

    }
    //借助方法重载-以实现对没有文件实体的上传
    private String generateObjectName(String path, String extension){
        //执行至此时，当前文件名只有后缀
        String objectName=null;
        //选择do while循环来与oss进行验证，判断文件名是否重复
        do{
            objectName=path+ UUID.randomUUID()+"."+extension;
        }while (ossClient.doesObjectExist(BUCKET_NAME,objectName));
        return objectName;
    }

    //头像上传
    public String uploadAvatar(MultipartFile file){
        try {
            //为了防止文件名重复，先调用方法生成新的文件名
            String objectName = generateObjectName("avatar/", file);
            //返回最终的访问地址
            return InputStreamUploader(objectName,file.getInputStream());
        }catch (Exception e){
            e.printStackTrace();
            throw new MessageException("网络错误");
        }finally {
            if (ossClient!=null){
                ossClient.shutdown();
            }
        }
    }
}
