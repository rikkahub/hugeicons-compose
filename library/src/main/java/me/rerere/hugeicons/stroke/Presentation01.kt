package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Presentation01: ImageVector
    get() {
        if (_presentation01 != null) {
            return _presentation01!!
        }
        _presentation01 = ImageVector.Builder(
            name = "Presentation01",
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
        moveTo(2.5f, 11f)
        curveTo(2.5f, 13.8284f, 2.5f, 15.2426f, 3.37868f, 16.1213f)
        curveTo(4.25736f, 17f, 5.67157f, 17f, 8.5f, 17f)
        horizontalLineTo(15.5f)
        curveTo(18.3284f, 17f, 19.7426f, 17f, 20.6213f, 16.1213f)
        curveTo(21.5f, 15.2426f, 21.5f, 13.8284f, 21.5f, 11f)
        verticalLineTo(8f)
        curveTo(21.5f, 5.17157f, 21.5f, 3.75736f, 20.6213f, 2.87868f)
        curveTo(19.7426f, 2f, 18.3284f, 2f, 15.5f, 2f)
        horizontalLineTo(8.5f)
        curveTo(5.67157f, 2f, 4.25736f, 2f, 3.37868f, 2.87868f)
        curveTo(2.5f, 3.75736f, 2.5f, 5.17157f, 2.5f, 8f)
        verticalLineTo(11f)
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
        moveTo(12f, 17f)
        verticalLineTo(22f)
        }
        }.build()

        return _presentation01!!
    }

private var _presentation01: ImageVector? = null
