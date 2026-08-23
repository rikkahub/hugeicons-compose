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

val HugeIcons.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = ImageVector.Builder(
            name = "User",
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
            moveTo(20f, 21.0001f)
            curveTo(19.713f, 17.269f, 16.7289f, 14.3151f, 12.995f, 14.0662f)
            lineTo(12f, 13.9999f)
            curveTo(11.6446f, 14.0096f, 11.3134f, 14.0225f, 11.0008f, 14.0378f)
            curveTo(7.3f, 14.2192f, 4.28417f, 17.3057f, 4f, 21.0001f)
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
            moveTo(16f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 8f, 6.99988f)
            arcTo(4f, 4f, 0f, true, false, 16f, 6.99988f)
            close()
        }
        }.build()

        return _user!!
    }

private var _user: ImageVector? = null
