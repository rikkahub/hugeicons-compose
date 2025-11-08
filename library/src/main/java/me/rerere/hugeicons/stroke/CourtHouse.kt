package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.CourtHouse: ImageVector
    get() {
        if (_courtHouse != null) {
            return _courtHouse!!
        }
        _courtHouse = ImageVector.Builder(
            name = "CourtHouse",
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
        moveTo(5f, 9.08333f)
        curveTo(5f, 7.91667f, 6f, 7.5f, 6.5f, 7.5f)
        curveTo(7.49411f, 7.5f, 8f, 8.25383f, 8f, 9.08333f)
        curveTo(8f, 11.0163f, 6.65685f, 12f, 5f, 12f)
        curveTo(3.34315f, 12f, 2f, 10.433f, 2f, 8.5f)
        curveTo(2f, 6.567f, 3.34315f, 5f, 5f, 5f)
        horizontalLineTo(19f)
        curveTo(20.6569f, 5f, 22f, 6.567f, 22f, 8.5f)
        curveTo(22f, 10.433f, 20.6569f, 12f, 19f, 12f)
        curveTo(17.3431f, 12f, 16f, 11.0163f, 16f, 9.08333f)
        curveTo(16f, 8.25383f, 16.5059f, 7.5f, 17.5f, 7.5f)
        curveTo(18f, 7.5f, 19f, 7.91667f, 19f, 9.08333f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 20f)
        curveTo(3f, 19.4477f, 3.44772f, 19f, 4f, 19f)
        horizontalLineTo(20f)
        curveTo(20.5523f, 19f, 21f, 19.4477f, 21f, 20f)
        verticalLineTo(21f)
        curveTo(21f, 21.5523f, 20.5523f, 22f, 20f, 22f)
        horizontalLineTo(4f)
        curveTo(3.44772f, 22f, 3f, 21.5523f, 3f, 21f)
        verticalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 9f)
        horizontalLineTo(11f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.5f, 19f)
        lineTo(9.5f, 15f)
        moveTo(14.5f, 19f)
        lineTo(14.5f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19f, 5f)
        curveTo(19f, 3.58579f, 19f, 2.87868f, 18.5607f, 2.43934f)
        curveTo(18.1213f, 2f, 17.4142f, 2f, 16f, 2f)
        horizontalLineTo(8f)
        curveTo(6.58579f, 2f, 5.87868f, 2f, 5.43934f, 2.43934f)
        curveTo(5f, 2.87868f, 5f, 3.58579f, 5f, 5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 12f)
        verticalLineTo(19f)
        horizontalLineTo(19f)
        verticalLineTo(12f)
        }
        }.build()

        return _courtHouse!!
    }

private var _courtHouse: ImageVector? = null
