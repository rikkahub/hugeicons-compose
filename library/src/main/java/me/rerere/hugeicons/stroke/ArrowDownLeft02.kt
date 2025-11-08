package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowDownLeft02: ImageVector
    get() {
        if (_arrowDownLeft02 != null) {
            return _arrowDownLeft02!!
        }
        _arrowDownLeft02 = ImageVector.Builder(
            name = "ArrowDownLeft02",
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
        moveTo(10.9999f, 13f)
        lineTo(17.9999f, 6f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.45901f, 17.9172f)
        lineTo(9.70078f, 17.8043f)
        curveTo(11.7127f, 17.6214f, 12.7186f, 17.53f, 12.9553f, 16.8761f)
        curveTo(13.1921f, 16.2223f, 12.4778f, 15.508f, 11.0493f, 14.0795f)
        lineTo(9.92046f, 12.9507f)
        curveTo(8.49198f, 11.5222f, 7.77774f, 10.8079f, 7.12388f, 11.0447f)
        curveTo(6.47002f, 11.2814f, 6.37857f, 12.2873f, 6.19567f, 14.2992f)
        lineTo(6.08278f, 15.541f)
        curveTo(5.97266f, 16.7523f, 5.9176f, 17.358f, 6.27979f, 17.7202f)
        curveTo(6.64198f, 18.0824f, 7.24766f, 18.0273f, 8.45901f, 17.9172f)
        }
        }.build()

        return _arrowDownLeft02!!
    }

private var _arrowDownLeft02: ImageVector? = null
