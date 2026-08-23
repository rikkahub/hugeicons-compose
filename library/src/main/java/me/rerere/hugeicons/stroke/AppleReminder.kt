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

val HugeIcons.AppleReminder: ImageVector
    get() {
        if (_appleReminder != null) {
            return _appleReminder!!
        }
        _appleReminder = ImageVector.Builder(
            name = "AppleReminder",
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
            moveTo(3f, 12f)
            curveTo(3f, 7.75736f, 3f, 5.63604f, 4.31802f, 4.31802f)
            curveTo(5.63604f, 3f, 7.75736f, 3f, 12f, 3f)
            curveTo(16.2426f, 3f, 18.364f, 3f, 19.682f, 4.31802f)
            curveTo(21f, 5.63604f, 21f, 7.75736f, 21f, 12f)
            curveTo(21f, 16.2426f, 21f, 18.364f, 19.682f, 19.682f)
            curveTo(18.364f, 21f, 16.2426f, 21f, 12f, 21f)
            curveTo(7.75736f, 21f, 5.63604f, 21f, 4.31802f, 19.682f)
            curveTo(3f, 18.364f, 3f, 16.2426f, 3f, 12f)
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
            moveTo(7.37545f, 7.99976f)
            horizontalLineTo(7.25045f)
            moveTo(7.37482f, 11.9999f)
            horizontalLineTo(7.24982f)
            moveTo(7.37498f, 15.9999f)
            horizontalLineTo(7.24998f)
            moveTo(7.50045f, 7.99976f)
            curveTo(7.50045f, 8.13783f, 7.38852f, 8.24976f, 7.25045f, 8.24976f)
            curveTo(7.11238f, 8.24976f, 7.00045f, 8.13783f, 7.00045f, 7.99976f)
            curveTo(7.00045f, 7.86169f, 7.11238f, 7.74976f, 7.25045f, 7.74976f)
            curveTo(7.38852f, 7.74976f, 7.50045f, 7.86169f, 7.50045f, 7.99976f)
            close()
            moveTo(7.49982f, 11.9999f)
            curveTo(7.49982f, 12.138f, 7.38789f, 12.2499f, 7.24982f, 12.2499f)
            curveTo(7.11175f, 12.2499f, 6.99982f, 12.138f, 6.99982f, 11.9999f)
            curveTo(6.99982f, 11.8618f, 7.11175f, 11.7499f, 7.24982f, 11.7499f)
            curveTo(7.38789f, 11.7499f, 7.49982f, 11.8618f, 7.49982f, 11.9999f)
            close()
            moveTo(7.49998f, 15.9999f)
            curveTo(7.49998f, 16.138f, 7.38805f, 16.2499f, 7.24998f, 16.2499f)
            curveTo(7.11191f, 16.2499f, 6.99998f, 16.138f, 6.99998f, 15.9999f)
            curveTo(6.99998f, 15.8618f, 7.11191f, 15.7499f, 7.24998f, 15.7499f)
            curveTo(7.38805f, 15.7499f, 7.49998f, 15.8618f, 7.49998f, 15.9999f)
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
            moveTo(11f, 8f)
            horizontalLineTo(17f)
            moveTo(11f, 12f)
            horizontalLineTo(17f)
            moveTo(11f, 16f)
            horizontalLineTo(17f)
        }
        }.build()

        return _appleReminder!!
    }

private var _appleReminder: ImageVector? = null
