package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Patio: ImageVector
    get() {
        if (_patio != null) {
            return _patio!!
        }
        _patio = ImageVector.Builder(
            name = "Patio",
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
        curveTo(21.6936f, 15.3871f, 21.0672f, 15f, 20.382f, 15f)
        horizontalLineTo(3.61803f)
        curveTo(2.93283f, 15f, 2.30643f, 15.3871f, 2f, 16f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 22f)
        horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5f, 15f)
        verticalLineTo(22f)
        moveTo(9.5f, 15f)
        verticalLineTo(22f)
        moveTo(14.5f, 15f)
        verticalLineTo(22f)
        moveTo(19f, 15f)
        verticalLineTo(22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(12f, 7f)
        lineTo(15f, 3f)
        moveTo(12f, 7f)
        horizontalLineTo(6.5f)
        moveTo(12f, 7f)
        horizontalLineTo(17.5f)
        moveTo(12f, 7f)
        lineTo(9f, 3f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(6f, 8f)
        curveTo(6f, 4.68629f, 8.68629f, 2f, 12f, 2f)
        curveTo(15.3137f, 2f, 18f, 4.68629f, 18f, 8f)
        verticalLineTo(15f)
        horizontalLineTo(6f)
        verticalLineTo(8f)
        }
        }.build()

        return _patio!!
    }

private var _patio: ImageVector? = null
