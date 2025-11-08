package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) {
            return _thermometerCold!!
        }
        _thermometerCold = ImageVector.Builder(
            name = "ThermometerCold",
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
        moveTo(17.5f, 22f)
        curveTo(19.7091f, 22f, 21.5f, 20.2091f, 21.5f, 18f)
        curveTo(21.5f, 16.9335f, 21.0827f, 15.9646f, 20.4024f, 15.2475f)
        curveTo(19.8957f, 14.7134f, 19.6423f, 14.4463f, 19.5712f, 14.2679f)
        curveTo(19.5f, 14.0895f, 19.5f, 13.8535f, 19.5f, 13.3815f)
        verticalLineTo(4f)
        curveTo(19.5f, 2.89543f, 18.6046f, 2f, 17.5f, 2f)
        curveTo(16.3954f, 2f, 15.5f, 2.89543f, 15.5f, 4f)
        verticalLineTo(13.3815f)
        curveTo(15.5f, 13.8535f, 15.5f, 14.0895f, 15.4288f, 14.2679f)
        curveTo(15.3577f, 14.4463f, 15.1043f, 14.7134f, 14.5976f, 15.2475f)
        curveTo(13.9173f, 15.9646f, 13.5f, 16.9335f, 13.5f, 18f)
        curveTo(13.5f, 20.2091f, 15.2909f, 22f, 17.5f, 22f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF000000)),
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
        moveTo(9.04545f, 5f)
        verticalLineTo(8.65625f)
        moveTo(9.04545f, 8.65625f)
        verticalLineTo(14.3438f)
        moveTo(9.04545f, 8.65625f)
        lineTo(11.0909f, 6.625f)
        moveTo(9.04545f, 8.65625f)
        lineTo(7f, 6.625f)
        moveTo(9.04545f, 14.3438f)
        lineTo(9.04546f, 18f)
        moveTo(9.04545f, 14.3438f)
        lineTo(7f, 16.375f)
        moveTo(9.04545f, 14.3438f)
        lineTo(11.0909f, 16.375f)
        moveTo(4.13636f, 9.46875f)
        lineTo(6.18182f, 11.5f)
        moveTo(6.18182f, 11.5f)
        lineTo(4.13636f, 13.5312f)
        moveTo(6.18182f, 11.5f)
        horizontalLineTo(11.5f)
        moveTo(6.18182f, 11.5f)
        horizontalLineTo(2.5f)
        }
        }.build()

        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
