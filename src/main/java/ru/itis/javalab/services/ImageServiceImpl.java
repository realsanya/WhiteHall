package ru.itis.javalab.services;

import ru.itis.javalab.dto.ImageDto;
import ru.itis.javalab.models.Image;
import ru.itis.javalab.repositories.interfaces.ImageRepository;
import ru.itis.javalab.services.interfaces.ImageService;

import java.util.List;

public class ImageServiceImpl implements ImageService {

    private ImageRepository imageRepository;

    public ImageServiceImpl(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @Override
    public ImageDto getImageByPath(String path) {
        return ImageDto.from(imageRepository.findByPath(path));
    }

    @Override
    public List<ImageDto> getAllImages() {
        return ImageDto.from(imageRepository.findAll());
    }

    @Override
    public ImageDto getImage(Integer id) {
        return ImageDto.from(imageRepository.findById(id));
    }

    @Override
    public void addImage(ImageDto image) {
        //TODO
    }

    @Override
    public void deleteImage(ImageDto image) {
        //TODO
    }

}
