package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowUpLeft02: ImageVector
    get() {
        if (_arrowUpLeft02 != null) {
            return _arrowUpLeft02!!
        }
        _arrowUpLeft02 = ImageVector.Builder(
            name = "ArrowUpLeft02",
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
        moveTo(11f, 11f)
        lineTo(18f, 18f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(8.45901f, 6.08278f)
        lineTo(9.70078f, 6.19567f)
        curveTo(11.7127f, 6.37857f, 12.7186f, 6.47002f, 12.9553f, 7.12388f)
        curveTo(13.1921f, 7.77774f, 12.4778f, 8.49198f, 11.0493f, 9.92046f)
        lineTo(9.92046f, 11.0493f)
        curveTo(8.49198f, 12.4778f, 7.77774f, 13.1921f, 7.12388f, 12.9553f)
        curveTo(6.47002f, 12.7186f, 6.37857f, 11.7127f, 6.19567f, 9.70078f)
        lineTo(6.08278f, 8.45902f)
        curveTo(5.97266f, 7.24766f, 5.9176f, 6.64198f, 6.27979f, 6.27979f)
        curveTo(6.64198f, 5.9176f, 7.24766f, 5.97266f, 8.45901f, 6.08278f)
        }
        }.build()

        return _arrowUpLeft02!!
    }

private var _arrowUpLeft02: ImageVector? = null
