package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.W3Schools: ImageVector
    get() {
        if (_w3Schools != null) {
            return _w3Schools!!
        }
        _w3Schools = ImageVector.Builder(
            name = "W3Schools",
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
        moveTo(6f, 8f)
        horizontalLineTo(2f)
        lineTo(8f, 18f)
        lineTo(12.5f, 11f)
        lineTo(17f, 18f)
        lineTo(19f, 14.5f)
        lineTo(15f, 8f)
        horizontalLineTo(10f)
        lineTo(8f, 11f)
        lineTo(6f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 6f)
        horizontalLineTo(22f)
        lineTo(20f, 8f)
        horizontalLineTo(20.5f)
        curveTo(21.3284f, 8f, 22f, 8.67157f, 22f, 9.5f)
        curveTo(22f, 10.3284f, 21.3284f, 11f, 20.5f, 11f)
        curveTo(19.8469f, 11f, 19.2059f, 10.5826f, 19f, 10f)
        }
        }.build()

        return _w3Schools!!
    }

private var _w3Schools: ImageVector? = null
