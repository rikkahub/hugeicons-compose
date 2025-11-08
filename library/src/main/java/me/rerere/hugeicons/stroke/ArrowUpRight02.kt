package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpRight02: ImageVector
    get() {
        if (_arrowUpRight02 != null) {
            return _arrowUpRight02!!
        }
        _arrowUpRight02 = ImageVector.Builder(
            name = "ArrowUpRight02",
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
        moveTo(12.9997f, 11f)
        lineTo(5.99969f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(15.5407f, 6.08278f)
        lineTo(14.2989f, 6.19567f)
        curveTo(12.287f, 6.37857f, 11.2811f, 6.47002f, 11.0444f, 7.12388f)
        curveTo(10.8076f, 7.77774f, 11.5219f, 8.49198f, 12.9504f, 9.92046f)
        lineTo(14.0792f, 11.0493f)
        curveTo(15.5077f, 12.4778f, 16.222f, 13.1921f, 16.8758f, 12.9553f)
        curveTo(17.5297f, 12.7186f, 17.6211f, 11.7127f, 17.804f, 9.70078f)
        lineTo(17.9169f, 8.45902f)
        curveTo(18.027f, 7.24766f, 18.0821f, 6.64198f, 17.7199f, 6.27979f)
        curveTo(17.3577f, 5.9176f, 16.752f, 5.97266f, 15.5407f, 6.08278f)
        }
        }.build()

        return _arrowUpRight02!!
    }

private var _arrowUpRight02: ImageVector? = null
