package com.manuanand.programmingcontest;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.programmingcontest.Puzzle;

// This will be AUTO IMPLEMENTED by Spring into a Bean called nodeRepository
// CRUD refers Create, Read, Update, Delete

public interface PuzzleRepository extends CrudRepository<Puzzle, Integer> {

}
