package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ArrowLeft04: ImageVector
    get() {
        if (_arrowLeft04 != null) {
            return _arrowLeft04!!
        }
        _arrowLeft04 = ImageVector.Builder(
            name = "ArrowLeft04",
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
        moveTo(10f, 12f)
        lineTo(20f, 12f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(5.41418f, 13.6026f)
        lineTo(6.38061f, 14.3639f)
        curveTo(7.94641f, 15.5974f, 8.72931f, 16.2141f, 9.36467f, 15.9328f)
        curveTo(10f, 15.6515f, 10f, 14.6881f, 10f, 12.7613f)
        verticalLineTo(11.2387f)
        curveTo(10f, 9.31191f, 10f, 8.34853f, 9.36467f, 8.06721f)
        curveTo(8.72931f, 7.7859f, 7.94641f, 8.40264f, 6.38062f, 9.63612f)
        lineTo(5.41418f, 10.3974f)
        curveTo(4.47141f, 11.1401f, 4.00003f, 11.5115f, 4.00003f, 12f)
        curveTo(4.00003f, 12.4885f, 4.47141f, 12.8599f, 5.41418f, 13.6026f)
        }
        }.build()

        return _arrowLeft04!!
    }

private var _arrowLeft04: ImageVector? = null
