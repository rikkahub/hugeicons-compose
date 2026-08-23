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

val HugeIcons.DnaOff: ImageVector
    get() {
        if (_dnaOff != null) {
            return _dnaOff!!
        }
        _dnaOff = ImageVector.Builder(
            name = "DnaOff",
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
            moveTo(8.5f, 22f)
            curveTo(9f, 21.5f, 9.5f, 20.5f, 9.5f, 18f)
            moveTo(8.6671f, 15.3336f)
            curveTo(7.33381f, 10.0004f, 8.33378f, 9.00042f, 8.6671f, 8.6671f)
            moveTo(8.6671f, 15.3336f)
            curveTo(3.33394f, 14.0003f, 2.66664f, 14.6663f, 2f, 15.3329f)
            moveTo(8.6671f, 15.3336f)
            curveTo(14.0003f, 16.6668f, 14.9996f, 15.6662f, 15.3329f, 15.3329f)
            moveTo(22f, 8.6671f)
            curveTo(21.3334f, 9.33375f, 20.6667f, 10.0004f, 15.3336f, 8.6671f)
            moveTo(15.3336f, 8.6671f)
            curveTo(14.534f, 8.4672f, 13.8318f, 8.31976f, 13.2146f, 8.21464f)
            moveTo(15.3336f, 8.6671f)
            curveTo(15.5334f, 9.46669f, 15.6809f, 10.1689f, 15.786f, 10.786f)
            moveTo(15.3329f, 2f)
            curveTo(15f, 2.5f, 14.5f, 3.5f, 14.5f, 6f)
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
            moveTo(2f, 2f)
            lineTo(22f, 22f)
        }
        }.build()

        return _dnaOff!!
    }

private var _dnaOff: ImageVector? = null
