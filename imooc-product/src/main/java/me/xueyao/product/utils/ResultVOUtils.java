package me.xueyao.product.utils;

import me.xueyao.product.VO.ResultVO;

/**
 * Description:
 * User: Simon.Xue
 * Date: 2018/10/9.
 */
public class ResultVOUtils {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
