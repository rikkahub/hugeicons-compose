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

val HugeIcons.Pepper: ImageVector
    get() {
        if (_pepper != null) {
            return _pepper!!
        }
        _pepper = ImageVector.Builder(
            name = "Pepper",
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
            moveTo(19.5f, 2.5f)
            lineTo(19.7379f, 2.73791f)
            curveTo(20.2259f, 3.22587f, 20.5f, 3.88768f, 20.5f, 4.57776f)
            curveTo(20.5f, 4.85742f, 20.4549f, 5.13526f, 20.3665f, 5.40057f)
            lineTo(20f, 6.5f)
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
            moveTo(12.6115f, 7.65261f)
            curveTo(13.4353f, 8.68253f, 14.8631f, 8.5f, 15.5f, 8.5f)
            curveTo(15.3784f, 8.86477f, 15.2213f, 9.65531f, 15.3006f, 10.5222f)
            curveTo(15.3579f, 11.1491f, 15.8527f, 11.6305f, 16.4791f, 11.6927f)
            curveTo(17.0681f, 11.7511f, 17.801f, 11.733f, 18.5f, 11.5f)
            curveTo(18.5f, 12.1369f, 18.3175f, 13.5647f, 19.3474f, 14.3885f)
            curveTo(19.4434f, 14.4653f, 19.5656f, 14.5f, 19.6886f, 14.5f)
            curveTo(19.8846f, 14.5f, 20.0692f, 14.4077f, 20.1869f, 14.2509f)
            lineTo(20.3f, 14.1f)
            curveTo(21.0789f, 13.0614f, 21.5f, 11.7982f, 21.5f, 10.5f)
            curveTo(21.5f, 7.73858f, 19.2614f, 5.5f, 16.5f, 5.5f)
            curveTo(15.2018f, 5.5f, 13.9386f, 5.92107f, 12.9f, 6.7f)
            lineTo(12.7491f, 6.81315f)
            curveTo(12.5923f, 6.93077f, 12.5f, 7.11538f, 12.5f, 7.31142f)
            curveTo(12.5f, 7.43438f, 12.5347f, 7.55659f, 12.6115f, 7.65261f)
            close()
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
            moveTo(12.5f, 8.5f)
            curveTo(10.1115f, 11.3662f, 9.09218f, 14.6888f, 5.9537f, 17.1597f)
            curveTo(5.65753f, 17.3929f, 5.33065f, 17.5847f, 4.99351f, 17.7532f)
            lineTo(3.35412f, 18.5729f)
            curveTo(2.83066f, 18.8347f, 2.5f, 19.3697f, 2.5f, 19.9549f)
            curveTo(2.5f, 20.8083f, 3.19177f, 21.5001f, 4.04512f, 21.5001f)
            horizontalLineTo(4.5f)
            curveTo(10.0736f, 21.5001f, 16.5101f, 17.617f, 19f, 14.2595f)
        }
        }.build()

        return _pepper!!
    }

private var _pepper: ImageVector? = null
