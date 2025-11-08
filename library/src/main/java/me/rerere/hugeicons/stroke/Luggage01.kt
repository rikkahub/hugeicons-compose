package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Luggage01: ImageVector
    get() {
        if (_luggage01 != null) {
            return _luggage01!!
        }
        _luggage01 = ImageVector.Builder(
            name = "Luggage01",
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
        moveTo(15f, 6.5f)
        horizontalLineTo(9f)
        curveTo(6.17157f, 6.5f, 4.75736f, 6.5f, 3.87868f, 7.37868f)
        curveTo(3f, 8.25736f, 3f, 9.67157f, 3f, 12.5f)
        verticalLineTo(15f)
        curveTo(3f, 17.8284f, 3f, 19.2426f, 3.87868f, 20.1213f)
        curveTo(4.75736f, 21f, 6.17157f, 21f, 9f, 21f)
        horizontalLineTo(15f)
        curveTo(17.8284f, 21f, 19.2426f, 21f, 20.1213f, 20.1213f)
        curveTo(21f, 19.2426f, 21f, 17.8284f, 21f, 15f)
        verticalLineTo(12.5f)
        curveTo(21f, 9.67157f, 21f, 8.25736f, 20.1213f, 7.37868f)
        curveTo(19.2426f, 6.5f, 17.8284f, 6.5f, 15f, 6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 6.5f)
        verticalLineTo(6f)
        curveTo(9f, 4.58579f, 9f, 3.87868f, 9.43934f, 3.43934f)
        curveTo(9.87868f, 3f, 10.5858f, 3f, 12f, 3f)
        curveTo(13.4142f, 3f, 14.1213f, 3f, 14.5607f, 3.43934f)
        curveTo(15f, 3.87868f, 15f, 4.58579f, 15f, 6f)
        verticalLineTo(6.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(7f, 6.5f)
        verticalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(17f, 6.5f)
        verticalLineTo(21f)
        }
        }.build()

        return _luggage01!!
    }

private var _luggage01: ImageVector? = null
