package com.example.taskapi.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.taskapi.model.Pet
import com.example.taskapi.petViewModel.PetViewModel

@Composable
fun PetListComposableScreen(viewModel: PetViewModel) {
    val pets = viewModel.pets
    LazyColumn {
        items(pets) { pet ->
            PetItems(pet)
        }
    }

}
@Composable
fun PetItems(
    pet: Pet)
{
    Column {

        Row {Text(pet.name+"\n") }

        Row {Text(pet.gender+"\n")}

        Row {Text(pet.age.toString()+"\n")}
    }
}
