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

val HugeIcons.WebProtection: ImageVector
    get() {
        if (_webProtection != null) {
            return _webProtection!!
        }
        _webProtection = ImageVector.Builder(
            name = "WebProtection",
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
            moveTo(3.5f, 7.50006f)
            horizontalLineTo(20.5f)
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
            moveTo(11f, 20.5001f)
            curveTo(7.22876f, 20.5001f, 5.34315f, 20.5001f, 4.17157f, 19.3285f)
            curveTo(3f, 18.1569f, 3f, 16.2713f, 3f, 12.5001f)
            verticalLineTo(10.5001f)
            curveTo(3f, 6.72882f, 3f, 4.84321f, 4.17157f, 3.67163f)
            curveTo(5.34315f, 2.50006f, 7.22876f, 2.50006f, 11f, 2.50006f)
            horizontalLineTo(13f)
            curveTo(16.7712f, 2.50006f, 18.6569f, 2.50006f, 19.8284f, 3.67163f)
            curveTo(21f, 4.84321f, 21f, 6.72883f, 21f, 10.5001f)
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
            moveTo(21f, 17.1205f)
            verticalLineTo(15.1494f)
            curveTo(21f, 14.8394f, 20.7723f, 14.5821f, 20.477f, 14.5293f)
            curveTo(19.2869f, 14.3165f, 18.299f, 13.8431f, 17.817f, 13.5807f)
            curveTo(17.6197f, 13.4732f, 17.3803f, 13.4732f, 17.183f, 13.5807f)
            curveTo(16.701f, 13.8431f, 15.7131f, 14.3165f, 14.523f, 14.5293f)
            curveTo(14.2277f, 14.5821f, 14f, 14.8394f, 14f, 15.1494f)
            verticalLineTo(17.1205f)
            curveTo(14f, 19.6919f, 16.5424f, 21.0944f, 17.2935f, 21.4527f)
            curveTo(17.426f, 21.5159f, 17.574f, 21.5159f, 17.7065f, 21.4527f)
            curveTo(18.4576f, 21.0944f, 21f, 19.6919f, 21f, 17.1205f)
            close()
        }
        }.build()

        return _webProtection!!
    }

private var _webProtection: ImageVector? = null
