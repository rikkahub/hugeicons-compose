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

val HugeIcons.HouseHeart: ImageVector
    get() {
        if (_houseHeart != null) {
            return _houseHeart!!
        }
        _houseHeart = ImageVector.Builder(
            name = "HouseHeart",
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
            moveTo(11.5f, 21f)
            horizontalLineTo(9.5f)
            curveTo(6.20017f, 21f, 4.55025f, 21f, 3.52513f, 19.9749f)
            curveTo(2.5f, 18.9497f, 2.5f, 17.2998f, 2.5f, 14f)
            lineTo(2.5f, 11.4896f)
            curveTo(2.5f, 9.80834f, 2.5f, 8.96773f, 2.8559f, 8.24005f)
            curveTo(3.21179f, 7.51237f, 3.87533f, 6.99628f, 5.20241f, 5.96411f)
            lineTo(7.20242f, 4.40855f)
            curveTo(9.26689f, 2.80285f, 10.2991f, 2f, 11.5f, 2f)
            curveTo(12.7009f, 2f, 13.7331f, 2.80285f, 15.7976f, 4.40855f)
            lineTo(17.7976f, 5.96411f)
            curveTo(19.1247f, 6.99628f, 19.7882f, 7.51237f, 20.1441f, 8.24005f)
            curveTo(20.5f, 8.96773f, 20.5f, 9.80834f, 20.5f, 11.4896f)
            verticalLineTo(12f)
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
            moveTo(16.4902f, 21.6365f)
            curveTo(15.3052f, 20.682f, 13.5f, 18.95f, 13.5f, 17.2561f)
            curveTo(13.5f, 16.0101f, 14.3421f, 15f, 15.5f, 15f)
            curveTo(16.1f, 15f, 16.7f, 15.2172f, 17.5f, 16.0858f)
            curveTo(18.3f, 15.2172f, 18.9f, 15f, 19.5f, 15f)
            curveTo(20.6579f, 15f, 21.5f, 16.0101f, 21.5f, 17.2561f)
            curveTo(21.5f, 18.95f, 19.6948f, 20.682f, 18.5098f, 21.6365f)
            curveTo(17.908f, 22.1212f, 17.092f, 22.1212f, 16.4902f, 21.6365f)
            close()
        }
        }.build()

        return _houseHeart!!
    }

private var _houseHeart: ImageVector? = null
