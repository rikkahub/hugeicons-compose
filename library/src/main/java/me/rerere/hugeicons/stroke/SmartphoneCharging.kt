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

val HugeIcons.SmartphoneCharging: ImageVector
    get() {
        if (_smartphoneCharging != null) {
            return _smartphoneCharging!!
        }
        _smartphoneCharging = ImageVector.Builder(
            name = "SmartphoneCharging",
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
            moveTo(13.5f, 2f)
            horizontalLineTo(10.5f)
            curveTo(8.14298f, 2f, 6.96447f, 2f, 6.23223f, 2.73223f)
            curveTo(5.5f, 3.46447f, 5.5f, 4.64298f, 5.5f, 7f)
            verticalLineTo(17f)
            curveTo(5.5f, 19.357f, 5.5f, 20.5355f, 6.23223f, 21.2678f)
            curveTo(6.96447f, 22f, 8.14298f, 22f, 10.5f, 22f)
            horizontalLineTo(13.5f)
            curveTo(15.857f, 22f, 17.0355f, 22f, 17.7678f, 21.2678f)
            curveTo(18.5f, 20.5355f, 18.5f, 19.357f, 18.5f, 17f)
            verticalLineTo(7f)
            curveTo(18.5f, 4.64298f, 18.5f, 3.46447f, 17.7678f, 2.73223f)
            curveTo(17.0355f, 2f, 15.857f, 2f, 13.5f, 2f)
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
            moveTo(14f, 2f)
            horizontalLineTo(10f)
            lineTo(10.2236f, 2.44721f)
            curveTo(10.393f, 2.786f, 10.7393f, 3f, 11.118f, 3f)
            horizontalLineTo(12.882f)
            curveTo(13.2607f, 3f, 13.607f, 2.786f, 13.7764f, 2.44721f)
            lineTo(14f, 2f)
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
            moveTo(12.5041f, 8f)
            lineTo(10.6894f, 10.4f)
            curveTo(10.1615f, 11.0981f, 9.89753f, 11.4472f, 10.0369f, 11.7236f)
            curveTo(10.1762f, 12f, 10.6161f, 12f, 11.4959f, 12f)
            horizontalLineTo(12.5041f)
            curveTo(13.3839f, 12f, 13.8238f, 12f, 13.9631f, 12.2764f)
            curveTo(14.1025f, 12.5528f, 13.8385f, 12.9019f, 13.3106f, 13.6f)
            lineTo(11.4959f, 16f)
        }
        }.build()

        return _smartphoneCharging!!
    }

private var _smartphoneCharging: ImageVector? = null
