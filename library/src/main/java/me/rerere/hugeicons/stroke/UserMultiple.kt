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

val HugeIcons.UserMultiple: ImageVector
    get() {
        if (_userMultiple != null) {
            return _userMultiple!!
        }
        _userMultiple = ImageVector.Builder(
            name = "UserMultiple",
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
            moveTo(16f, 21f)
            curveTo(15.7668f, 18.0685f, 13.3422f, 15.7477f, 10.3085f, 15.5521f)
            lineTo(9.49999f, 15.5f)
            curveTo(9.21121f, 15.5076f, 8.94209f, 15.5178f, 8.68816f, 15.5298f)
            curveTo(5.68124f, 15.6723f, 3.23089f, 18.0974f, 3f, 21f)
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
            moveTo(12.75f, 9.75f)
            curveTo(12.75f, 11.5449f, 11.2949f, 13f, 9.5f, 13f)
            curveTo(7.70508f, 13f, 6.25f, 11.5449f, 6.25f, 9.75f)
            curveTo(6.25f, 7.95507f, 7.70508f, 6.5f, 9.5f, 6.5f)
            curveTo(11.2949f, 6.5f, 12.75f, 7.95507f, 12.75f, 9.75f)
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
            moveTo(21f, 17.501f)
            curveTo(20.7709f, 14.6314f, 18.4541f, 12.2748f, 15.5f, 11.9961f)
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
            moveTo(15.9877f, 9f)
            curveTo(16.8965f, 8.42434f, 17.5001f, 7.40788f, 17.5001f, 6.25f)
            curveTo(17.5001f, 4.45507f, 16.0496f, 3f, 14.2602f, 3f)
            curveTo(13.3811f, 3f, 12.5838f, 3.35121f, 12.0001f, 3.92139f)
        }
        }.build()

        return _userMultiple!!
    }

private var _userMultiple: ImageVector? = null
