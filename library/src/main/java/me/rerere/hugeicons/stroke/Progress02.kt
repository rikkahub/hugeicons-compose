package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Progress02: ImageVector
    get() {
        if (_progress02 != null) {
            return _progress02!!
        }
        _progress02 = ImageVector.Builder(
            name = "Progress02",
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
        moveTo(19.5f, 12f)
        curveTo(19.5f, 11.0151f, 19.306f, 10.0398f, 18.9291f, 9.12987f)
        curveTo(18.5522f, 8.21993f, 17.9997f, 7.39314f, 17.3033f, 6.6967f)
        curveTo(16.6069f, 6.00026f, 15.7801f, 5.44781f, 14.8701f, 5.0709f)
        curveTo(13.9602f, 4.69399f, 12.9849f, 4.5f, 12f, 4.5f)
        lineTo(12f, 12f)
        horizontalLineTo(19.5f)
        }
        }.build()

        return _progress02!!
    }

private var _progress02: ImageVector? = null
