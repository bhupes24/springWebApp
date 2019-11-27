package com.bhupesh.springWebApp.bootstrap;

import com.bhupesh.springWebApp.Repository.AuthorRepository;
import com.bhupesh.springWebApp.Repository.BookRepository;
import com.bhupesh.springWebApp.Repository.PublisherRepository;
import com.bhupesh.springWebApp.model.Author;
import com.bhupesh.springWebApp.model.Book;
import com.bhupesh.springWebApp.model.Publisher;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap   implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootStrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){

        Publisher publisher = new Publisher("foo", "Scandanavin");
        publisherRepository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Data Driven Design", "1234", publisher);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEbj = new Book("J2EE Development without EBJ" , "12344",publisher);
        rod.getBooks().add(noEbj);
        noEbj.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEbj);
    }
}
