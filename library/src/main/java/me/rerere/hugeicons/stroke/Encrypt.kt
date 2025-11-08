package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Encrypt: ImageVector
    get() {
        if (_encrypt != null) {
            return _encrypt!!
        }
        _encrypt = ImageVector.Builder(
            name = "Encrypt",
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
        moveTo(22f, 16f)
        lineTo(20f, 14f)
        horizontalLineTo(10.5322f)
        curveTo(9.7959f, 12.5183f, 8.26687f, 11.5f, 6.5f, 11.5f)
        curveTo(4.01471f, 11.5f, 2f, 13.5147f, 2f, 16f)
        curveTo(2f, 18.4852f, 4.01471f, 20.5f, 6.5f, 20.5f)
        curveTo(8.26685f, 20.5f, 9.79587f, 19.4817f, 10.5322f, 18f)
        horizontalLineTo(16.5f)
        lineTo(17.75f, 16.7073f)
        lineTo(19f, 18f)
        horizontalLineTo(20f)
        lineTo(22f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 16f)
        horizontalLineTo(7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3.5f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 7f)
        verticalLineTo(5f)
        curveTo(6f, 4.17157f, 6.67157f, 3.5f, 7.5f, 3.5f)
        curveTo(8.32843f, 3.5f, 9f, 4.17157f, 9f, 5f)
        verticalLineTo(7f)
        curveTo(9f, 7.82843f, 8.32843f, 8.5f, 7.5f, 8.5f)
        curveTo(6.67157f, 8.5f, 6f, 7.82843f, 6f, 7f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 3.5f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 3.5f)
        verticalLineTo(8.5f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(18f, 7f)
        verticalLineTo(5f)
        curveTo(18f, 4.17157f, 18.6716f, 3.5f, 19.5f, 3.5f)
        curveTo(20.3284f, 3.5f, 21f, 4.17157f, 21f, 5f)
        verticalLineTo(7f)
        curveTo(21f, 7.82843f, 20.3284f, 8.5f, 19.5f, 8.5f)
        curveTo(18.6716f, 8.5f, 18f, 7.82843f, 18f, 7f)
        }
        }.build()

        return _encrypt!!
    }

private var _encrypt: ImageVector? = null
