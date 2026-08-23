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

val HugeIcons.ChartArea: ImageVector
    get() {
        if (_chartArea != null) {
            return _chartArea!!
        }
        _chartArea = ImageVector.Builder(
            name = "ChartArea",
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
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(3f, 3f)
            verticalLineTo(13f)
            curveTo(3f, 16.7712f, 3f, 18.6569f, 4.17157f, 19.8284f)
            curveTo(5.34315f, 21f, 7.22876f, 21f, 11f, 21f)
            horizontalLineTo(21f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(15f, 17f)
            horizontalLineTo(9.82843f)
            curveTo(9.05733f, 17f, 8.67178f, 17f, 8.36077f, 16.8958f)
            curveTo(7.76904f, 16.6975f, 7.3045f, 16.2361f, 7.1049f, 15.6483f)
            curveTo(7f, 15.3393f, 7f, 14.9563f, 7f, 14.1904f)
            curveTo(7f, 13.8552f, 7f, 13.6876f, 7.0264f, 13.5278f)
            curveTo(7.07629f, 13.2258f, 7.19574f, 12.9393f, 7.37543f, 12.6907f)
            curveTo(7.47051f, 12.5592f, 7.58982f, 12.4407f, 7.82843f, 12.2036f)
            lineTo(8.70852f, 11.3294f)
            curveTo(9.32187f, 10.7201f, 9.62855f, 10.4155f, 10.0161f, 10.398f)
            curveTo(10.4036f, 10.3806f, 10.7367f, 10.6564f, 11.4031f, 11.208f)
            lineTo(11.5969f, 11.3684f)
            curveTo(12.2633f, 11.92f, 12.5964f, 12.1958f, 12.9839f, 12.1784f)
            curveTo(13.3715f, 12.1609f, 13.6781f, 11.8563f, 14.2915f, 11.247f)
            lineTo(15.5858f, 9.96127f)
            curveTo(17.0388f, 8.51787f, 17.7654f, 7.79617f, 18.3827f, 8.05017f)
            curveTo(19f, 8.30417f, 19f, 9.32481f, 19f, 11.3661f)
            verticalLineTo(13.0266f)
            curveTo(19f, 14.8997f, 19f, 15.8362f, 18.4142f, 16.4181f)
            curveTo(17.8284f, 17f, 16.8856f, 17f, 15f, 17f)
            close()
        }
        }.build()

        return _chartArea!!
    }

private var _chartArea: ImageVector? = null
