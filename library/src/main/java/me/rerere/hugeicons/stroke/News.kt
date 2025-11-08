package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.News: ImageVector
    get() {
        if (_news != null) {
            return _news!!
        }
        _news = ImageVector.Builder(
            name = "News",
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
        moveTo(18f, 15f)
        verticalLineTo(9f)
        curveTo(18f, 6.17157f, 18f, 4.75736f, 17.1213f, 3.87868f)
        curveTo(16.2426f, 3f, 14.8284f, 3f, 12f, 3f)
        horizontalLineTo(8f)
        curveTo(5.17157f, 3f, 3.75736f, 3f, 2.87868f, 3.87868f)
        curveTo(2f, 4.75736f, 2f, 6.17157f, 2f, 9f)
        verticalLineTo(15f)
        curveTo(2f, 17.8284f, 2f, 19.2426f, 2.87868f, 20.1213f)
        curveTo(3.75736f, 21f, 5.17157f, 21f, 8f, 21f)
        horizontalLineTo(20f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        lineTo(14f, 8f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 12f)
        lineTo(14f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        lineTo(10f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 8f)
        horizontalLineTo(19f)
        curveTo(20.4142f, 8f, 21.1213f, 8f, 21.5607f, 8.43934f)
        curveTo(22f, 8.87868f, 22f, 9.58579f, 22f, 11f)
        verticalLineTo(19f)
        curveTo(22f, 20.1046f, 21.1046f, 21f, 20f, 21f)
        curveTo(18.8954f, 21f, 18f, 20.1046f, 18f, 19f)
        verticalLineTo(8f)
        }
        }.build()

        return _news!!
    }

private var _news: ImageVector? = null
