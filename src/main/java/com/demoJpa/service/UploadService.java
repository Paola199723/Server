package com.demoJpa.service;

import com.demoJpa.model.FileDB;
import com.demoJpa.repository.FileDBRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

@Service
public class UploadService {

    @Autowired
    private FileDBRepository fileDBRepository;

    public void guardar(FileDB file) {
        fileDBRepository.save(file);
           //return "carga exitosa";
    }



   /* public FileDB store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());
        return fileDBRepository.save(FileDB);
    }
    public FileDB getFile(String id) {
        return fileDBRepository.findById(id).get();
    }

    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }*/

   /*  private String folder="cargas//";
    private final Logger logg = LoggerFactory.getLogger(UploadService.class);
        if(!file.isEmpty()){
            try {
                byte [] bytes = file.getBytes();
                Path path = Paths.get(folder+file.getOriginalFilename());
                Files.write(path, bytes);
                logg.info("Archivo guardado");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "Archivo guardado correctamente";
    }*/

}
