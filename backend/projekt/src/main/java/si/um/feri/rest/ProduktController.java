package si.um.feri.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import si.um.feri.dao.ProduktRepository;
import si.um.feri.vao.Produkt;
/*
@CrossOrigin
public class ProduktController {

	private static final Logger log = Logger.getLogger(si.um.feri.rest.ProduktController.class.toString());

	@Autowired
	private ProduktRepository dao;

	@GetMapping("/products")
	public @ResponseBody Iterable<si.um.feri.dto.<Product> getAllProducts() {
		List<si.um.feri.dto.Product> ret=new ArrayList<>();
		dao.findAll().forEach(p -> ret.add(p.toDto()));
		return ret;
	}
	
	@GetMapping("/products/{id}")
	public @ResponseBody ResponseEntity<si.um.feri.dto.Produkt> getProductById(@PathVariable("id") int id) {
		//validate
		Optional<Product> val=dao.findById(id);
		if (val.isEmpty()) {
			log.info(()->"/products/"+id+" ; Product not found!");
			return new ResponseEntity("product-not-found",HttpStatus.NOT_ACCEPTABLE);
		}
		return ResponseEntity.ok(val.get().toDto());
	}
	
	@PostMapping("/products")
	public ResponseEntity<si.um.feri.measurements.dto.Product> postProduct(@RequestBody si.um.feri.measurements.dto.Product pc) {
		Product vao=dao.save(new Product(pc));
	    return ResponseEntity.ok(vao.toDto());
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<si.um.feri.dto.Product> putProduct(@PathVariable("id") int id, @RequestBody si.um.feri.dto.Produkt v) {
		//validate
		Optional<Produkt> val=dao.findById(id);
		if (val.isEmpty()) {
			log.info("/products/"+id+" ; Product not found!");
			return new ResponseEntity("product-not-found",HttpStatus.NOT_ACCEPTABLE);
		}
				
		Produkt vao=val.get();
		vao.updateFrom(v);
		vao=dao.save(vao);
	    return ResponseEntity.ok(vao.toDto());
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		//validate
		Optional<Produkt> val=dao.findById(id);
		if (val.isEmpty()) {
			log.info("/products/"+id+" ; Product not found!");
			return new ResponseEntity("product-not-found",HttpStatus.NOT_ACCEPTABLE);
		}
		Produkt vao=val.get();
		dao.delete(vao);
	    return ResponseEntity.ok("deleted");
	}

}*/