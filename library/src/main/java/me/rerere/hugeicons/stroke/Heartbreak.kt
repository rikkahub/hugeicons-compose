package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Heartbreak: ImageVector
    get() {
        if (_heartbreak != null) {
            return _heartbreak!!
        }
        _heartbreak = ImageVector.Builder(
            name = "Heartbreak",
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
        moveTo(10.4107f, 19.9677f)
        curveTo(7.58942f, 17.858f, 2f, 13.0348f, 2f, 8.69444f)
        curveTo(2f, 5.82563f, 4.10526f, 3.5f, 7f, 3.5f)
        curveTo(8.5f, 3.5f, 10f, 4f, 12f, 6f)
        curveTo(14f, 4f, 15.5f, 3.5f, 17f, 3.5f)
        curveTo(19.8947f, 3.5f, 22f, 5.82563f, 22f, 8.69444f)
        curveTo(22f, 13.0348f, 16.4106f, 17.858f, 13.5893f, 19.9677f)
        curveTo(12.6399f, 20.6776f, 11.3601f, 20.6776f, 10.4107f, 19.9677f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 5.99866f)
        lineTo(14f, 9.00061f)
        lineTo(11.5f, 12f)
        lineTo(13.5f, 14f)
        lineTo(12.5f, 16.0006f)
        }
        }.build()

        return _heartbreak!!
    }

private var _heartbreak: ImageVector? = null
