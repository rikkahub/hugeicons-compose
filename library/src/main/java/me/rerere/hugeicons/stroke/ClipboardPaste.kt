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

val HugeIcons.ClipboardPaste: ImageVector
    get() {
        if (_clipboardPaste != null) {
            return _clipboardPaste!!
        }
        _clipboardPaste = ImageVector.Builder(
            name = "ClipboardPaste",
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
            moveTo(19.502f, 13.0005f)
            horizontalLineTo(10.502f)
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
            moveTo(17.502f, 10.0005f)
            curveTo(17.502f, 10.0005f, 20.5019f, 12.21f, 20.502f, 13.0005f)
            curveTo(20.502f, 13.7911f, 17.502f, 16.0005f, 17.502f, 16.0005f)
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
            moveTo(13.998f, 2.00049f)
            horizontalLineTo(8.99805f)
            curveTo(8.16962f, 2.00049f, 7.49805f, 2.67206f, 7.49805f, 3.50049f)
            curveTo(7.49805f, 4.32892f, 8.16962f, 5.00049f, 8.99805f, 5.00049f)
            horizontalLineTo(13.998f)
            curveTo(14.8265f, 5.00049f, 15.498f, 4.32892f, 15.498f, 3.50049f)
            curveTo(15.498f, 2.67206f, 14.8265f, 2.00049f, 13.998f, 2.00049f)
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
            moveTo(15.4981f, 3.50049f)
            curveTo(17.0515f, 3.5473f, 17.9781f, 3.72056f, 18.6194f, 4.36185f)
            curveTo(19.1913f, 4.93377f, 19.391f, 5.73255f, 19.4607f, 7.00049f)
            moveTo(7.49795f, 3.50049f)
            curveTo(5.94456f, 3.5473f, 5.01802f, 3.72056f, 4.37673f, 4.36184f)
            curveTo(3.49805f, 5.24053f, 3.49805f, 6.65474f, 3.49806f, 9.48318f)
            lineTo(3.49805f, 16f)
            curveTo(3.49805f, 18.8284f, 3.49806f, 20.2426f, 4.37674f, 21.1213f)
            curveTo(5.25541f, 22f, 6.66963f, 22f, 9.49805f, 22f)
            lineTo(13.498f, 22f)
            curveTo(16.3265f, 22f, 17.7407f, 22f, 18.6194f, 21.1213f)
            curveTo(19.1092f, 20.6315f, 19.3259f, 19.9753f, 19.4219f, 19.0005f)
        }
        }.build()

        return _clipboardPaste!!
    }

private var _clipboardPaste: ImageVector? = null
