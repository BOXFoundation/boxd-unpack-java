package one.contentbox.boxd.util;

import com.alibaba.fastjson.JSON;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.util.JsonFormat;
import lombok.extern.slf4j.Slf4j;
import one.contentbox.boxd.exception.BoxdException;

/**
 * describe: ProtobufSerdeUtils
 *
 * @author wangjunbao2018@gmail.com
 * @date 2019/04/18
 */

@Slf4j
public class ProtobufSerdeUtils {

    public static  <T> T  protobufToJavaBean(MessageOrBuilder messageOrBuilder, Class<T> t)
            throws BoxdException {
            try {
                String json = JsonFormat.printer().print(messageOrBuilder);
                T d = JSON.parseObject(json, t);
                return d;
           }catch (InvalidProtocolBufferException e) {
                throw new BoxdException(-1, e.getMessage());
           }
    }

}
