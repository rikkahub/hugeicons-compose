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

val HugeIcons.ClipboardCopy: ImageVector
    get() {
        if (_clipboardCopy != null) {
            return _clipboardCopy!!
        }
        _clipboardCopy = ImageVector.Builder(
            name = "ClipboardCopy",
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
            moveTo(11.502f, 13.0003f)
            lineTo(20.502f, 13.0003f)
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
            moveTo(13.5019f, 10.0003f)
            curveTo(13.5019f, 10.0003f, 10.502f, 12.2097f, 10.502f, 13.0003f)
            curveTo(10.5019f, 13.7909f, 13.502f, 16.0003f, 13.502f, 16.0003f)
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
            moveTo(13.998f, 2.00027f)
            horizontalLineTo(8.99805f)
            curveTo(8.16962f, 2.00027f, 7.49805f, 2.67185f, 7.49805f, 3.50027f)
            curveTo(7.49805f, 4.3287f, 8.16962f, 5.00027f, 8.99805f, 5.00027f)
            horizontalLineTo(13.998f)
            curveTo(14.8265f, 5.00027f, 15.498f, 4.3287f, 15.498f, 3.50027f)
            curveTo(15.498f, 2.67185f, 14.8265f, 2.00027f, 13.998f, 2.00027f)
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
            moveTo(15.4981f, 3.50027f)
            curveTo(17.0515f, 3.54709f, 17.9781f, 3.72035f, 18.6194f, 4.36164f)
            curveTo(19.4466f, 5.18885f, 19.495f, 6.49068f, 19.4979f, 9.00027f)
            moveTo(7.49795f, 3.50027f)
            curveTo(5.94456f, 3.54708f, 5.01802f, 3.72034f, 4.37673f, 4.36163f)
            curveTo(3.49805f, 5.24031f, 3.49805f, 6.65453f, 3.49806f, 9.48296f)
            lineTo(3.49805f, 15.9998f)
            curveTo(3.49805f, 18.8282f, 3.49806f, 20.2424f, 4.37674f, 21.1211f)
            curveTo(5.25541f, 21.9997f, 6.66963f, 21.9997f, 9.49805f, 21.9997f)
            lineTo(13.498f, 21.9997f)
            curveTo(16.3265f, 21.9997f, 17.7407f, 21.9997f, 18.6194f, 21.1211f)
            curveTo(19.3877f, 20.3527f, 19.4842f, 19.175f, 19.4963f, 17.0003f)
        }
        }.build()

        return _clipboardCopy!!
    }

private var _clipboardCopy: ImageVector? = null
