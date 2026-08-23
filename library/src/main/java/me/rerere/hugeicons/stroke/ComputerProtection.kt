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

val HugeIcons.ComputerProtection: ImageVector
    get() {
        if (_computerProtection != null) {
            return _computerProtection!!
        }
        _computerProtection = ImageVector.Builder(
            name = "ComputerProtection",
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
            moveTo(14f, 22f)
            horizontalLineTo(16f)
            moveTo(14f, 22f)
            curveTo(13.1716f, 22f, 12.5f, 21.3284f, 12.5f, 20.5f)
            verticalLineTo(18f)
            lineTo(12f, 18f)
            moveTo(14f, 22f)
            horizontalLineTo(10f)
            moveTo(10f, 22f)
            horizontalLineTo(8f)
            moveTo(10f, 22f)
            curveTo(10.8284f, 22f, 11.5f, 21.3284f, 11.5f, 20.5f)
            verticalLineTo(18f)
            lineTo(12f, 18f)
            moveTo(12f, 18f)
            verticalLineTo(22f)
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
            moveTo(11f, 4f)
            horizontalLineTo(8f)
            curveTo(5.17157f, 4f, 3.75736f, 4f, 2.87868f, 4.87868f)
            curveTo(2f, 5.75736f, 2f, 7.17157f, 2f, 10f)
            verticalLineTo(12f)
            curveTo(2f, 14.8284f, 2f, 16.2426f, 2.87868f, 17.1213f)
            curveTo(3.75736f, 18f, 5.17157f, 18f, 8f, 18f)
            horizontalLineTo(16f)
            curveTo(18.8284f, 18f, 20.2426f, 18f, 21.1213f, 17.1213f)
            curveTo(21.8897f, 16.3529f, 21.9862f, 15.175f, 21.9983f, 13f)
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
            moveTo(22f, 5.62043f)
            verticalLineTo(3.6493f)
            curveTo(22f, 3.3393f, 21.7723f, 3.08201f, 21.477f, 3.02921f)
            curveTo(20.2869f, 2.81643f, 19.299f, 2.34309f, 18.817f, 2.08062f)
            curveTo(18.6197f, 1.97313f, 18.3803f, 1.97313f, 18.183f, 2.08062f)
            curveTo(17.701f, 2.34309f, 16.7131f, 2.81643f, 15.523f, 3.02921f)
            curveTo(15.2277f, 3.08201f, 15f, 3.3393f, 15f, 3.6493f)
            verticalLineTo(5.62043f)
            curveTo(15f, 8.19182f, 17.5424f, 9.59437f, 18.2935f, 9.9526f)
            curveTo(18.426f, 10.0158f, 18.574f, 10.0158f, 18.7065f, 9.9526f)
            curveTo(19.4576f, 9.59437f, 22f, 8.19182f, 22f, 5.62043f)
            close()
        }
        }.build()

        return _computerProtection!!
    }

private var _computerProtection: ImageVector? = null
