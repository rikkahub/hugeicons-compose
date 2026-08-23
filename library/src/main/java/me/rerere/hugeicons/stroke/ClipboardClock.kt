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

val HugeIcons.ClipboardClock: ImageVector
    get() {
        if (_clipboardClock != null) {
            return _clipboardClock!!
        }
        _clipboardClock = ImageVector.Builder(
            name = "ClipboardClock",
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
            moveTo(21.002000000000002f, 16f)
            arcTo(6f, 6f, 0f, true, false, 9.002f, 16f)
            arcTo(6f, 6f, 0f, true, false, 21.002000000000002f, 16f)
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
            moveTo(15.002f, 13.5f)
            verticalLineTo(16f)
            lineTo(16.502f, 17f)
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
            moveTo(13.498f, 2f)
            horizontalLineTo(8.49805f)
            curveTo(7.66962f, 2f, 6.99805f, 2.67157f, 6.99805f, 3.5f)
            curveTo(6.99805f, 4.32843f, 7.66962f, 5f, 8.49805f, 5f)
            horizontalLineTo(13.498f)
            curveTo(14.3265f, 5f, 14.998f, 4.32843f, 14.998f, 3.5f)
            curveTo(14.998f, 2.67157f, 14.3265f, 2f, 13.498f, 2f)
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
            moveTo(14.9981f, 3.5f)
            curveTo(16.5515f, 3.54681f, 17.4781f, 3.72007f, 18.1194f, 4.36137f)
            curveTo(18.6913f, 4.93328f, 18.891f, 5.73206f, 18.9607f, 7f)
            moveTo(6.99795f, 3.5f)
            curveTo(5.44456f, 3.54681f, 4.51802f, 3.72007f, 3.87673f, 4.36136f)
            curveTo(2.99805f, 5.24004f, 2.99805f, 6.65425f, 2.99806f, 9.48269f)
            lineTo(2.99805f, 15.9995f)
            curveTo(2.99805f, 18.8279f, 2.99806f, 20.2421f, 3.87674f, 21.1208f)
            curveTo(4.51802f, 21.7621f, 5.44457f, 21.9353f, 6.99795f, 21.9821f)
        }
        }.build()

        return _clipboardClock!!
    }

private var _clipboardClock: ImageVector? = null
