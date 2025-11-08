package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation04: ImageVector
    get() {
        if (_presentation04 != null) {
            return _presentation04!!
        }
        _presentation04 = ImageVector.Builder(
            name = "Presentation04",
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
        moveTo(2.5f, 11.5f)
        curveTo(2.5f, 14.3284f, 2.5f, 15.7426f, 3.37868f, 16.6213f)
        curveTo(4.25736f, 17.5f, 5.67157f, 17.5f, 8.5f, 17.5f)
        horizontalLineTo(15.5f)
        curveTo(18.3284f, 17.5f, 19.7426f, 17.5f, 20.6213f, 16.6213f)
        curveTo(21.5f, 15.7426f, 21.5f, 14.3284f, 21.5f, 11.5f)
        verticalLineTo(9.5f)
        curveTo(21.5f, 6.67157f, 21.5f, 5.25736f, 20.6213f, 4.37868f)
        curveTo(19.7426f, 3.5f, 18.3284f, 3.5f, 15.5f, 3.5f)
        horizontalLineTo(8.5f)
        curveTo(5.67157f, 3.5f, 4.25736f, 3.5f, 3.37868f, 4.37868f)
        curveTo(2.5f, 5.25736f, 2.5f, 6.67157f, 2.5f, 9.5f)
        verticalLineTo(11.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 2f)
        verticalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 22f)
        lineTo(12.0001f, 19f)
        lineTo(17f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 17.7782f)
        verticalLineTo(22f)
        }
        }.build()

        return _presentation04!!
    }

private var _presentation04: ImageVector? = null
