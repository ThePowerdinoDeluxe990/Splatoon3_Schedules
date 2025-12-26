package com.powerdino.splatoon3_companion.ui.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.powerdino.splatoon3_companion.R

@Composable
fun AboutDialog(
    onDismissRequest:()->Unit
) {
    val uriHandler = LocalUriHandler.current
    val context = LocalContext.current
    Dialog(
        onDismissRequest,
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Text(
                    text = stringResource(R.string.app_name),
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.titleLarge
                )
                
                Text(
                    text = "Made by ThePowerdinodeluxe990",
                    modifier = Modifier.clickable(
                        onClick = {
                            uriHandler.openUri(
                                context.getString(R.string.my_url)
                            )
                        }
                    )
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                ) {
                    TextButton(
                        onClick = { onDismissRequest() },
                        modifier = Modifier.padding(3.dp),
                    ) {
                        Text("Dismiss")
                    }

                    TextButton(
                        onClick = {
                            uriHandler.openUri(
                                context.getString(R.string.repo_url)
                            )
                        },
                        modifier = Modifier.padding(3.dp),
                    ) {
                        Text("Repo")
                    }

                    TextButton(
                        onClick = {
                            uriHandler.openUri(
                                context.getString(R.string.api_url)
                            )
                        },
                        modifier = Modifier.padding(3.dp),
                    ) {
                        Text("Api")
                    }

                    TextButton(
                        onClick = {
                            uriHandler.openUri(
                                context.getString(R.string.assets_url)
                            )
                        },
                        modifier = Modifier.padding(3.dp),
                    ) {
                        Text("Assets")
                    }

                }
            }
        }
    }
}


@Preview
@Composable
private fun Preview(){
    AboutDialog(
        onDismissRequest = {}
    )
}