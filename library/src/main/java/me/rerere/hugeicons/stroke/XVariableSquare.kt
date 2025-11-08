package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.XVariableSquare: ImageVector
    get() {
        if (_xVariableSquare != null) {
            return _xVariableSquare!!
        }
        _xVariableSquare = ImageVector.Builder(
            name = "XVariableSquare",
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
        moveTo(2.5f, 12f)
        curveTo(2.5f, 7.52166f, 2.5f, 5.28249f, 3.89124f, 3.89124f)
        curveTo(5.28249f, 2.5f, 7.52166f, 2.5f, 12f, 2.5f)
        curveTo(16.4783f, 2.5f, 18.7175f, 2.5f, 20.1088f, 3.89124f)
        curveTo(21.5f, 5.28249f, 21.5f, 7.52166f, 21.5f, 12f)
        curveTo(21.5f, 16.4783f, 21.5f, 18.7175f, 20.1088f, 20.1088f)
        curveTo(18.7175f, 21.5f, 16.4783f, 21.5f, 12f, 21.5f)
        curveTo(7.52166f, 21.5f, 5.28249f, 21.5f, 3.89124f, 20.1088f)
        curveTo(2.5f, 18.7175f, 2.5f, 16.4783f, 2.5f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(16f, 9f)
        curveTo(12.8164f, 9f, 11.1837f, 15.0208f, 8f, 15.0208f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5409f, 15.0208f)
        curveTo(14.7321f, 15.0208f, 14.2877f, 15.0208f, 13.9468f, 14.8998f)
        curveTo(13.7532f, 14.831f, 13.5769f, 14.7349f, 13.4265f, 14.6161f)
        curveTo(13.1619f, 14.4069f, 13.0167f, 14.1072f, 12.7263f, 13.5079f)
        lineTo(11.2755f, 10.5129f)
        curveTo(10.9852f, 9.91359f, 10.84f, 9.61391f, 10.5753f, 9.40473f)
        curveTo(10.425f, 9.28591f, 10.2487f, 9.18978f, 10.0551f, 9.12103f)
        curveTo(9.71415f, 9f, 9.26975f, 9f, 8.46094f, 9f)
        }
        }.build()

        return _xVariableSquare!!
    }

private var _xVariableSquare: ImageVector? = null
