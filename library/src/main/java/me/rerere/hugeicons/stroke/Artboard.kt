package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Artboard: ImageVector
    get() {
        if (_artboard != null) {
            return _artboard!!
        }
        _artboard = ImageVector.Builder(
            name = "Artboard",
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
        moveTo(8f, 4.5f)
        verticalLineTo(3f)
        moveTo(16f, 4.5f)
        verticalLineTo(3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 8f)
        lineTo(21f, 8f)
        moveTo(19.5f, 16f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 21f)
        verticalLineTo(19.5f)
        moveTo(16f, 21f)
        verticalLineTo(19.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 8f)
        lineTo(4.5f, 8f)
        moveTo(3f, 16f)
        horizontalLineTo(4.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8f, 11f)
        curveTo(8f, 9.58579f, 8f, 8.87868f, 8.43934f, 8.43934f)
        curveTo(8.87868f, 8f, 9.58579f, 8f, 11f, 8f)
        horizontalLineTo(13f)
        curveTo(14.4142f, 8f, 15.1213f, 8f, 15.5607f, 8.43934f)
        curveTo(16f, 8.87868f, 16f, 9.58579f, 16f, 11f)
        verticalLineTo(13f)
        curveTo(16f, 14.4142f, 16f, 15.1213f, 15.5607f, 15.5607f)
        curveTo(15.1213f, 16f, 14.4142f, 16f, 13f, 16f)
        horizontalLineTo(11f)
        curveTo(9.58579f, 16f, 8.87868f, 16f, 8.43934f, 15.5607f)
        curveTo(8f, 15.1213f, 8f, 14.4142f, 8f, 13f)
        verticalLineTo(11f)
        }
        }.build()

        return _artboard!!
    }

private var _artboard: ImageVector? = null
