package me.rerere.hugeicons.stroke

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import me.rerere.hugeicons.HugeIcons

val HugeIcons.Ampersands: ImageVector
    get() {
        if (_ampersands != null) {
            return _ampersands!!
        }
        _ampersands = ImageVector.Builder(
            name = "Ampersands",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(10f, 13.212f)
            lineTo(8.44534f, 14.8052f)
            moveTo(8.44534f, 14.8052f)
            lineTo(6.98785f, 16.2988f)
            curveTo(6.07558f, 17.2337f, 4.59648f, 17.2337f, 3.68421f, 16.2988f)
            curveTo(2.77193f, 15.3639f, 2.77193f, 13.8482f, 3.68421f, 12.9133f)
            lineTo(5.1417f, 11.4196f)
            moveTo(8.44534f, 14.8052f)
            lineTo(5.1417f, 11.4196f)
            moveTo(8.44534f, 14.8052f)
            lineTo(10f, 16.3984f)
            moveTo(5.1417f, 11.4196f)
            lineTo(6.40486f, 10.1252f)
            curveTo(7.10248f, 9.41023f, 7.10248f, 8.25111f, 6.40486f, 7.53619f)
            curveTo(5.70723f, 6.82127f, 4.57616f, 6.82127f, 3.87854f, 7.53619f)
            curveTo(3.18092f, 8.25111f, 3.18092f, 9.41023f, 3.87854f, 10.1252f)
            lineTo(5.1417f, 11.4196f)
            close()
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(21f, 13.212f)
            lineTo(19.4453f, 14.8052f)
            moveTo(19.4453f, 14.8052f)
            lineTo(17.9879f, 16.2988f)
            curveTo(17.0756f, 17.2337f, 15.5965f, 17.2337f, 14.6842f, 16.2988f)
            curveTo(13.7719f, 15.3639f, 13.7719f, 13.8482f, 14.6842f, 12.9133f)
            lineTo(16.1417f, 11.4196f)
            moveTo(19.4453f, 14.8052f)
            lineTo(16.1417f, 11.4196f)
            moveTo(19.4453f, 14.8052f)
            lineTo(21f, 16.3984f)
            moveTo(16.1417f, 11.4196f)
            lineTo(17.4049f, 10.1252f)
            curveTo(18.1025f, 9.41023f, 18.1025f, 8.25111f, 17.4049f, 7.53619f)
            curveTo(16.7072f, 6.82127f, 15.5762f, 6.82127f, 14.8785f, 7.53619f)
            curveTo(14.1809f, 8.25111f, 14.1809f, 9.41023f, 14.8785f, 10.1252f)
            lineTo(16.1417f, 11.4196f)
            close()
        }
        }.build()

        return _ampersands!!
    }

private var _ampersands: ImageVector? = null
