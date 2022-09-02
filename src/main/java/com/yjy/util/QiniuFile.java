package com.yjy.util;/**
 * @author 徐晓瑞
 * @create 2022/9/2 11:08
 * @describe
 */

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.UnsupportedEncodingException;

/**
 * @author 徐晓瑞
 * @date 2022/9/2 11:08
 * @describe:
 */
public class QiniuFile {

    /**
     * 文件上传
     * @param b
     * @return
     */
    public static String uploadFile(byte[] b){
        //构造一个带指定 Region 对象的配置类
        Configuration cfg = new Configuration(Region.huanan());
        cfg.resumableUploadAPIVersion = Configuration.ResumableUploadAPIVersion.V2;
        //...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        //...生成上传凭证，然后准备上传
        String accessKey = "55T649DE5zwbPh-cEIgZzIktvW-VUa6L-5YNHrGh";
        String secretKey = "stwhqqOBrQ1YgMuFSMFEvYKTNKV_BlWIhj10OA3O";
        String bucket = "mickeyhourse";
        //默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = null;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(b, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            return putRet.hash;
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
               ex2.error();
            }
        }
        return "";
    }
}
