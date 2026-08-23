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

val HugeIcons.AiVideo01: ImageVector
    get() {
        if (_aiVideo01 != null) {
            return _aiVideo01!!
        }
        _aiVideo01 = ImageVector.Builder(
            name = "AiVideo01",
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
            moveTo(2f, 10.5f)
            verticalLineTo(15f)
            curveTo(2f, 17.8284f, 2f, 19.2426f, 2.87868f, 20.1213f)
            curveTo(3.75736f, 21f, 5.17157f, 21f, 8f, 21f)
            horizontalLineTo(11f)
            curveTo(13.3456f, 21f, 14.5184f, 21f, 15.3263f, 20.3801f)
            curveTo(15.5343f, 20.2205f, 15.7205f, 20.0343f, 15.8801f, 19.8263f)
            curveTo(16.5f, 19.0184f, 16.5f, 17.8456f, 16.5f, 15.5f)
            lineTo(17.1003f, 15.9911f)
            curveTo(19.2232f, 17.7281f, 20.2847f, 18.5966f, 21.1423f, 18.1901f)
            curveTo(22f, 17.7837f, 22f, 16.4122f, 22f, 13.6693f)
            verticalLineTo(12.3307f)
            curveTo(22f, 9.58777f, 22f, 8.21628f, 21.1423f, 7.80986f)
            curveTo(20.2847f, 7.40343f, 19.2232f, 8.27191f, 17.1003f, 10.0089f)
            lineTo(16.5f, 10.5f)
            curveTo(16.5f, 8.15442f, 16.5f, 6.98164f, 15.8801f, 6.17372f)
            curveTo(15.7205f, 5.96572f, 15.5343f, 5.77954f, 15.3263f, 5.61994f)
            curveTo(14.5184f, 5f, 13.3456f, 5f, 11f, 5f)
            horizontalLineTo(10.5f)
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
            moveTo(4.5f, 3.9375f)
            verticalLineTo(5.5f)
            moveTo(4.5f, 5.5f)
            verticalLineTo(7.0625f)
            moveTo(4.5f, 5.5f)
            horizontalLineTo(3.25f)
            moveTo(4.5f, 5.5f)
            horizontalLineTo(5.75f)
            moveTo(7f, 5.5f)
            lineTo(5.91557f, 5.13852f)
            curveTo(5.41789f, 4.97263f, 5.02737f, 4.58211f, 4.86148f, 4.08443f)
            lineTo(4.5f, 3f)
            lineTo(4.13852f, 4.08443f)
            curveTo(3.97263f, 4.58211f, 3.58211f, 4.97263f, 3.08443f, 5.13852f)
            lineTo(2f, 5.5f)
            lineTo(3.08443f, 5.86148f)
            curveTo(3.58211f, 6.02737f, 3.97263f, 6.41789f, 4.13852f, 6.91557f)
            lineTo(4.5f, 8f)
            lineTo(4.86148f, 6.91557f)
            curveTo(5.02737f, 6.41789f, 5.41789f, 6.02737f, 5.91557f, 5.86148f)
            lineTo(7f, 5.5f)
            close()
        }
        }.build()

        return _aiVideo01!!
    }

private var _aiVideo01: ImageVector? = null
