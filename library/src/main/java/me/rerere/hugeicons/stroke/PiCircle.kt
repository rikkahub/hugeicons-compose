package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.PiCircle: ImageVector
    get() {
        if (_piCircle != null) {
            return _piCircle!!
        }
        _piCircle = ImageVector.Builder(
            name = "PiCircle",
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
        moveTo(17f, 8f)
        horizontalLineTo(9.22222f)
        curveTo(7.99492f, 8f, 7f, 8.89543f, 7f, 10f)
        moveTo(10.3333f, 8f)
        lineTo(9.3738f, 14.9086f)
        curveTo(9.29052f, 15.5083f, 8.67713f, 15.9299f, 8.01245f, 15.8445f)
        curveTo(7.5622f, 15.7866f, 7.18693f, 15.5047f, 7.04309f, 15.1164f)
        lineTo(7f, 15f)
        moveTo(13.6667f, 16f)
        lineTo(14.7778f, 8f)
        }
        }.build()

        return _piCircle!!
    }

private var _piCircle: ImageVector? = null
