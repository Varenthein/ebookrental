package com.kodilla.ebooklibrary.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ItemDto {
  private int id;
  private LocalDate purchaseDate;
  private ItemStatus status;
}
