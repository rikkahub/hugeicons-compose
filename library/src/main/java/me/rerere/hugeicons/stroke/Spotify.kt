package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Spotify: ImageVector
    get() {
        if (_spotify != null) {
            return _spotify!!
        }
        _spotify = ImageVector.Builder(
            name = "Spotify",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7.5f, 12.0685f)
        curveTo(8.59944f, 11.6998f, 9.77639f, 11.5f, 11f, 11.5f)
        curveTo(13.0238f, 11.5f, 14.9199f, 12.0465f, 16.5488f, 13f)
        moveTo(18f, 10f)
        curveTo(16.1509f, 8.7383f, 13.9122f, 8f, 11.5f, 8f)
        curveTo(9.90307f, 8f, 8.38216f, 8.32358f, 7f, 8.90839f)
        moveTo(15.129f, 16f)
        curveTo(13.8927f, 15.3609f, 12.4894f, 15f, 11.0018f, 15f)
        curveTo(10.1819f, 15f, 9.38762f, 15.1096f, 8.63281f, 15.315f)
        }
        }.build()

        return _spotify!!
    }

private var _spotify: ImageVector? = null
