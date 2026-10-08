package com.example.pampertemuan4.ui.theme

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import

@composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier.padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            stringResource( id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource( id = R.string.univ),
            fonrSize = 22.sp
        )
        Spacer(modifier = Modifier.height(25.dp))
        card(
            modifier = Modifier
                .fillmaxWidth( fraction = if )
                .padding( all = 12.dp ),
            colors = CardDefaults.cardColors(
                containerColor = Color.DarkGray
            )
        ) {
            Row()
                }

    }



}
