package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Drive: ImageVector
    get() {
        if (_drive != null) {
            return _drive!!
        }
        _drive = ImageVector.Builder(
            name = "Drive",
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
        moveTo(18f, 18f)
        horizontalLineTo(6f)
        curveTo(4.89543f, 18f, 4f, 18.8954f, 4f, 20f)
        curveTo(4f, 21.1046f, 4.89543f, 22f, 6f, 22f)
        lineTo(18f, 22f)
        curveTo(19.1046f, 22f, 20f, 21.1046f, 20f, 20f)
        curveTo(20f, 18.8954f, 19.1046f, 18f, 18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 8.5f)
        curveTo(12.5523f, 8.5f, 13f, 8.05228f, 13f, 7.5f)
        curveTo(13f, 6.94772f, 12.5523f, 6.5f, 12f, 6.5f)
        moveTo(12f, 8.5f)
        curveTo(11.4477f, 8.5f, 11f, 8.05228f, 11f, 7.5f)
        curveTo(11f, 6.94772f, 11.4477f, 6.5f, 12f, 6.5f)
        moveTo(12f, 8.5f)
        verticalLineTo(6.5f)
        moveTo(10f, 12.5f)
        horizontalLineTo(14f)
        moveTo(9f, 13.5f)
        verticalLineTo(13f)
        curveTo(9f, 11.8954f, 9.89543f, 11f, 11f, 11f)
        horizontalLineTo(13f)
        curveTo(14.1046f, 11f, 15f, 11.8954f, 15f, 13f)
        verticalLineTo(13.5f)
        horizontalLineTo(9f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16.5f, 20f)
        verticalLineTo(20.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(13.5f, 20f)
        verticalLineTo(20.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(20f, 20f)
        verticalLineTo(8f)
        curveTo(20f, 5.17157f, 20f, 3.75736f, 19.1213f, 2.87868f)
        curveTo(18.2426f, 2f, 16.8284f, 2f, 14f, 2f)
        horizontalLineTo(10f)
        curveTo(7.17157f, 2f, 5.75736f, 2f, 4.87868f, 2.87868f)
        curveTo(4f, 3.75736f, 4f, 5.17157f, 4f, 8f)
        verticalLineTo(20f)
        }
        }.build()

        return _drive!!
    }

private var _drive: ImageVector? = null
