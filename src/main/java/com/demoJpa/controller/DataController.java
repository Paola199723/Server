package com.demoJpa.controller;
import com.demoJpa.model.FileDB;
import com.demoJpa.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DataController {

	@Autowired
	protected UploadService upload;

		/*@GetMapping("/")
		public String viewDescraga(){
			return "home";
		}
		@PostMapping("/cargar")
		//                  archivo que viene en la vista   lugra donde se manda   recibe un mensage para la vista
		public String carga(@RequestParam("archivos") MultipartFile file , RedirectAttributes ms){
			upload.save(file);
			ms.addFlashAttribute("mensaje","Archivo guardado Correctamente!");
			//enviamos otra vez la peticion a la raiz
			return "redirect:/";
		}*/

	@GetMapping("/")
	public String viewDescraga(){
		return "home";
	}
	@PostMapping("/cargar")
	public String carga(@RequestBody FileDB file){
		upload.guardar(file);
		//ms.addFlashAttribute("mensaje","Archivo guardado Correctamente!");
		//enviamos otra vez la peticion a la raiz
		return "redirect:/";
	}
	/*@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
		String message = "";
		try {
			upload.store(file);
			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
		} catch (Exception e) {
			message = "Could not upload the file: " + file.getOriginalFilename() + "!";
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
		}
	}
	@GetMapping("/files")
	public ResponseEntity<List<FileDB>> getListFiles() {
		List<FileDB> files = storageService.getAllFiles().map(dbFile -> {
			String fileDownloadUri = ServletUriComponentsBuilder
					.fromCurrentContextPath()
					.path("/files/")
					.path(dbFile.getId())
					.toUriString();
			return new ResponseFile(
					dbFile.getName(),
					fileDownloadUri,
					dbFile.getType(),
					dbFile.getData().length);
		}).collect(Collectors.toList());
		return ResponseEntity.status(HttpStatus.OK).body(files);
	}
	@GetMapping("/files/{id}")
	public ResponseEntity<byte[]> getFile(@PathVariable String id) {
		FileDB fileDB = storageService.getFile(id);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getName() + "\"")
				.body(fileDB.getData());
	}*/
		
}


