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
        moveTo(21f, 17f)
        horizontalLineTo(6.5f)
        curveTo(5.11929f, 17f, 4f, 18.1193f, 4f, 19.5f)
        curveTo(4f, 20.8807f, 5.11929f, 22f, 6.5f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(21f, 22f)
        curveTo(19.6193f, 22f, 18.5f, 20.8807f, 18.5f, 19.5f)
        curveTo(18.5f, 18.1193f, 19.6193f, 17f, 21f, 17f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.6716f, 6.67157f)
        lineTo(12.5f, 5.5f)
        lineTo(11.3284f, 6.67157f)
        horizontalLineTo(9.67157f)
        verticalLineTo(8.32843f)
        lineTo(8.5f, 9.5f)
        lineTo(9.67157f, 10.6716f)
        verticalLineTo(12.3284f)
        horizontalLineTo(11.3284f)
        lineTo(12.5f, 13.5f)
        lineTo(13.6716f, 12.3284f)
        horizontalLineTo(15.3284f)
        verticalLineTo(10.6716f)
        lineTo(16.5f, 9.5f)
        lineTo(15.3284f, 8.32843f)
        verticalLineTo(6.67157f)
        horizontalLineTo(13.6716f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4f, 19.5f)
        verticalLineTo(5.5f)
        curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
        horizontalLineTo(17.5f)
        curveTo(19.433f, 2f, 21f, 3.567f, 21f, 5.5f)
        verticalLineTo(17f)
        }
        }.build()

        return _quran02!!
    }

private var _quran02: ImageVector? = null
