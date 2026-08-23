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

val HugeIcons.PhoneForwarded: ImageVector
    get() {
        if (_phoneForwarded != null) {
            return _phoneForwarded!!
        }
        _phoneForwarded = ImageVector.Builder(
            name = "PhoneForwarded",
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
            moveTo(4.90404f, 10.5413f)
            lineTo(7.54448f, 7.90088f)
            curveTo(8.08309f, 7.36227f, 8.26947f, 6.56642f, 8.05163f, 5.83652f)
            curveTo(7.88129f, 5.26577f, 7.68937f, 4.57964f, 7.5618f, 3.99292f)
            curveTo(7.44381f, 3.45027f, 6.96763f, 3f, 6.41231f, 3f)
            horizontalLineTo(4.90404f)
            curveTo(3.79339f, 3f, 2.8813f, 3.90384f, 3.00313f, 5.0078f)
            curveTo(3.92928f, 13.3996f, 10.5926f, 20.0629f, 18.9844f, 20.9891f)
            curveTo(20.0883f, 21.1109f, 20.9922f, 20.1988f, 20.9922f, 19.0881f)
            verticalLineTo(17.5799f)
            curveTo(20.9922f, 17.0246f, 20.5401f, 16.569f, 19.9937f, 16.4696f)
            curveTo(19.391f, 16.36f, 18.7533f, 16.1804f, 18.2198f, 16.0103f)
            curveTo(17.4533f, 15.7659f, 16.6013f, 15.9377f, 16.0325f, 16.5065f)
            lineTo(13.4509f, 19.0881f)
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
            moveTo(17.9922f, 10f)
            curveTo(18.599f, 9.41016f, 20.9922f, 7.84027f, 20.9922f, 7f)
            curveTo(20.9922f, 6.15973f, 18.599f, 4.58984f, 17.9922f, 4f)
            moveTo(20.4922f, 7f)
            horizontalLineTo(12.9922f)
        }
        }.build()

        return _phoneForwarded!!
    }

private var _phoneForwarded: ImageVector? = null
