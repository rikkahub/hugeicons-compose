package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VolumeHigh: ImageVector
    get() {
        if (_volumeHigh != null) {
            return _volumeHigh!!
        }
        _volumeHigh = ImageVector.Builder(
            name = "VolumeHigh",
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
        moveTo(14f, 14.8135f)
        verticalLineTo(9.18646f)
        curveTo(14f, 6.04126f, 14f, 4.46866f, 13.0747f, 4.0773f)
        curveTo(12.1494f, 3.68593f, 11.0603f, 4.79793f, 8.88232f, 7.02192f)
        curveTo(7.75439f, 8.17365f, 7.11085f, 8.42869f, 5.50604f, 8.42869f)
        curveTo(4.10257f, 8.42869f, 3.40084f, 8.42869f, 2.89675f, 8.77262f)
        curveTo(1.85035f, 9.48655f, 2.00852f, 10.882f, 2.00852f, 12f)
        curveTo(2.00852f, 13.118f, 1.85035f, 14.5134f, 2.89675f, 15.2274f)
        curveTo(3.40084f, 15.5713f, 4.10257f, 15.5713f, 5.50604f, 15.5713f)
        curveTo(7.11085f, 15.5713f, 7.75439f, 15.8264f, 8.88232f, 16.9781f)
        curveTo(11.0603f, 19.2021f, 12.1494f, 20.3141f, 13.0747f, 19.9227f)
        curveTo(14f, 19.5313f, 14f, 17.9587f, 14f, 14.8135f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 9f)
        curveTo(17.6254f, 9.81968f, 18f, 10.8634f, 18f, 12f)
        curveTo(18f, 13.1366f, 17.6254f, 14.1803f, 17f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 7f)
        curveTo(21.2508f, 8.36613f, 22f, 10.1057f, 22f, 12f)
        curveTo(22f, 13.8943f, 21.2508f, 15.6339f, 20f, 17f)
        }
        }.build()

        return _volumeHigh!!
    }

private var _volumeHigh: ImageVector? = null
