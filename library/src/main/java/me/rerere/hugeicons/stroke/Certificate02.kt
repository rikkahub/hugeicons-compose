package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Certificate02: ImageVector
    get() {
        if (_certificate02 != null) {
            return _certificate02!!
        }
        _certificate02 = ImageVector.Builder(
            name = "Certificate02",
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
        moveTo(9f, 5.02649f)
        curveTo(7.42349f, 4.60306f, 4.65212f, 3.46017f, 3.16165f, 4.30124f)
        curveTo(1.61279f, 5.17525f, 1.61278f, 10.8248f, 3.16165f, 11.6988f)
        curveTo(4.65212f, 12.5398f, 7.42349f, 11.3969f, 9f, 10.9735f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 5.02649f)
        curveTo(16.5765f, 4.60306f, 19.3479f, 3.46017f, 20.8384f, 4.30124f)
        curveTo(22.3872f, 5.17525f, 22.3872f, 10.8248f, 20.8384f, 11.6988f)
        curveTo(19.3479f, 12.5398f, 16.5765f, 11.3969f, 15f, 10.9735f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.77244f, 11f)
        lineTo(8.34515f, 17.3753f)
        curveTo(8.01375f, 18.8555f, 7.84805f, 19.5957f, 8.18452f, 19.8368f)
        curveTo(9.33435f, 20.6607f, 10.7588f, 18.0976f, 12f, 18.0976f)
        curveTo(13.13f, 18.0976f, 14.817f, 20.5523f, 15.8155f, 19.8368f)
        curveTo(16.1519f, 19.5957f, 15.9862f, 18.8555f, 15.6548f, 17.3753f)
        lineTo(14.2276f, 11f)
        }
        }.build()

        return _certificate02!!
    }

private var _certificate02: ImageVector? = null
