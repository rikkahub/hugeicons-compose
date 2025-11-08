package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.VolumeLow: ImageVector
    get() {
        if (_volumeLow != null) {
            return _volumeLow!!
        }
        _volumeLow = ImageVector.Builder(
            name = "VolumeLow",
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
        moveTo(19f, 9f)
        curveTo(19.6254f, 9.81968f, 20f, 10.8634f, 20f, 12f)
        curveTo(20f, 13.1366f, 19.6254f, 14.1803f, 19f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 14.8135f)
        verticalLineTo(9.18646f)
        curveTo(16f, 6.04126f, 16f, 4.46866f, 15.0747f, 4.0773f)
        curveTo(14.1494f, 3.68593f, 13.0604f, 4.79793f, 10.8823f, 7.02192f)
        curveTo(9.7544f, 8.17365f, 9.11086f, 8.42869f, 7.50605f, 8.42869f)
        curveTo(6.10259f, 8.42869f, 5.40086f, 8.42869f, 4.89677f, 8.77262f)
        curveTo(3.85036f, 9.48655f, 4.00854f, 10.882f, 4.00854f, 12f)
        curveTo(4.00854f, 13.118f, 3.85036f, 14.5134f, 4.89677f, 15.2274f)
        curveTo(5.40086f, 15.5713f, 6.10259f, 15.5713f, 7.50605f, 15.5713f)
        curveTo(9.11086f, 15.5713f, 9.7544f, 15.8264f, 10.8823f, 16.9781f)
        curveTo(13.0604f, 19.2021f, 14.1494f, 20.3141f, 15.0747f, 19.9227f)
        curveTo(16f, 19.5313f, 16f, 17.9587f, 16f, 14.8135f)
        }
        }.build()

        return _volumeLow!!
    }

private var _volumeLow: ImageVector? = null
