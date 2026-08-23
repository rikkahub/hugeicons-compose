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

val HugeIcons.UserKey: ImageVector
    get() {
        if (_userKey != null) {
            return _userKey!!
        }
        _userKey = ImageVector.Builder(
            name = "UserKey",
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
            moveTo(15.5f, 18f)
            lineTo(20f, 13.5f)
            moveTo(19f, 15f)
            lineTo(20f, 16f)
            moveTo(16f, 19.5f)
            curveTo(16f, 20.6046f, 15.1046f, 21.5f, 14f, 21.5f)
            curveTo(12.8954f, 21.5f, 12f, 20.6046f, 12f, 19.5f)
            curveTo(12f, 18.3954f, 12.8954f, 17.5f, 14f, 17.5f)
            curveTo(15.1046f, 17.5f, 16f, 18.3954f, 16f, 19.5f)
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
            moveTo(14f, 6f)
            arcTo(3.5f, 3.5f, 0f, true, false, 7f, 6f)
            arcTo(3.5f, 3.5f, 0f, true, false, 14f, 6f)
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
            moveTo(4f, 18.4999f)
            verticalLineTo(16.4703f)
            curveTo(4f, 15.2279f, 4.55927f, 14.0098f, 5.68968f, 13.4945f)
            curveTo(7.0685f, 12.8659f, 8.72212f, 12.4999f, 10.5f, 12.4999f)
            curveTo(11.9418f, 12.4999f, 13.3019f, 12.7406f, 14.5f, 13.1669f)
        }
        }.build()

        return _userKey!!
    }

private var _userKey: ImageVector? = null
