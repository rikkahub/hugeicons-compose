package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.HeartRemove: ImageVector
    get() {
        if (_heartRemove != null) {
            return _heartRemove!!
        }
        _heartRemove = ImageVector.Builder(
            name = "HeartRemove",
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
        moveTo(13.5893f, 19.9677f)
        curveTo(12.6399f, 20.6776f, 11.3601f, 20.6776f, 10.4107f, 19.9677f)
        curveTo(7.58942f, 17.858f, 2f, 13.0348f, 2f, 8.69444f)
        curveTo(2f, 5.82563f, 4.10526f, 3.5f, 7f, 3.5f)
        curveTo(8.5f, 3.5f, 10f, 4f, 12f, 6f)
        curveTo(14f, 4f, 15.5f, 3.5f, 17f, 3.5f)
        curveTo(19.8947f, 3.5f, 22f, 5.82563f, 22f, 8.69444f)
        curveTo(22f, 9.45389f, 21.8289f, 10.2281f, 21.5314f, 11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 13.5f)
        lineTo(18.5f, 16f)
        moveTo(18.5f, 16f)
        lineTo(21f, 18.5f)
        moveTo(18.5f, 16f)
        lineTo(21f, 13.5f)
        moveTo(18.5f, 16f)
        lineTo(16f, 18.5f)
        }
        }.build()

        return _heartRemove!!
    }

private var _heartRemove: ImageVector? = null
