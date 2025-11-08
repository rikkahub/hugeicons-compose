package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.LeftToRightListNumber: ImageVector
    get() {
        if (_leftToRightListNumber != null) {
            return _leftToRightListNumber!!
        }
        _leftToRightListNumber = ImageVector.Builder(
            name = "LeftToRightListNumber",
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
        moveTo(11f, 6f)
        lineTo(21f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 12f)
        lineTo(21f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(11f, 18f)
        lineTo(21f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 15f)
        horizontalLineTo(4.5f)
        curveTo(4.77879f, 15f, 4.91819f, 15f, 5.03411f, 15.0231f)
        curveTo(5.51014f, 15.1177f, 5.88225f, 15.4899f, 5.97694f, 15.9659f)
        curveTo(6f, 16.0818f, 6f, 16.2212f, 6f, 16.5f)
        curveTo(6f, 16.7788f, 6f, 16.9182f, 5.97694f, 17.0341f)
        curveTo(5.88225f, 17.5101f, 5.51014f, 17.8823f, 5.03411f, 17.9769f)
        curveTo(4.91819f, 18f, 4.77879f, 18f, 4.5f, 18f)
        curveTo(4.22121f, 18f, 4.08181f, 18f, 3.96589f, 18.0231f)
        curveTo(3.48986f, 18.1177f, 3.11775f, 18.4899f, 3.02306f, 18.9659f)
        curveTo(3f, 19.0818f, 3f, 19.2212f, 3f, 19.5f)
        verticalLineTo(20.4f)
        curveTo(3f, 20.6828f, 3f, 20.8243f, 3.08787f, 20.9121f)
        curveTo(3.17574f, 21f, 3.31716f, 21f, 3.6f, 21f)
        horizontalLineTo(6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(3f, 3f)
        horizontalLineTo(4.2f)
        curveTo(4.36569f, 3f, 4.5f, 3.13431f, 4.5f, 3.3f)
        verticalLineTo(9f)
        moveTo(4.5f, 9f)
        horizontalLineTo(3f)
        moveTo(4.5f, 9f)
        horizontalLineTo(6f)
        }
        }.build()

        return _leftToRightListNumber!!
    }

private var _leftToRightListNumber: ImageVector? = null
