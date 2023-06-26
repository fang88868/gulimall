package com.example.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品评价回复关系
 * </p>
 *
 * @author fs
 * @since 2023-06-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("pms_comment_replay")
@ApiModel(value="PmsCommentReplay对象", description="商品评价回复关系")
public class PmsCommentReplay implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "评论id")
    private Long commentId;

    @ApiModelProperty(value = "回复id")
    private Long replyId;


}
