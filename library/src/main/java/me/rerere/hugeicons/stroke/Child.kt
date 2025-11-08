package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Child: ImageVector
    get() {
        if (_child != null) {
            return _child!!
        }
        _child = ImageVector.Builder(
            name = "Child",
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
        moveTo(3.5f, 11f)
        curveTo(2.67157f, 11f, 2f, 10.3284f, 2f, 9.5f)
        curveTo(2f, 8.67157f, 2.67157f, 8f, 3.5f, 8f)
        horizontalLineTo(4.25203f)
        curveTo(5.14012f, 4.54955f, 8.27232f, 2f, 12f, 2f)
        curveTo(15.7277f, 2f, 18.8599f, 4.54955f, 19.748f, 8f)
        horizontalLineTo(20f)
        curveTo(20.8284f, 8f, 21.5f, 8.67157f, 21.5f, 9.5f)
        curveTo(21.5f, 10.3284f, 20.8284f, 11f, 20f, 11f)
        horizontalLineTo(19.9381f)
        curveTo(19.446f, 14.9463f, 16.0796f, 18f, 12f, 18f)
        curveTo(7.92038f, 18f, 4.55399f, 14.9463f, 4.06189f, 11f)
        horizontalLineTo(3.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(4.5f, 8f)
        horizontalLineTo(6f)
        curveTo(9.31371f, 8f, 12f, 5.31371f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(19.5f, 8f)
        horizontalLineTo(18f)
        curveTo(14.6863f, 8f, 12f, 5.31371f, 12f, 2f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 15f)
        curveTo(12.5523f, 15f, 13f, 14.5523f, 13f, 14f)
        horizontalLineTo(11f)
        curveTo(11f, 14.5523f, 11.4477f, 15f, 12f, 15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 22f)
        curveTo(18f, 20.208f, 17.2144f, 18.5994f, 15.9687f, 17.5f)
        moveTo(6f, 22f)
        curveTo(6f, 20.208f, 6.78563f, 18.5994f, 8.03126f, 17.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 10f)
        verticalLineTo(10.01f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 10f)
        verticalLineTo(10.01f)
        }
        }.build()

        return _child!!
    }

private var _child: ImageVector? = null
