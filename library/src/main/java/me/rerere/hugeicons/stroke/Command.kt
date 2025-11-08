package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Command: ImageVector
    get() {
        if (_command != null) {
            return _command!!
        }
        _command = ImageVector.Builder(
            name = "Command",
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
        moveTo(15f, 9f)
        verticalLineTo(15f)
        horizontalLineTo(9f)
        verticalLineTo(9f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 15f)
        horizontalLineTo(18f)
        curveTo(19.6569f, 15f, 21f, 16.3431f, 21f, 18f)
        curveTo(21f, 19.6569f, 19.6569f, 21f, 18f, 21f)
        curveTo(16.3431f, 21f, 15f, 19.6569f, 15f, 18f)
        verticalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 15.002f)
        horizontalLineTo(6f)
        curveTo(4.34315f, 15.002f, 3f, 16.3451f, 3f, 18.002f)
        curveTo(3f, 19.6588f, 4.34315f, 21.002f, 6f, 21.002f)
        curveTo(7.65685f, 21.002f, 9f, 19.6588f, 9f, 18.002f)
        verticalLineTo(15.002f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15f, 9f)
        lineTo(15f, 6f)
        curveTo(15f, 4.34315f, 16.3431f, 3f, 18f, 3f)
        curveTo(19.6569f, 3f, 21f, 4.34315f, 21f, 6f)
        curveTo(21f, 7.65685f, 19.6569f, 9f, 18f, 9f)
        horizontalLineTo(15f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9f, 9f)
        verticalLineTo(6f)
        curveTo(9f, 4.34315f, 7.65685f, 3f, 6f, 3f)
        curveTo(4.34315f, 3f, 3f, 4.34315f, 3f, 6f)
        curveTo(3f, 7.65685f, 4.34315f, 9f, 6f, 9f)
        horizontalLineTo(9f)
        }
        }.build()

        return _command!!
    }

private var _command: ImageVector? = null
