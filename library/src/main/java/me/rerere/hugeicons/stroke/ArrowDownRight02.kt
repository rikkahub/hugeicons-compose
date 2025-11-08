package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownRight02: ImageVector
    get() {
        if (_arrowDownRight02 != null) {
            return _arrowDownRight02!!
        }
        _arrowDownRight02 = ImageVector.Builder(
            name = "ArrowDownRight02",
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
        moveTo(13f, 13f)
        lineTo(6f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.541f, 17.9172f)
        lineTo(14.2992f, 17.8043f)
        curveTo(12.2873f, 17.6214f, 11.2814f, 17.53f, 11.0447f, 16.8761f)
        curveTo(10.8079f, 16.2223f, 11.5222f, 15.508f, 12.9507f, 14.0795f)
        lineTo(14.0795f, 12.9507f)
        curveTo(15.508f, 11.5222f, 16.2223f, 10.8079f, 16.8761f, 11.0447f)
        curveTo(17.53f, 11.2814f, 17.6214f, 12.2873f, 17.8043f, 14.2992f)
        lineTo(17.9172f, 15.541f)
        curveTo(18.0273f, 16.7523f, 18.0824f, 17.358f, 17.7202f, 17.7202f)
        curveTo(17.358f, 18.0824f, 16.7523f, 18.0273f, 15.541f, 17.9172f)
        }
        }.build()

        return _arrowDownRight02!!
    }

private var _arrowDownRight02: ImageVector? = null
