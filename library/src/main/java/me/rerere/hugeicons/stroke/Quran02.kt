package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Quran02: ImageVector
    get() {
        if (_quran02 != null) {
            return _quran02!!
        }
        _quran02 = ImageVector.Builder(
            name = "Quran02",
            defaultWidth = 25.dp,
            defaultHeight = 24.dp,
            viewportWidth = 25f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 17f)
        horizontalLineTo(7f)
        curveTo(5.61929f, 17f, 4.5f, 18.1193f, 4.5f, 19.5f)
        curveTo(4.5f, 20.8807f, 5.61929f, 22f, 7f, 22f)
        horizontalLineTo(21.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21.5f, 22f)
        curveTo(20.1193f, 22f, 19f, 20.8807f, 19f, 19.5f)
        curveTo(19f, 18.1193f, 20.1193f, 17f, 21.5f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(14.1716f, 6.67157f)
        lineTo(13f, 5.5f)
        lineTo(11.8284f, 6.67157f)
        horizontalLineTo(10.1716f)
        verticalLineTo(8.32843f)
        lineTo(9f, 9.5f)
        lineTo(10.1716f, 10.6716f)
        verticalLineTo(12.3284f)
        horizontalLineTo(11.8284f)
        lineTo(13f, 13.5f)
        lineTo(14.1716f, 12.3284f)
        horizontalLineTo(15.8284f)
        verticalLineTo(10.6716f)
        lineTo(17f, 9.5f)
        lineTo(15.8284f, 8.32843f)
        verticalLineTo(6.67157f)
        horizontalLineTo(14.1716f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 19.5f)
        verticalLineTo(5.5f)
        curveTo(4.5f, 3.567f, 6.067f, 2f, 8f, 2f)
        horizontalLineTo(18f)
        curveTo(19.933f, 2f, 21.5f, 3.567f, 21.5f, 5.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _quran02!!
    }

private var _quran02: ImageVector? = null
