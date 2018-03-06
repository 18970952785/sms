package com.malicn.server.domain.cloudStorage;

import com.malicn.server.domain.BasePo;
import lombok.Data;

/**
 *
 * @author xieqiujin
 * @date 2017/10/24
 */
@Data
public class CloudStorageFile extends BasePo{
    private Long id;

    private Long storageId;

    private String fileUrl;

    private Byte fileClass;

    private Integer creator;
}
