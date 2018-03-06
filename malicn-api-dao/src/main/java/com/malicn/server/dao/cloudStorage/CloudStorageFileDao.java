package com.malicn.server.dao.cloudStorage;


import com.malicn.server.domain.cloudStorage.CloudStorageFile;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 * @author xieqiujin
 * @date 2017/10/24
 */
public interface CloudStorageFileDao {

    List<CloudStorageFile> getBystorageId(@Param("storageId") Long storageId);

    int  insertCloudStroageFile(List<CloudStorageFile>list);

    int updateCloudFileUrl(@Param("storageId")Long storageId
                            ,@Param("fileClass") Byte fileClass
                            ,@Param("fileUrl") String fileUrl);

    int insertOneCloud(CloudStorageFile cloudStorageFile);


    CloudStorageFile selectByOne(@Param("storageId")Long storageId
            ,@Param("fileClass") Byte fileClass );

    List<String> selectImages(Long storageId);
}
