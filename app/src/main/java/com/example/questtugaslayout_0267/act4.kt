package com.example.questtugaslayout_0267

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 2. Komponen Card dibuat dalam 1 fungsi yang berbeda (Reusable Widget)
@Composable
fun MahasiswaCard(
    containerColor: Color,
    nama: String,
    alamat: String,
    telepon: String? = null,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp, horizontal = 12.dp),
        colors = CardDefaults.cardColors(
            containerColor = containerColor
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            val gambar = painterResource(R.drawable.logo_umy)

            // Logo Kiri
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .size(65.dp)
            )

            Spacer(modifier = Modifier.width(12.dp))

            // Teks Informasi Mahasiswa
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = nama,
                    fontSize = 22.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                if (!telepon.isNullOrEmpty()) {
                    Text(
                        text = telepon,
                        fontSize = 14.sp,
                        color = colorResource(R.color.teal_200)
                    )
                }


}