package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.RiyalRectangle: ImageVector
    get() {
        if (_riyalRectangle != null) {
            return _riyalRectangle!!
        }
        _riyalRectangle = ImageVector.Builder(
            name = "RiyalRectangle",
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
        moveTo(12.5f, 2.5f)
        horizontalLineTo(11.5f)
        curveTo(7.25736f, 2.5f, 5.13604f, 2.5f, 3.81802f, 3.81802f)
        curveTo(2.5f, 5.13604f, 2.5f, 7.25736f, 2.5f, 11.5f)
        verticalLineTo(12.5f)
        curveTo(2.5f, 16.7426f, 2.5f, 18.864f, 3.81802f, 20.182f)
        curveTo(5.13604f, 21.5f, 7.25736f, 21.5f, 11.5f, 21.5f)
        horizontalLineTo(12.5f)
        curveTo(16.7426f, 21.5f, 18.864f, 21.5f, 20.182f, 20.182f)
        curveTo(21.5f, 18.864f, 21.5f, 16.7426f, 21.5f, 12.5f)
        verticalLineTo(11.5f)
        curveTo(21.5f, 7.25736f, 21.5f, 5.13604f, 20.182f, 3.81802f)
        curveTo(18.864f, 2.5f, 16.7426f, 2.5f, 12.5f, 2.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 11f)
        verticalLineTo(12f)
        curveTo(18f, 13.6569f, 16.6569f, 15f, 15f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 8f)
        verticalLineTo(12.5f)
        curveTo(11f, 13.0523f, 11.4477f, 13.5f, 12f, 13.5f)
        horizontalLineTo(13f)
        curveTo(13.5523f, 13.5f, 14f, 13.0523f, 14f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.5f, 8f)
        verticalLineTo(12.5f)
        curveTo(8.5f, 13.0523f, 8.05228f, 13.5f, 7.5f, 13.5f)
        horizontalLineTo(6.5f)
        curveTo(5.94772f, 13.5f, 5.5f, 13.0523f, 5.5f, 12.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 15.49f)
        verticalLineTo(15.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13f, 15.5f)
        verticalLineTo(15.51f)
        }
        }.build()

        return _riyalRectangle!!
    }

private var _riyalRectangle: ImageVector? = null
