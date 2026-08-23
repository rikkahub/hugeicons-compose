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

val HugeIcons.DoorOpen: ImageVector
    get() {
        if (_doorOpen != null) {
            return _doorOpen!!
        }
        _doorOpen = ImageVector.Builder(
            name = "DoorOpen",
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
            moveTo(4.00002f, 16.1579f)
            lineTo(4.00005f, 7.84097f)
            curveTo(4.00005f, 5.99407f, 4.00006f, 5.07062f, 4.51764f, 4.39698f)
            curveTo(5.03522f, 3.72334f, 5.92751f, 3.48547f, 7.71208f, 3.00972f)
            lineTo(11.2203f, 2.07447f)
            curveTo(11.406f, 2.02495f, 11.5974f, 1.99988f, 11.7896f, 1.99988f)
            curveTo(13.0104f, 1.99988f, 14.0001f, 2.98951f, 14.0001f, 4.21029f)
            verticalLineTo(19.789f)
            curveTo(14.0001f, 21.0097f, 13.0105f, 21.9993f, 11.7897f, 21.9993f)
            curveTo(11.5974f, 21.9993f, 11.406f, 21.9742f, 11.2202f, 21.9247f)
            lineTo(7.71171f, 20.9891f)
            curveTo(5.92728f, 20.5132f, 5.03506f, 20.2753f, 4.51753f, 19.6017f)
            curveTo(4f, 18.9281f, 4.00001f, 18.0047f, 4.00002f, 16.1579f)
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
            moveTo(11f, 10.9993f)
            verticalLineTo(12.9993f)
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
            moveTo(17.5001f, 19.9993f)
            curveTo(17.9647f, 19.9993f, 18.197f, 19.9993f, 18.3901f, 19.9608f)
            curveTo(19.1836f, 19.803f, 19.8038f, 19.1828f, 19.9616f, 18.3894f)
            curveTo(20f, 18.1962f, 20f, 17.9639f, 20f, 17.4993f)
            verticalLineTo(6.49921f)
            curveTo(20f, 6.03461f, 20f, 5.80231f, 19.9616f, 5.60913f)
            curveTo(19.8038f, 4.81571f, 19.1836f, 4.19549f, 18.3901f, 4.03769f)
            curveTo(18.197f, 3.99927f, 17.9647f, 3.99927f, 17.5001f, 3.99927f)
        }
        }.build()

        return _doorOpen!!
    }

private var _doorOpen: ImageVector? = null
