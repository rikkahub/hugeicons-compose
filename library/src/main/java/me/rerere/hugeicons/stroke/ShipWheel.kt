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

val HugeIcons.ShipWheel: ImageVector
    get() {
        if (_shipWheel != null) {
            return _shipWheel!!
        }
        _shipWheel = ImageVector.Builder(
            name = "ShipWheel",
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
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(19.9922f, 11.9939f)
            arcTo(8f, 8f, 0f, true, false, 3.9922000000000004f, 11.9939f)
            arcTo(8f, 8f, 0f, true, false, 19.9922f, 11.9939f)
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
            moveTo(14.9922f, 11.9939f)
            lineTo(21.9922f, 11.9938f)
            moveTo(1.99219f, 11.9938f)
            lineTo(8.99219f, 11.9939f)
            moveTo(11.9972f, 14.9939f)
            verticalLineTo(22.0003f)
            moveTo(11.9967f, 1.99976f)
            lineTo(11.9922f, 8.9939f)
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
            moveTo(14.4941f, 14.4939f)
            lineTo(19.0693f, 19.0667f)
            moveTo(4.92716f, 4.92456f)
            lineTo(9.49414f, 9.4939f)
            moveTo(9.49414f, 14.4939f)
            lineTo(4.92578f, 19.075f)
            moveTo(19.0686f, 4.93216f)
            lineTo(14.4941f, 9.4939f)
        }

        path(
            fill = null,
            stroke = SolidColor(Color(0xFF141B34)),
            fillAlpha = 1f,
            strokeAlpha = 1f,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(14.9922f, 11.9939f)
            arcTo(3f, 3f, 0f, true, false, 8.9922f, 11.9939f)
            arcTo(3f, 3f, 0f, true, false, 14.9922f, 11.9939f)
            close()
        }
        }.build()

        return _shipWheel!!
    }

private var _shipWheel: ImageVector? = null
