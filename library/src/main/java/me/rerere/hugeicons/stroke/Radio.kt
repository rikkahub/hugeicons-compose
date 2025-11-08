package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = ImageVector.Builder(
            name = "Radio",
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
        moveTo(2f, 13.5f)
        curveTo(2f, 9.74142f, 2f, 7.86213f, 3.0528f, 6.60746f)
        curveTo(3.22119f, 6.40678f, 3.40678f, 6.22119f, 3.60746f, 6.0528f)
        curveTo(4.86213f, 5f, 6.74142f, 5f, 10.5f, 5f)
        horizontalLineTo(13.5f)
        curveTo(17.2586f, 5f, 19.1379f, 5f, 20.3925f, 6.0528f)
        curveTo(20.5932f, 6.22119f, 20.7788f, 6.40678f, 20.9472f, 6.60746f)
        curveTo(22f, 7.86213f, 22f, 9.74142f, 22f, 13.5f)
        curveTo(22f, 17.2586f, 22f, 19.1379f, 20.9472f, 20.3925f)
        curveTo(20.7788f, 20.5932f, 20.5932f, 20.7788f, 20.3925f, 20.9472f)
        curveTo(19.1379f, 22f, 17.2586f, 22f, 13.5f, 22f)
        horizontalLineTo(10.5f)
        curveTo(6.74142f, 22f, 4.86213f, 22f, 3.60746f, 20.9472f)
        curveTo(3.40678f, 20.7788f, 3.22119f, 20.5932f, 3.0528f, 20.3925f)
        curveTo(2f, 19.1379f, 2f, 17.2586f, 2f, 13.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(10f, 5f)
        lineTo(14f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        horizontalLineTo(7f)
        moveTo(6f, 15f)
        horizontalLineTo(7f)
        }
        }.build()

        return _radio!!
    }

private var _radio: ImageVector? = null
