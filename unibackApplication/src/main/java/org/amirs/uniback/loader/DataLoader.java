package org.amirs.uniback.loader;

import lombok.RequiredArgsConstructor;
import org.amirs.uniback.model.Product;
import org.amirs.uniback.repository.ProductRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final ProductRepository productRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        LinkedList<Product> products = new LinkedList<>(List.of(
//                new Product("Nike", "Cool Nike", "https://www.club100.kz/i/Photos/pl/58714.jpg.webp?t=1706996539", "19.99$"),
//                new Product("Nike", "Good Nike", "https://www.club100.kz/i/Photos/pl/46683.jpg.webp?t=1706958978", "29.99$"),
//                new Product("Nike", "Great Nike", "https://www.club100.kz/i/Photos/pl/6971.jpg.webp?t=1707073117", "39.99$"),
//                new Product("Nike", "Okey Nike", "https://www.club100.kz/i/Photos/pl/49375.jpg.webp?t=1706967677", "49.99$"),
//                new Product("Nike", "Loop Nike", "https://www.club100.kz/i/Photos/pl/59783.jpg.webp?t=1706991186", "59.99$"),
//                new Product("Nike", "War Nike", "https://www.club100.kz/i/Photos/pl/57117.jpg.webp?t=1706991357", "49.99$"),
//                new Product("Nike", "Bad Nike", "https://www.club100.kz/i/Photos/pl/62199.jpg.webp?t=1707010217", "89.99$"),
//                new Product("Nike", "Pool Nike", "https://www.club100.kz/i/Photos/pl/44278.jpg.webp?t=1706952347", "19.99$"),
//                new Product("Nike", "Neer Nike", "https://www.club100.kz/i/Photos/pl/15342.jpg.webp?t=1707038584", "9.99$"),
//                new Product("Nike", "Boost Nike", "https://www.club100.kz/i/Photos/pl/42726.jpg.webp?t=1706948254", "69.99$"),
//                new Product("Nike", "Kill Nike", "https://www.club100.kz/i/Photos/pl/41831.jpg.webp?t=1706945377", "19.99$"),
//                new Product("Nike", "Bird Nike", "https://www.club100.kz/i/Photos/pl/58566.jpg.webp?t=1706996053", "79.99$"),
//                new Product("Nike", "Murder Nike", "https://www.club100.kz/i/Photos/pl/57153.jpg.webp?t=1706991469", "179.99$"),
//                new Product("Nike", "Nike Nike", "https://www.club100.kz/i/Photos/pl/32912.jpg.webp?t=1706915585", "199.99$"),
//                new Product("Nike", "Adidas Nike", "https://www.club100.kz/i/Photos/pl/42015.jpg.webp?t=1706945975", "89.99$"),
//                new Product("Nike", "Mega Nike", "https://www.club100.kz/i/Photos/pl/29021.jpg.webp?t=1706912305", "39.99$"),
//                new Product("Nike", "Ultra Nike", "https://www.club100.kz/i/Photos/pl/30027.jpg.webp?t=1706911670", "59.99$"),
//                new Product("Nike", "Pomp Nike", "https://www.club100.kz/i/Photos/pl/44384.jpg.webp?t=1706952692", "49.99$"),
//                new Product("Nike", "Dog Nike", "https://www.club100.kz/i/Photos/pl/44414.jpg.webp?t=1706952786", "69.99$"),
//                new Product("Nike", "Cat Nike", "https://www.club100.kz/i/Photos/pl/43068.jpg.webp?t=1706949365", "79.99$"),
//                new Product("Nike", "Full Nike", "https://www.club100.kz/i/Photos/pl/58714.jpg.webp?t=1706996539", "19.99$")
//        ));
//
//        productRepository.saveAll(products);
    }
}
