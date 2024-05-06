package camellia.hibernatedemo.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author anthea
 * @date 2023/9/3 19:51
 */

@Data
@Builder
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = -210091986649003562L;


    private Integer code;
    private String message;
    private T data;

    public static <T> BaseResponse<T> success() {
        return BaseResponse.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .message(ResponseCode.SUCCESS.getMessage())
                .data(null)
                .build();
    }

    public static <T> BaseResponse<T> success(T data) {
        return BaseResponse.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .message(ResponseCode.SUCCESS.getMessage())
                .data(data)
                .build();
    }

    public static <T> BaseResponse<T> success(String message) {
        return BaseResponse.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .message(message)
                .data(null)
                .build();
    }

    public static <T> BaseResponse<T> success(T data, String message) {
        return BaseResponse.<T>builder()
                .code(ResponseCode.SUCCESS.getCode())
                .data(data)
                .message(message)
                .build();
    }

    public static <T> BaseResponse<T> fail(ResponseCode responseCodes) {
        return BaseResponse.<T>builder()
                .code(responseCodes.getCode())
                .message(responseCodes.getMessage())
                .data(null)
                .build();
    }

    public static <T> BaseResponse<T> fail(ResponseCode responseCodes, String message) {
        return BaseResponse.<T>builder()
                .code(responseCodes.getCode())
                .message(message)
                .data(null)
                .build();
    }


}
